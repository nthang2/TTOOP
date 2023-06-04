package aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < 20) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("Add disc successful" );
		}
		else {
			System.out.print("Disc is full");
		}
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if ((itemsOrdered[i] == disc)) {
				itemsOrdered[i] = null ; 
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				itemsOrdered[qtyOrdered-1] = null;
				qtyOrdered -= 1;
			}
		}
		System.out.println("remove successfull");
		System.out.println("new itemsOdered is: " );
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i]);
		}
	}
	
	public void totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		System.out.println(total);
	}
}
