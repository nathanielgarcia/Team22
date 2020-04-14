package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class GUIGame extends Application {
	private GameConfiguration bDet;
	private int boardSize;
	private boolean gameOver;
	private ArrayList<Object> boardContents = new ArrayList<Object>();
	
	public GUIGame() {
		bDet = new GameConfiguration(this);
		gameOver = false;
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Scene scene = new Scene(new MenuController(primaryStage).getWindow(), 500, 350);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void setBoardContents(ArrayList<Object> contents) {
		this.boardContents = contents;
	}
	
	public ArrayList<Object> getBoardContents(){
		return this.boardContents;
	}
	
	public void setBoardSize(int size) {
		this.boardSize = size;
		bDet = new GameConfiguration(this);
	}
	
	public int getBoardSize() {
		return this.boardSize;
	}
	
	public GameConfiguration getConfig() {
		return this.bDet;
	}
	
	public void initialize() {
		
	}
}
