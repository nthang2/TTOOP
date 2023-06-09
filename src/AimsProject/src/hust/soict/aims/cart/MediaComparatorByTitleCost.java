package AimsProject.src.hust.soict.aims.cart;

import java.util.*;
import AimsProject.src.hust.dsai.aims.media.Media;
public class MediaComparatorByTitleCost implements Comparator<Media>{

	public int compare(Media m1, Media m2) {
        return Comparator.comparing(Media::getTitle)
                .thenComparingDouble(Media::getCost)
                .compare(m1, m2);
    }
}