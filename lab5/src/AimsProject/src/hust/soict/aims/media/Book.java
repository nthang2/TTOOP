package AimsProject.src.hust.dsai.aims.media;

import java.util.*;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	private int contentLength;
	
	public Book(String title, String category, int contentLength, float cost) {
		super(title, category, cost);
		this.contentLength = contentLength;
	}

	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}

	public Book(String title, String category) {
		super(title, category);
	}

	public Book(String title) {
		super(title);
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	
	public void addAuthor(String authorName) {
		authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		authors.remove(authorName);
	}
	
}
