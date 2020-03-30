package application;
import java.util.ArrayList;

public class Grids extends Player{
	private ArrayList row1 = new ArrayList(super.getRowSize());
	private ArrayList row2 = new ArrayList(super.getRowSize());
	private ArrayList row3 = new ArrayList(super.getRowSize());
	private ArrayList row4 = new ArrayList(super.getRowSize());
	private ArrayList row5 = new ArrayList(super.getRowSize());
	private ArrayList row6 = new ArrayList(super.getRowSize());
	private ArrayList row7 = new ArrayList(super.getRowSize());
	private ArrayList row8 = new ArrayList(super.getRowSize());
	private ArrayList row9 = new ArrayList(super.getRowSize());
	private ArrayList row10 = new ArrayList(super.getRowSize());
	private ArrayList row11 = new ArrayList(super.getRowSize());
	private ArrayList row12 = new ArrayList(super.getRowSize());
	private ArrayList<ArrayList> allLowerRows = new ArrayList<ArrayList>(super.getRowSize());
	private ArrayList<ArrayList> allUpperRows = new ArrayList<ArrayList>(super.getRowSize());
	private ArrayList rough = new ArrayList();
	
	public Grids(int aLevel) {
		super(aLevel);
	}
	public ArrayList getLowerBoard() {
		return allLowerRows;
	}
	
	public ArrayList getUpperBoard() {
		return allUpperRows;
	}
	
	public void createLowerBoard(ArrayList rough) {		
			String hold;

			if (super.getRowSize() >= 6) {
				for (int i = 0; i < super.getRowSize(); i++) {
					hold = (String)rough.get(i);
					row1.add(hold);
				}

				for (int i = super.getRowSize(); i < super.getRowSize() * 2; i++) {
					hold = (String)rough.get(i);
					row2.add(hold);
				}

				for (int i = super.getRowSize() * 2; i < super.getRowSize() * 3; i++) {
					hold = (String)rough.get(i);
					row3.add(hold);
				}

				for (int i = super.getRowSize() * 3; i < super.getRowSize() * 4; i++) {
					hold = (String)rough.get(i);
					row4.add(hold);
				}

				for (int i = super.getRowSize() * 4; i < super.getRowSize() * 5; i++) {
					hold = (String)rough.get(i);
					row5.add(hold);
				}

				for (int i = super.getRowSize() * 5; i < super.getRowSize() * 6; i++) {
					hold = (String)rough.get(i);
					row6.add(hold);
				}
				allLowerRows.add(row1);
				allLowerRows.add(row2);
				allLowerRows.add(row3);
				allLowerRows.add(row4);
				allLowerRows.add(row5);
				allLowerRows.add(row6);
			}
				
			if (super.getRowSize() >= 9) {
				for (int i = super.getRowSize() * 6; i < super.getRowSize() * 7; i++) {
					hold = (String)rough.get(i);
					row7.add(hold);
				}
				
				for (int i = super.getRowSize() * 7; i < super.getRowSize() * 8; i++) {
					hold = (String)rough.get(i);
					row8.add(hold);
				}
				
				for (int i = super.getRowSize() * 8; i < super.getRowSize() * 9; i++) {
					hold = (String)rough.get(i);
					row9.add(hold);
				}
				allLowerRows.add(row7);
				allLowerRows.add(row8);
				allLowerRows.add(row9);
			}
			
			if (super.getRowSize() >= 12) {
				for (int i = super.getRowSize() * 9; i < super.getRowSize() * 10; i++) {
					hold = (String)rough.get(i);
					row10.add(hold);
				}
				
				for (int i = super.getRowSize() * 10; i < super.getRowSize() * 11; i++) {
					hold = (String)rough.get(i);
					row11.add(hold);
				}
				
				for (int i = super.getRowSize() * 11; i < super.getRowSize() * 12; i++) {
					hold = (String)rough.get(i);
					row12.add(hold);
				}
				allLowerRows.add(row10);
				allLowerRows.add(row11);
				allLowerRows.add(row12);
			}
	}
	
	public void createUpperBoard(ArrayList rough) {		
		String hold;
		if (super.getRowSize() >= 6) {
			for (int i = 0; i < super.getRowSize(); i++) {
				hold = (String)rough.get(i);
				row1.add(hold);
			}

			for (int i = super.getRowSize(); i < super.getRowSize() * 2; i++) {
				hold = (String)rough.get(i);
				row2.add(hold);
			}

			for (int i = super.getRowSize() * 2; i < super.getRowSize() * 3; i++) {
				hold = (String)rough.get(i);
				row3.add(hold);
			}

			for (int i = super.getRowSize() * 3; i < super.getRowSize() * 4; i++) {
				hold = (String)rough.get(i);
				row4.add(hold);
			}

			for (int i = super.getRowSize() * 4; i < super.getRowSize() * 5; i++) {
				hold = (String)rough.get(i);
				row5.add(hold);
			}

			for (int i = super.getRowSize() * 5; i < super.getRowSize() * 6; i++) {
				hold = (String)rough.get(i);
				row6.add(hold);
			}
			allUpperRows.add(row1);
			allUpperRows.add(row2);
			allUpperRows.add(row3);
			allUpperRows.add(row4);
			allUpperRows.add(row5);
			allUpperRows.add(row6);
		}
			
		if (super.getRowSize() >= 9) {
			for (int i = super.getRowSize() * 6; i < super.getRowSize() * 7; i++) {
				hold = (String)rough.get(i);
				row7.add(hold);
			}
			
			for (int i = super.getRowSize() * 7; i < super.getRowSize() * 8; i++) {
				hold = (String)rough.get(i);
				row8.add(hold);
			}
			
			for (int i = super.getRowSize() * 8; i < super.getRowSize() * 9; i++) {
				hold = (String)rough.get(i);
				row9.add(hold);
			}
			allUpperRows.add(row7);
			allUpperRows.add(row8);
			allUpperRows.add(row9);
		}
		
		if (super.getRowSize() >= 12) {
			for (int i = super.getRowSize() * 9; i < super.getRowSize() * 10; i++) {
				hold = (String)rough.get(i);
				row10.add(hold);
			}
			
			for (int i = super.getRowSize() * 10; i < super.getRowSize() * 11; i++) {
				hold = (String)rough.get(i);
				row11.add(hold);
			}
			
			for (int i = super.getRowSize() * 11; i < super.getRowSize() * 12; i++) {
				hold = (String)rough.get(i);
				row12.add(hold);
			}
			allUpperRows.add(row10);
			allUpperRows.add(row11);
			allUpperRows.add(row12);
		}
	}
}
