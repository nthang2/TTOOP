package AimsProject.src.hust.soict.aims.screen;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;

import AimsProject.src.hust.soict.aims.cart.Cart;
import AimsProject.src.hust.soict.aims.exception.*;
import AimsProject.src.hust.soict.aims.media.*;

import AimsProject.src.hust.soict.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class CartScreen extends JFrame {
	private Store store;
	private Cart cart;
	
	public CartScreen(Store store, Cart cart) {
		super();
		
		this.store = store;
		this.cart = cart;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		JFrame frame = this;
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new StoreScreen(store, cart);
				dispose();
			}
		});
		
		Platform.runLater(new Runnable() {

			@Override
			public void run() {

				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/AimsProject/src/hust/soict/aims/screen/cart.fxml"));
					CartScreenController controller = new CartScreenController(store, cart, frame);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public static void main(String args[]) throws Exception {
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 20f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		Track track1 = new Track("Track1", 13);
		Track track2 = new Track("Track2", 21);
		Track track3 = new Track("Track3");
		
		CompactDisc cd1 = new CompactDisc("Iron man", "cartoon", "Tom", "Marvel", 400.3f);
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		Cart myCart = new Cart();
		CompactDisc cd2 = new CompactDisc("Caption America", "Super Hero", "Chris", "Marvel", 93.2f);
		cd2.addTrack(track1);
		cd2.addTrack(track3);
		cd2.addTrack(track2);

		Store myStore = new Store();
		myStore.addMedia(cd2);
		myStore.addMedia(cd1);
		myStore.addMedia(dvd3);
		myStore.addMedia(dvd2);
		myStore.addMedia(dvd1);
		
		
		myCart.addMedia(cd2);
		new CartScreen(myStore, myCart);
	}
}