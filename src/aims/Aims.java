package aims;

public class Aims {
	public static void main(String[] args) {
		Cart anorder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King", "Animationn", "Roger", 88, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animationnn", "Roger", 89, 18.99f);
//		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animationnnn", "Roger", 90, 79.95f);
//		DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King", "Animationnnnn", "Roger", 91, 89.95f);
//		DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Lion King", "Animationnnnnn", "Roger", 92, 69.95f);
//		
		anorder.addDigitalVideoDisc(dvd1);
		anorder.addDigitalVideoDisc(dvd2);
		anorder.addDigitalVideoDisc(dvd3);
//		anorder.addDigitalVideoDisc(dvd4);
//		anorder.addDigitalVideoDisc(dvd5);
//		anorder.addDigitalVideoDisc(dvd6);
//		anorder.removeDigitalVideoDisc(dvd3);
		anorder.totalCost();
	}
}
