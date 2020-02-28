import java.util.ArrayList;

public class Lower extends Grids{
	public char type;
	public Bombs1 game;
	public int gameSpaces;
	public ArrayList bombSquad = new ArrayList(36);
	
	public Lower(char level) {
		this.type = level;
		this.game = new Bombs1(this.type);
	}
	
	public ArrayList createLowerBoard() {
		ArrayList c = game.Bombs();
		gameSpaces = (int)(game.getRowSize() * game.getRowSize());
		
		for (int i = 0; i < gameSpaces; i++) {
			bombSquad.add("[ ]");
		}
		
		for (int x = 0; x < c.size(); x += 2) {
			int rs = game.getRowSize();
			int y = x + 1;
			int bombLocation = ((int)c.get(x) - 1) * (rs) + ((int)c.get(y) - 1);
			bombSquad.set(bombLocation, "[B]");
		}
		
		bombSquad = game.numbers(bombSquad, type);
		
		return bombSquad;
	}
	
	//public ArrayList getBoard() {
		//game.addBombs();
		//ArrayList c = new ArrayList();
		//return c;
	//}

}
