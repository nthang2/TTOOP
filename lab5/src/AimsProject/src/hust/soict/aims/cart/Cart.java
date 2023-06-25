package AimsProject.src.hust.soict.aims.cart;

import java.util.*;

import javax.naming.LimitExceededException;

import AimsProject.src.hust.soict.aims.exception.*;
import AimsProject.src.hust.soict.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    // add media into itemsOrdered
	public void addMedia(Media medium) throws CartFullException {
		if (this.itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			throw new CartFullException("The cart is full.");
		} else {
			this.itemsOrdered.add(medium);
			System.out.println(medium.getTitle() + " has beed added to the cart.");
		}
	}
	
	public void removeMedia(Media medium) throws NonExistingItemException {
		if (this.itemsOrdered.remove(medium)) {
			System.out.println(medium.getTitle() + " has been removed from the cart.");
		} else {
			throw new NonExistingItemException(medium.getTitle() + " is not in the cart.");
		}
	}

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // show title of every media in cart
    public void showCart() {
        for(int i = 1; i<= itemsOrdered.size(); i++) {
            System.out.println(i+" "+itemsOrdered.get(i-1).getTitle());
        }
    }

    // search dvd by title
    public void searchByID(int id) {
        boolean match = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found a match: " + media.toString());
                match = true;
                break;
            }
        }
        if (!match) {
            System.out.println("No match found.");
        }
    }
    
    public void searchByTitle(String title) {
        boolean match = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Found a match: " + media.toString());
                match = true;
                break;
            }
        }
        if (!match) {
            System.out.println("No match found.");
        }
           
    }

    public void printCart() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i=0; i<itemsOrdered.size(); i++) {
    		System.out.println((i+1) + "." + itemsOrdered.get(i).toString());
    	}
    	System.out.println("Total cost: " + totalCost() + "$");
    	System.out.println("***************************************************");
    }

    public void sortByTitle() {
		Collections.sort(this.itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByCost() {
		Collections.sort(this.itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
	
	public int getSize() {
		return this.itemsOrdered.size();
	}
	
	public Media searchMedia(String title) {
		for (Media medium: this.itemsOrdered) {
			if (medium.getTitle().toLowerCase().equals(title.toLowerCase())) {
				return medium;
			}
		}
		return null;
	}
	
	public ObservableList<Media> getItemsOrdered() {
		return this.itemsOrdered;
	}
	
	public boolean filterMedia(int id) {
		boolean found = false;
		int qty = 0;
		float cost = 0f;
		System.out.println("\n******************SEARCH RESULT********************");
		System.out.println("Product ID: " + id);
		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			if (this.itemsOrdered.get(i).getId() == id) {
				System.out.println(Integer.toString(i+1) + "." + "\t" + this.itemsOrdered.get(i).getDetails() + "\n");
				qty += 1;
				cost = this.itemsOrdered.get(i).getCost();
				found = true;
			}
		}
		if (found) {
			System.out.println("Total number of product " + id + " found: " + qty);
			System.out.println("Total cost for these product: " + "$" + (cost*qty));
			System.out.println("***************************************************");
			System.out.println("\n");
			return true;
		} else {
			System.out.println("Such product is not in the cart");
			System.out.println("***************************************************");
			System.out.println("\n");
			return false;
		}
	}
	
	public boolean filterMedia(String title) {
		boolean found = false;
		int qty = 0;
		float cost = 0f;
		System.out.println("\n******************SEARCH RESULT********************");
		System.out.println("Product title: " + title);
		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			if (this.itemsOrdered.get(i).search(title)) {
				System.out.println(Integer.toString(i+1) + "." + "\t" + this.itemsOrdered.get(i).getDetails() + "\n");
				qty += 1;
				cost = this.itemsOrdered.get(i).getCost();
				found = true;
			}
		}
		if (found) {
			System.out.println("Total number of product " + title + " found: " + qty);
			System.out.println("Total cost for these product: " + "$" + (cost*qty));
			System.out.println("***************************************************");
			System.out.println("\n");
			return true;
		} else {
			System.out.println("Such product is not in the cart");
			System.out.println("***************************************************");
			System.out.println("\n");
			return false;
		}
	}
	
	
	public void empty() {
		this.itemsOrdered.clear();
	}
}
