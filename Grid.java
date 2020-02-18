import java.util.ArrayList;

//This is the grid that the player sees until they click on something
//This grid gives nothing away and serves only to block the actual contents of the lists
public class Grid {
	private ArrayList row1 = new ArrayList(6);
	private ArrayList row2 = new ArrayList(6);
	private ArrayList row3 = new ArrayList(6);
	private ArrayList row4 = new ArrayList(6);
	private ArrayList row5 = new ArrayList(6);
	private ArrayList row6 = new ArrayList(6);
	private ArrayList<ArrayList> rows = new ArrayList<ArrayList>(6);
	
	public Grid() {
		rows.add(row1);
		rows.add(row2);
		rows.add(row3);
		rows.add(row4);
		rows.add(row5);
		rows.add(row6);
		
		for (int i = 0; i < 6; i++) { //runs through each of the many rows 1-6
			for (int j = 0; j < 6; j++) {//runs through each space in the row
				rows.get(i).add("[ ]");
			}
		}
		System.out.println(rows.get(0));
		System.out.println(rows.get(1));
		System.out.println(rows.get(2));
		System.out.println(rows.get(3));
		System.out.println(rows.get(4));
		System.out.println(rows.get(5));
	}

}
