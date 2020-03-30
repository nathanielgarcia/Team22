package application;

public class GameConfiguration {
	private final GUIGame gui;
	private final Game game;
	private int boardSize;
	
	public GameConfiguration(GUIGame GUI) {
		gui = GUI;
		this.boardSize = gui.getBoardSize();
		game = new Game();
		game.setGConfig(this);
	}
	
	public GUIGame getGUI() {
		return this.gui;
	}
	
	public int getBoardSize() {
		return this.boardSize;
	}
	
	public Game getGame() {
		return this.game;
	}
	
	public boolean hasWon() {
		//make a counter that counts how many unopened spaces there are and if 
		//it's equal to the number of bombs, game is won
		//if it's any more, keep going
		//the game will end if someone hits a bomb so it won't matter
		return false;
	}
	
}
