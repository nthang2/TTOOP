package AimsProject.src.hust.soict.aims.media;

import AimsProject.src.hust.soict.aims.cart.*;

import java.time.LocalDate;
import java.util.Comparator;
public abstract class Media {
	private int id;
	private String title;
	private String category;
	private float cost;
	private LocalDate dateAdded;
	private static int nbMedia = 1;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public Media(String title) {
		this.title = title;
		this.id = nbMedia;
		nbMedia += 1;
	}
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbMedia;
		nbMedia += 1;
	}
	
	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbMedia;
		nbMedia += 1;
	}
	public Media(String title,String category) {
		this.title = title;
		this.category = category;
		this.id = nbMedia;
		nbMedia += 1;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean search(String title) {
		return this.title.toLowerCase().contains(title.toLowerCase());
	}
	
	public void setDateAdded(LocalDate date) {
		this.dateAdded = date;
	}
	
	public LocalDate getDateAdded() {
		return dateAdded;
	}
	
	public abstract String getType();
	
	public abstract String getDetails();
	
	public boolean equals(Object medium) {
		if (medium instanceof Media) {
			try {
				Media that = (Media) medium;
				return this.title.toLowerCase().equals(that.getTitle().toLowerCase());
			} catch (NullPointerException e1) {
				return false;
			} catch (ClassCastException e2) {
				return false;
			}
		} else {
			return false;
		}
	}
	
}
