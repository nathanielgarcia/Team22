// This class deals with the stuff that is in the different cells in the grid
// Will need to be changed(probably), row is used to denote the name of the grid 

import java.util.Random;

public class Bombs {
	public int numOfBombs = 12;
	public int rowsize = 6;
	public int numOfSpace = rowsize * rowsize - numOfBombs;
	public String Bomb = "B";
	//depends on the size of the grid, where each row should have a number of spaces equal to rowsize 
	// Using rowsize = 6 would mean the board is a 6 x 6 grid
	
	Random rand = new Random();
	
	public void bomb() {
		// loop should place bombs equal to the total number of bombs chosen for the game
		for (int count = 0; count < numOfBombs; count ++) {
			int width = rand.nextInt(rowsize);
			int height = rand.nextInt(rowsize);
			String cell = row.get(width).get(height);
			
			if (cell != "B") {
				row.get(width).set(height, "B");
			}
			if (cell == "B") {
				width = rand.nextInt(rowsize);
				height = rand.nextInt(rowsize);
			}
		}
		// loop that should look at every cell and if there is no bomb in the cell, put a blank space into the cell
		for (int count = 0; count < numOfSpace; count++ ) {
			int width = 0;
			int height = 0;
			String cell = row.get(width).get(height);
					
			if (cell != "B") {
				row.get(width).set(height, "");
				height++;
			}
			if (height == rowsize) {
				height = 0;
				width++;
			}
		}
	}

	
	public void numbers() {
		// loop that checks if a cell is a bomb, if not checks all cells around it to determine the number in the cell 
		for (int counter = 0; counter < rowsize; counter++) {
			int num = 0;
			String element = row.get(counter).get(counter);
			
			// a 'blank' cell is denoted using ""
			// should run on every blank cell, and check every cell adjacent to it
			if (element == "") {
				if (row.get(counter-1).get(counter-1) == "B") {
					num++;
				}
				if (row.get(counter-1).get(counter) == "B") {
					num++;
				}
				if (row.get(counter-1).get(counter+1) == "B") {
					num++;
				}
				if (row.get(counter).get(counter-1) == "B") {
					num++;
				}
				if (row.get(counter).get(counter+1) == "B") {
					num++;
				}
				if (row.get(counter+1).get(counter-1) == "B") {
					num++;
				}
				if (row.get(counter+1).get(counter) == "B") {
					num++;
				}
				if (row.get(counter+1).get(counter+1) == "B") {
					num++;
				}
			}
			row.get(counter).set(counter, num);
		}
		
	}
}