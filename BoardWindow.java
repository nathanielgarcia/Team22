package application;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BoardWindow extends VBox{
	private BoardController bCon;
	private int squares;
	private double xSquareWidth, ySquareHeight;
	private int boardWidth = 800;
	private int boardHeight = 550;
	private Button testing = new Button("Testing");
	private ArrayList<SquareMaker> tileList = new ArrayList<SquareMaker>(squares * squares);
	private ObservableList<String> menuOptions = FXCollections.observableArrayList("Menu Options", "Main Menu", "New Game", "Highscores");
	private ComboBox<String> menuBar = new ComboBox<String>(menuOptions);
	private Label results = new Label("");
	private Label timer = new Label("00:00     ");
	
	public BoardWindow(BoardController bCon) {
		this.bCon = bCon;
		menuBar.setStyle("-fx-font: 20px \"Segoe UI Semibold\";");
		menuBar.getSelectionModel().selectFirst();
		
		timer.setFont(new Font("Segoe UI Semibold", 25));
    	timer.setTextFill(Color.BLACK);
    	timer.setAlignment(Pos.CENTER_RIGHT);
    	
    	results.setFont(new Font("Segoe UI Black", 25));
    	results.setAlignment(Pos.CENTER);
    	results.setVisible(false);
		
		HBox boardOptions = new HBox(menuBar, results, timer);
		boardOptions.setPrefWidth(800);
		boardOptions.setPrefHeight(50);
		boardOptions.setAlignment(Pos.TOP_CENTER);
		boardOptions.setSpacing(175);
		
		testing.setOnAction(event -> {
			Stage primaryStage = bCon.getPrimaryStage();
			
		});
		
		this.getChildren().addAll(boardOptions, createSquares());
		
	
	}
	
	public Parent createSquares() {
		squares = bCon.getBoardSize();
		this.xSquareWidth = this.boardWidth / this.squares;
		this.ySquareHeight = this.boardHeight / this.squares;
		Pane playable = new Pane();
		playable.setPrefSize(this.boardWidth, this.boardHeight);
		
		int count = 0;
		for (int ycoord = 0; ycoord < this.squares; ycoord++) {
			for (int xcoord = 0; xcoord < this.squares; xcoord++) {
				SquareMaker tile = new SquareMaker(xcoord, ycoord, xSquareWidth, ySquareHeight, (String) bCon.getBoardContents().get(count), count, this);
				tileList.add(tile);
				playable.getChildren().add(tile);
				count++;
			}
		}
		return playable;
	}
	
	public void clickedSquare(SquareMaker tile) {
		tile.setOpen(true);
		tile.getSquareContent().setVisible(true);
		tile.getSquareLayout().setFill(Color.GHOSTWHITE);
		NearbySquares open = new NearbySquares(this, this.bCon, tile, tileList);
		open.Open(tile.getIndex());
	}
	
	public void setResults(String text, Color colour) {
		results.setText(text);
		results.setTextFill(colour);
		results.setVisible(true);
	}
	
	public int getBoardSize() {
		return this.squares;
	}
	
	public Button getButton() {
		return testing;
	}
}
