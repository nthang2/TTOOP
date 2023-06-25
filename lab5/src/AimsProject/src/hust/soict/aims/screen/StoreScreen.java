package AimsProject.src.hust.soict.aims.screen;

import AimsProject.src.hust.soict.aims.store.*;
import AimsProject.src.hust.soict.aims.cart.*;
import AimsProject.src.hust.soict.aims.exception.*;
import AimsProject.src.hust.soict.aims.media.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class StoreScreen extends JFrame {
	private Store store;
	private Cart cart;

	public static void main(String[] args) throws Exception {

		Store myStore = new Store();
		Cart myCart = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		Track track1 = new Track("Track1", 43);
		Track track2 = new Track("Track2", 432);
		Track track3 = new Track("Track3");
		CompactDisc cd1 = new CompactDisc("Allstars", "Yes", "Smash Mouth", "Dunno", 69.420f);
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		CompactDisc cd2 = new CompactDisc("Allstars 2", "Yes", "Smash Mouth", "Dunno", 69.420f);
		cd2.addTrack(track1);
		cd2.addTrack(track3);
		cd2.addTrack(track2);
		Book book1 = new Book("Sherlock Holmes", "Detective", 420, 5f);
		book1.addAuthor("Conan Doyle");
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Spiderman 1", "Super Hero", "Marvel", 90, 543.5f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Spiderman 1", "Super Hero", "Marvel", 90, 543.5f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Spiderman 1", "Super Hero", "Marvel", 90, 543.5f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Spiderman 1", "Super Hero", "Marvel", 90, 543.5f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Spiderman 1", "Super Hero", "Marvel", 90, 543.5f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Spiderman 1", "Super Hero", "Marvel", 90, 543.5f);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("Tom and Jerry", "Cartoon", 128.939f);

		myStore.addMedia(dvd2);
		myStore.addMedia(dvd1);
		myStore.addMedia(dvd3);
		myStore.addMedia(cd1);
		myStore.addMedia(cd2);
		myStore.addMedia(book1);
		myStore.addMedia(dvd4);
		myStore.addMedia(dvd5);
		myStore.addMedia(dvd6);
		myStore.addMedia(dvd7);
		myStore.addMedia(dvd8);
		myStore.addMedia(dvd9);
		myStore.addMedia(dvd10);
		new StoreScreen(myStore, myCart);
	}
	
	public StoreScreen(Store store, Cart cart) {
		this.store = store;
		this.cart = cart;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024,768);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int w = getSize().width;
        int h = getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        setLocation(x,y);
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(5,5,2,2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for (Media media: mediaInStore) {
			MediaStore cell = new MediaStore(media, cart);
			center.add(cell);
		}
		
		return center;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		JMenuItem addBook = new JMenuItem("Add Book");
		addBook.addActionListener(new AddBookListener());
		smUpdateStore.add(addBook);
		JMenuItem addCD = new JMenuItem("Add CD");
		addCD.addActionListener(new AddCDListener());
		smUpdateStore.add(addCD);
		JMenuItem addDVD = new JMenuItem("Add DVD");
		addDVD.addActionListener(new AddDVDListener());
		smUpdateStore.add(addDVD);
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		JMenuItem cart = new JMenuItem("View cart");
		cart.addActionListener(new ViewCartListener());
		menu.add(cart);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cart = new JButton("View cart");
		cart.setPreferredSize(new Dimension(100,50));
		cart.setMaximumSize(new Dimension(100,50));
		cart.addActionListener(new ViewCartListener());
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}
	
	private class ViewCartListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new CartScreen(store, cart);
			dispose();
		}
		
	}
	
	private class AddDVDListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddDVDToStoreScreen(store, cart);
			dispose();
		}
		
	}
	
	private class AddBookListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddBookToStoreScreen(store, cart);
			dispose();
		}
		
	}
	
	private class AddCDListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddCDToStoreScreen(store, cart);
			dispose();
		}
		
	}

}