import java.util.ArrayList;

public class Upper extends Grids{
	private char type;
	private ArrayList<String> bombSquad = new ArrayList<String>(36);
	
	public Upper(char level) {
		this.type = level;
	}
	
	//public ArrayList createBoard() {
		//this.bombSquad = bombSquad;
		//return bombSquad;
	//}

	public ArrayList createUpperBoard() {
		for (int i = 0; i < 36; i++){
			bombSquad.add("[ ]");
		}
		return bombSquad;
	}


}