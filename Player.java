package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Main{
	private int level;
	private ArrayList row;
	private int rowsize;
	private int gameSpaces;
	
	public Player(int aLevel) {
		if (aLevel == 1 || aLevel == 2 || aLevel == 3) {
			this.level = aLevel;
		}
		if (aLevel == 1) {
			this.rowsize = 6;
			this.gameSpaces = 36;
		}
		
		else if (aLevel == 2) {
			this.rowsize = 9;
			this.gameSpaces = 81;
		}
	
		else if (aLevel == 3) {
			this.rowsize = 12;
			this.gameSpaces = 144;
		}
	}
	
	protected int getRowSize() {
		return rowsize;
	}
	
	protected int getGameSpaces() {
		return gameSpaces;
	}
	
	public void Move(ArrayList lowergrid, ArrayList uppergrid) {
		
		String cell = "";
		Scanner scanrow = new Scanner(System.in);
		System.out.println("Enter Row (1-" + rowsize + ")");
		int RowNum = scanrow.nextInt(); //get row input
		System.out.println("Enter Column (1-" + rowsize + ")");
		int ColumnNum = (scanrow.nextInt()-1);// get column input

		while (cell != "B") {
			System.out.println("Enter Row (1-" + rowsize + ")");
			RowNum = scanrow.nextInt(); //get row input
			System.out.println("Enter Column (1-" + rowsize + ")");
			ColumnNum = (scanrow.nextInt()-1);// get column input
			
			if (this.rowsize >= 6) {
				System.out.println(lowergrid.get(0));
				System.out.println(lowergrid.get(1));
				System.out.println(lowergrid.get(2));
				System.out.println(lowergrid.get(3));
				System.out.println(lowergrid.get(4));
				System.out.println(lowergrid.get(5));
			}
				
			if (this.rowsize >= 9) {
				System.out.println(lowergrid.get(6));
				System.out.println(lowergrid.get(7));
				System.out.println(lowergrid.get(8));
			}
			
			if (this.rowsize >= 12) {
				System.out.println(lowergrid.get(9));
				System.out.println(lowergrid.get(10));
				System.out.println(lowergrid.get(11));
			}

			row = (ArrayList) lowergrid.get(RowNum - 1);
			cell = (String) row.get(ColumnNum);

			// if bomb is in cell you lose
			if (cell == "B") {
				System.out.println("Game Over");
				System.out.println("You have Clicked on a Bomb!");
			}
		}
	}
}
