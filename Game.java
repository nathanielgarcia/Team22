package application;

import java.util.ArrayList;

public class Game {
	private GameConfiguration config;
	private ArrayList<Object> board = new ArrayList<Object>();
	
	public Game() {
	}
	
	public void setup() {
		BombMaker newBombs = new BombMaker(config.getBoardSize());
		newBombs.addBombs(newBombs.locationMaker());
		board = newBombs.addNumbers();
		config.getGUI().setBoardContents(board);
	}
	
	public ArrayList<Object> getBoard() {
		return board;
	}
	
	public GameConfiguration getGConfig() {
		return config;
	}
	
	public void setGConfig(GameConfiguration config) {
		this.config = config;
	}

}
