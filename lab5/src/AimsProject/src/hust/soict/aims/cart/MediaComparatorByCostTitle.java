package AimsProject.src.hust.soict.aims.cart;

import AimsProject.src.hust.dsai.aims.media.Media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	public int compare(Media m1, Media m2) {
        return Comparator.comparingDouble(Media::getCost)
                .thenComparing(Media::getTitle)
                .compare(m1, m2);
	}

}
