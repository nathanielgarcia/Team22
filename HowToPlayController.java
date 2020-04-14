package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HowToPlayController implements EventHandler<ActionEvent>{
	private Stage primaryStage;
	private boolean inGame;
	private int boardSize;
	private ArrayList<Object> boardContents;
	private HowToPlayWindow window;
	
	public HowToPlayController(final Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	public void initData(boolean inGame) {
		this.inGame = inGame;
		window = new HowToPlayWindow(this);
	}
	
	public void initData(boolean inGame, int size, ArrayList<Object> boardContents) {
		this.inGame = inGame;
		this.boardSize = size;
		this.boardContents = boardContents;
		window = new HowToPlayWindow(this);
	}
	
	@Override
	public void handle(ActionEvent click) {
		Object source = click.getSource();
		
		if (source.equals(window.getButton())){
			if (this.inGame) {
				try {
					Stage primaryStage = this.primaryStage;
					BoardController bCon = new BoardController(primaryStage);
					bCon.initData(this.boardSize, this.boardContents);
					Scene boardScene = new Scene(bCon.getWindow(), 800, 600);
					primaryStage.setScene(boardScene);
				}
				catch (Exception e) {
					
				}
			}
			else {
				final Stage primaryStage = this.primaryStage;
				final MenuController mCon = new MenuController(primaryStage);
				final Scene scene = new Scene(mCon.getWindow());
				primaryStage.setScene(scene);
			}
		}
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public HowToPlayWindow getWindow() {
		return window;
	}
	
	public boolean getInGame() {
		return inGame;
	}
	
	public int getBoardSize() {
		return boardSize;
	}
	
	public ArrayList<Object> getBoardContents(){
		return boardContents;
	}
}
