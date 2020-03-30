package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BoardController implements EventHandler<ActionEvent>{
	private Stage primaryStage;
	private BoardWindow board;
	private int boardSize;
	private ArrayList<Object> boardContents = new ArrayList<Object>(boardSize);
	
	public BoardController(Stage primaryStage) {
		this.primaryStage = primaryStage;
		 
	}
	
	public void initData(int size, ArrayList<Object> boardContents) {
		this.boardSize = size;
		this.boardContents = boardContents;
		board = new BoardWindow(this);
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public BoardWindow getWindow() {
		return board;
	}
	
	public int getBoardSize() {
		return this.boardSize;
	}
	
	public ArrayList<Object> getBoardContents(){
		return this.boardContents;
	}
	
    void initialize() {
        
    }

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
}
