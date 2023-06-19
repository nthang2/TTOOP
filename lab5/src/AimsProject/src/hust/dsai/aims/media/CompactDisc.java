package AimsProject.src.hust.dsai.aims.media;

import java.util.*;
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> Tracks = new ArrayList<Track>();
    
	public CompactDisc(String title, String category, String artist, String director, float cost) {
		super(title, category, director, cost);
		this.artist = artist;
	}
	
	public CompactDisc(String title, String category, String artist, float cost) {
		super(title, category, cost);
		this.artist = artist;
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public CompactDisc(String title, String category) {
		super(title, category);
	}

	public CompactDisc(String title) {
		super(title);
	}
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
    
	
    public void addTrack(Track track) {
    	if (!Tracks.contains(track)) {
    		Tracks.add(track);
    	}
    	
    }
    
    public void removeTrack(Track track) {
    	if (Tracks.contains(track)) {
    		Tracks.remove(getId());
    	}
    }
    
    public int getLength() {
    	int lengthCD = 0;
    	for (Track track : Tracks) {
    		lengthCD += track.getLength();
    	}
    	
    	return lengthCD;
    }

	@Override
	public void play() {
		System.out.println("Playing CD: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("CD Length: " + getLength());

        for (Track track : Tracks) {
            track.play();
        }
		
	}
}
