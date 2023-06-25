package hust.soict.dsai.javafx;


import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.control.ToggleGroup;

public class PainterController {
	
	private boolean pain = true;
	
    @FXML
    private Pane drawingAreaPane;
    
    @FXML
    private ToggleGroup identical;

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	if (pain == true) {
    		Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        	drawingAreaPane.getChildren().add(newCircle);
    	}
    	else {
    		Circle newCircle = new Circle(event.getX(), event.getY(), 10, Color.WHITE);
        	drawingAreaPane.getChildren().add(newCircle);
    	}
    	
    }
    
    @FXML
    void switchToPen(ActionEvent event) {
    	pain = true;
    }
    
    @FXML
    void switchToEraser(ActionEvent event) {
    	pain = false;
    	
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();

    }
    


}
