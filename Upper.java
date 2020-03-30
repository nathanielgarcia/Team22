package application;
import java.util.ArrayList;

public class Upper extends Grids{
	private ArrayList<String> bombSquad = new ArrayList<String>(super.getGameSpaces());
	
	public Upper(int aLevel) {
		super(aLevel);
	}

	public ArrayList buildUpperBoard() {
		for (int i = 0; i < super.getGameSpaces(); i++){
			bombSquad.add(" ");
		}
		return bombSquad;
	}
}
