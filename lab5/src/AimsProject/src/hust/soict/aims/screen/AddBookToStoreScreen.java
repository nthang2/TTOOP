package AimsProject.src.hust.soict.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import AimsProject.src.hust.soict.aims.cart.Cart;
import AimsProject.src.hust.soict.aims.store.Store;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
	
	public AddBookToStoreScreen(Store store, Cart cart) {
		super(store, cart);
		
		JFrame frame = this;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		this.setTitle("Add book to store");
		this.setVisible(true);
		Platform.runLater(new Runnable() {

			@Override
			public void run() {

				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("/AimsProject/src/hust/soict/aims/screen/addBookToStore.fxml"));
					AddBookToStoreScreenController controller = new AddBookToStoreScreenController(store, cart, frame);
					loader.setController(controller);
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	public static void main(String[] args) {
		new AddBookToStoreScreen(new Store(), new Cart());
	}

}