import java.util.Random;
import java.util.ArrayList;

public class Bombs1 extends Grids{
	private int numOfBombs;
	private int rowsize;
	private ArrayList coords = new ArrayList(); 
	
	public Bombs1() {
			this.numOfBombs = 12;
			this.rowsize = 6;
		
	}
	public int getRowSize() {
		return rowsize;
	}
	
	public ArrayList Bombs() {//Randomly generate coordinates for all the bombs
		int[] allowed = new int[] {1, 2, 3, 4, 5, 6};
		Random rand = new Random();
		int width = allowed[rand.nextInt(rowsize)];
		int height = allowed[rand.nextInt(rowsize)];
		coords.add(width);
		coords.add(height);
		boolean check = true;

		for (int count = 1; count < numOfBombs; count++) {
			check = true;
			width = allowed[rand.nextInt(rowsize)];
			height = allowed[rand.nextInt(rowsize)];
			
			for (int index = 0; index < coords.size(); index += 2) {
				if (width == (int)coords.get(index)) {
					if (height == (int)coords.get(index + 1)){
						check = false;
						count--;
					}
				}
				
			}
			if (check == true){
				coords.add(width);
				coords.add(height);
			}
		}
		return coords;

	}
	
	public ArrayList numbers(ArrayList coords, char type) {
		for (int i = 0; i < (rowsize * rowsize); i++) {
			
			if (coords.get(i) == "[ ]") {
				int num = 0;
				
				if (type == 'N') {
					if (i == 0) {
						if (coords.get(i + 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 6) == "[B]") {
							num++;
						}
						if (coords.get(i + 7) == "[B]") {
							num++;
						}
					}
					else if (i == 5) {
						if (coords.get(i - 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 5) == "[B]") {
							num++;
						}
						if (coords.get(i + 6) == "[B]") {
							num++;
						}
					}
					else if (i == 30) {
						if (coords.get(i + 1) == "[B]") {
							num++;
						}
						if (coords.get(i - 6) == "[B]") {
							num++;
						}
						if (coords.get(i - 5) == "[B]") {
							num++;
						}
					}
					else if (i == 35) {
						if (coords.get(i - 1) == "[B]") {
							num++;
						}
						if (coords.get(i - 6) == "[B]") {
							num++;
						}
						if (coords.get(i - 7) == "[B]") {
							num++;
						}
					}
					else if (i == 1 || i == 2 || i == 3 || i == 4) {
						if (coords.get(i - 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 5) == "[B]") {
							num++;
						}
						if (coords.get(i + 6) == "[B]") {
							num++;
						}
						if (coords.get(i + 7) == "[B]") {
							num++;
						}
					}
					else if (i == 6 || i == 12 || i == 18 || i == 24) {
						if (coords.get(i - 6) == "[B]") {
							num++;
						}
						if (coords.get(i - 5) == "[B]") {
							num++;
						}
						if (coords.get(i + 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 6) == "[B]") {
							num++;
						}
						if (coords.get(i + 7) == "[B]") {
							num++;
						}
					}
					else if (i == 11 || i == 17 || i == 23 || i == 29) {
						if (coords.get(i - 6) == "[B]") {
							num++;
						}
						if (coords.get(i - 7) == "[B]") {
							num++;
						}
						if (coords.get(i - 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 6) == "[B]") {
							num++;
						}
						if (coords.get(i + 5) == "[B]") {
							num++;
						}
					}
					else if (i == 31 || i == 32 || i == 33 || i == 34) {
						if (coords.get(i - 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 1) == "[B]") {
							num++;
						}
						if (coords.get(i - 5) == "[B]") {
							num++;
						}
						if (coords.get(i - 6) == "[B]") {
							num++;
						}
						if (coords.get(i - 7) == "[B]") {
							num++;
						}
					}
					else {
						if (coords.get(i - 7) == "[B]") {
							num++;
						}
						if (coords.get(i - 6) == "[B]") {
							num++;
						}
						if (coords.get(i - 5) == "[B]") {
							num++;
						}
						if (coords.get(i - 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 1) == "[B]") {
							num++;
						}
						if (coords.get(i + 5) == "[B]") {
							num++;
						}
						if (coords.get(i + 6) == "[B]") {
							num++;
						}
						if (coords.get(i + 7) == "[B]") {
							num++;
						}
					}
				}
				if (num != 0) {
					String inp = ("["+num+"]");
					coords.set(i, inp);
				}
				
			}
		}
		return coords;
	}

}