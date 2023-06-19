package AimsProject.src.hust.soict.aims.store;

import java.util.*;

import AimsProject.src.hust.dsai.aims.media.Media;

public class Store {
    ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added " + media.getTitle() + " to the store.");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)){
            itemsInStore.remove(media);
            System.out.println("Removed " + media.getTitle() + " from the store.");
        }
        else {
        	System.out.println("Item not found in the store.");
        }
    }
    
    public void listItems() {
        System.out.println("Items in store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i+1) + ". " + itemsInStore.get(i).getTitle());
        }
    }
	
	public Media searchMedia(String title) {
		for (Media medium: this.itemsInStore) {
			if (medium.getTitle().toLowerCase().equals(title.toLowerCase())) {
				return medium;
			}
		}
		return null;
	}
	
	public ArrayList<Media> getItemsInStore() {
		return (ArrayList<Media>) this.itemsInStore;
	}
	
	public int getSize() {
		return itemsInStore.size();
	}
}
