package application;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MenuWindow extends VBox{
    private Button advancedButton = new Button("Advanced");
    private Button intermediateButton = new Button("Intermediate");
    private Button noviceButton = new Button("Novice");
    private Button howToPlayButton = new Button("How To Play");
    private Label title = new Label("MINESWEEPER");
    private Image image = new Image("TimeWarpBackground.jpg");
    private ImageView menuBackground = new ImageView(image);
    
    public MenuWindow(MenuController mCon) {
    	menuBackground.setFitWidth(500);
    	menuBackground.setFitHeight(350);
    	
    	title.setFont(new Font("Segoe UI Black", 50));
    	title.setTextFill(Color.GAINSBORO);
    	
    	HBox titleHBox = new HBox(title);
    	titleHBox.setAlignment(Pos.TOP_CENTER);
    	
    	noviceButton.setOnAction(mCon);
    	noviceButton.setFont(new Font("Segoe UI Semibold", 15));
    	noviceButton.setTextFill(Color.GAINSBORO);
    	noviceButton.setStyle("-fx-border-color: #000000");
    	noviceButton.setStyle("-fx-background-color: #000000");
    	
    	intermediateButton.setOnAction(mCon);
    	intermediateButton.setFont(new Font("Segoe UI Semibold", 15));
    	intermediateButton.setTextFill(Color.GAINSBORO);
    	intermediateButton.setStyle("-fx-border-color: #000000");
    	intermediateButton.setStyle("-fx-background-color: #000000");
    	
    	advancedButton.setOnAction(mCon);
    	advancedButton.setFont(new Font("Segoe UI Semibold", 15));
    	advancedButton.setTextFill(Color.GAINSBORO);
    	advancedButton.setStyle("-fx-border-color: #000000");
    	advancedButton.setStyle("-fx-background-color: #000000");
    	
    	HBox optionHBox = new HBox(noviceButton, intermediateButton, advancedButton);
    	optionHBox.setAlignment(Pos.CENTER);
    	optionHBox.setSpacing(50);
    	
    	howToPlayButton.setOnAction(mCon);
    	howToPlayButton.setFont(new Font("Segoe UI Semibold", 15));
    	howToPlayButton.setTextFill(Color.GAINSBORO);
    	howToPlayButton.setStyle("-fx-border-color: #000000");
    	howToPlayButton.setStyle("-fx-background-color: #000000");
    	
    	VBox htpBox = new VBox(50);
    	htpBox.getChildren().addAll(optionHBox, howToPlayButton);
    	htpBox.setAlignment(Pos.CENTER);
    	
    	StackPane stack = new StackPane();
    	stack.getChildren().addAll(menuBackground, titleHBox, htpBox);
    	
    	this.getChildren().addAll(stack);    	
    }
    
    public Button getNoviceButton() {
    	return noviceButton;
    }
    
    public Button getIntermediateButton() {
    	return intermediateButton;
    }
    
    public Button getAdvancedButton() {
    	return advancedButton;
    }
    
    public Button getHowToPlayButton() {
    	return howToPlayButton;
    }

}
