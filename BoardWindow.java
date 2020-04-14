package application;

import java.util.ArrayList;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BoardWindow extends VBox{
	private BoardController bCon;
	private int boardSize;
	private double xSquareWidth, ySquareHeight;
	private int boardWidth = 800;
	private int boardHeight = 565;
	private int openedSquares;
	private int squaresToOpen;
	private int bombsOpened = 0;
	private boolean stopTimer = false;
	private ArrayList<SquareMaker> tileList = new ArrayList<SquareMaker>(boardSize * boardSize);
	private Menu menu = new Menu("Menu");
	private MenuItem mainMenu = new MenuItem("Main Menu");
	private MenuItem newGame = new MenuItem("New Game");
	private MenuItem howToPlay = new MenuItem("How To Play");
	private Label timer = new Label("00:00");
	
	public BoardWindow(BoardController bCon) {
		this.bCon = bCon;
		
		menu.getItems().add(mainMenu);
		menu.getItems().add(newGame);
		menu.getItems().add(howToPlay);
		menu.setStyle("-fx-font: 20px \"Segoe UI Semibold\";");
		
    	MenuBar MenuBarNew = new MenuBar();
    	MenuBarNew.getMenus().add(menu);
		
		timer.setFont(Font.font("Segoe UI Semibold", 20));
		
		StackPane stack = new StackPane(MenuBarNew, timer);
		
		this.getChildren().addAll(stack, createSquares());
		
		mainMenu.setOnAction(event -> {
			bCon.handle(event);
		});
		
		newGame.setOnAction(event -> {
			bCon.handle(event);
		});
		
		howToPlay.setOnAction(event -> {
			bCon.handle(event);
		});
	}
	
	public Parent createSquares() {
		boardSize = bCon.getBoardSize();
		this.xSquareWidth = this.boardWidth / this.boardSize;
		this.ySquareHeight = this.boardHeight / this.boardSize;
		squaresToOpen = (boardSize * boardSize) - (int) (boardSize * boardSize * 0.20625);
		Pane playable = new Pane();
		playable.setPrefSize(this.boardWidth, this.boardHeight);
		
		int count = 0;
		for (int ycoord = 0; ycoord < this.boardSize; ycoord++) {
			for (int xcoord = 0; xcoord < this.boardSize; xcoord++) {
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
		
		NearbySquares open = new NearbySquares(this.bCon, tileList);
		open.Open(tile.getIndex());
		
		openedSquares = 0;
		for (int i = 0; i < this.tileList.size(); i++) {
			if (tileList.get(i).getOpen()) {
				openedSquares += 1;
			}
		}
		
		if (openedSquares == 1) {
			timerStart();
		}
		
		if (openedSquares == squaresToOpen && bombsOpened == 0) {
			stopTimer = true;
			bCon.handle(true);
		}
		
		if (tile.getSquareContent().getText().contentEquals("B")) {
			bombsOpened += 1;
			stopTimer = true;
			bCon.handle(false);
		}
	}
	
	public void timerStart() {
		final IntegerProperty i = new SimpleIntegerProperty(0);
		Timeline timeline = new Timeline(
				new KeyFrame(
						Duration.seconds(1),
						event -> {
							i.set(i.get() + 1);
							if (!stopTimer) {
								if (i.get() <= 9) {
									timer.setText("00:0" + i.get());
								}
								
								else if (i.get() >= 10 && i.get() < 60) {
									timer.setText("00:" + i.get());
								}
								
								else if ((int) i.get() / 60 >= 1 && (int) i.get() / 60 <= 9) {
									if (i.get() % 60 >= 0 && i.get() % 60 <= 9) {
										timer.setText("0" + i.get() / 60 + ":0" + i.get() % 60);
									}
									else {
										timer.setText("0" + i.get() / 60 + ":" + i.get() % 60);
									}
								}
								else {
									if (i.get() % 60 >= 0 && i.get() % 60 <= 9) {
										timer.setText(+ i.get() / 60 + ":0" + i.get() % 60);
									}
									else {
										timer.setText(+ i.get() / 60 + ":" + i.get() % 60);
									}
								}
							}
							
						}
				)
		);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}
	
	public int getBoardSize() {
		return this.boardSize;
	}
	
	public MenuItem getMainMenu() {
		return mainMenu;
	}
	
	public MenuItem getNewGame() {
		return newGame;
	}
	
	public MenuItem getHowToPlay() {
		return howToPlay;
	}
}
