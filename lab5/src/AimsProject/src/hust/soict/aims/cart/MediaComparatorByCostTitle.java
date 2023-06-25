package AimsProject.src.hust.soict.aims.cart;

import java.util.Comparator;

import AimsProject.src.hust.soict.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	public int compare(Media m1, Media m2) {
        return Comparator.comparingDouble(Media::getCost)
                .thenComparing(Media::getTitle)
                .compare(m1, m2);
	}

}
