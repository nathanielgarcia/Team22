import java.util.ArrayList;

public class Grids extends Player{
	private ArrayList row1 = new ArrayList(6);
	private ArrayList row2 = new ArrayList(6);
	private ArrayList row3 = new ArrayList(6);
	private ArrayList row4 = new ArrayList(6);
	private ArrayList row5 = new ArrayList(6);
	private ArrayList row6 = new ArrayList(6);
	private ArrayList<ArrayList> allRows = new ArrayList<ArrayList>(6);
	private ArrayList rough = new ArrayList();
	private Lower lower;
	private Upper upper;
	private Grids board;
	private char type;
	
	public ArrayList<ArrayList> getallRows() {
		return allRows;
	}
	
	public void Grids(char level) {
		this.type = level;
		lower = new Lower(this.type);
		upper = new Upper(this.type);
		
	}
	public ArrayList setLowerBoard() {
		rough = lower.createLowerBoard();
		
		if (type == 'N') {
			String hold;
			for (int i = 0; i < 6; i++) {
				hold = (String)rough.get(i);
				row1.add(hold);
			}
			for (int i = 6; i < 12; i++) {
				hold = (String)rough.get(i);
				row2.add(hold);
			}
			for (int i = 12; i < 18; i++) {
				hold = (String)rough.get(i);
				row3.add(hold);
			}
			for (int i = 18; i < 24; i++) {
				hold = (String)rough.get(i);
				row4.add(hold);
			}
			for (int i = 24; i < 30; i++) {
				hold = (String)rough.get(i);
				row5.add(hold);
			}
			for (int i = 30; i < 36; i++) {
				hold = (String)rough.get(i);
				row6.add(hold);
			}
			allRows.add(row1);
			allRows.add(row2);
			allRows.add(row3);
			allRows.add(row4);
			allRows.add(row5);
			allRows.add(row6);
			
		}
		else if (type == 'I') {
			//9
			
		}
		
		else {//12
			
		}
		return allRows;
		
	}
	public ArrayList setUpperBoard() {
		rough = upper.createUpperBoard();
		
		if (type == 'N') {
			String hold;
			for (int i = 0; i < 6; i++) {
				hold = (String)rough.get(i);
				row1.add(hold);
			}
			for (int i = 6; i < 12; i++) {
				hold = (String)rough.get(i);
				row2.add(hold);
			}
			for (int i = 12; i < 18; i++) {
				hold = (String)rough.get(i);
				row3.add(hold);
			}
			for (int i = 18; i < 24; i++) {
				hold = (String)rough.get(i);
				row4.add(hold);
			}
			for (int i = 24; i < 30; i++) {
				hold = (String)rough.get(i);
				row5.add(hold);
			}
			for (int i = 30; i < 36; i++) {
				hold = (String)rough.get(i);
				row6.add(hold);
			}
			allRows.add(row1);
			allRows.add(row2);
			allRows.add(row3);
			allRows.add(row4);
			allRows.add(row5);
			allRows.add(row6);
			
		}
		else if (type == 'I') {
			//9
			
		}
		
		else {//12
			
		}
		return allRows;
		
	}
		
	public ArrayList getBoard() {
		ArrayList c = new ArrayList();
		return c;
	}

}
