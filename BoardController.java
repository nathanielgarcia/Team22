package application;

/** The controller for the window that displays the board on which you play.
 * It accommodates three board sizes.
 * @author Team 22
 * @version 3.2
 */

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BoardController implements EventHandler<ActionEvent>{
	private Stage primaryStage;
	private BoardWindow board;
	private int boardSize;
	private ArrayList<Object> boardContents = new ArrayList<Object>(boardSize);
	
	/** The constructor for when the board controller is created.
	 * @param primaryStage The stage for the window.
	 */
	public BoardController(Stage primaryStage) {
		this.primaryStage = primaryStage;	 
	}
	
	/** Passes information into the board window.
	 * @param size The size of the board based on the level.
	 * @param boardContents The contents of the board.
	 */
	public void initData(int size, ArrayList<Object> boardContents) {
		this.boardSize = size;
		this.boardContents = boardContents;
		board = new BoardWindow(this);
	}
	
	@Override
	public void handle(ActionEvent click) {
		Object source = click.getSource();
		
		if (source.equals(board.getMainMenu())) {
			final Stage primaryStage = this.primaryStage;
			final MenuController mCon = new MenuController(primaryStage);
			final Scene scene = new Scene(mCon.getWindow());
			primaryStage.setScene(scene);
		}
		
		else if (source.equals(board.getNewGame())) {
			try {
				final Stage primaryStage = this.primaryStage;
				final MenuController mCon = new MenuController(primaryStage);
				mCon.setBoardSize(this.boardSize);
				mCon.getConfig().getGame().setup();
				initData(mCon.getBoardSize(), mCon.getBoardContents());
				Scene boardScene = new Scene(getWindow(), 800, 600);
				primaryStage.setScene(boardScene);
			
			}
			catch (Exception exc) {
				
			}
		}
		
		else if (source.equals(board.getHowToPlay())) {
			try {
				boolean inGame = true;
				Stage primaryStage = this.primaryStage;
				HowToPlayController htpCon = new HowToPlayController(primaryStage);
				htpCon.initData(inGame, getBoardSize(), getBoardContents());
				Scene scene = new Scene(htpCon.getWindow(), 800, 600);
				primaryStage.setScene(scene);
			}
			catch (Exception exc) {
				
			}
		}
	}
	
	public void handle(boolean results) {
		try {
			Stage secondaryStage = new Stage();
			ResultsCardController rcCon = new ResultsCardController(secondaryStage);
			rcCon.initData(results);
			Scene secondScene = new Scene(rcCon.getWindow(), 500, 350);
			secondaryStage.setScene(secondScene);
			
			secondaryStage.initModality(Modality.WINDOW_MODAL);
			secondaryStage.initOwner(this.primaryStage);
			secondaryStage.setX(this.primaryStage.getX() + 150);
			secondaryStage.setY(this.primaryStage.getY() + 125);

			secondaryStage.show();
		}
		catch (Exception exc) {
			
		}
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
}
