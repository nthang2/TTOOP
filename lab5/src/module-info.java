/**
 * 
 */
/**
 * @author nguyentientrung
 *
 */
module lab5 {
	requires java.desktop;
	requires javafx.base;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.swing;
	requires java.naming;
	opens AimsProject.src.hust.soict.aims.screen to javafx.fxml, javafx.base;
	opens AimsProject.src.hust.soict.aims.media to javafx.base;
	exports AimsProject.src.hust.soict.aims.screen;
	

}