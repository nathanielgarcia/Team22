package application;
import java.util.ArrayList;
import java.util.Random;

public class Bombs extends Lower{
	private int numOfBombs;
	private ArrayList coords = new ArrayList(this.numOfBombs * 2); 
	
	public Bombs(int aLevel) {
		super(aLevel);
		this.numOfBombs = super.getRowSize() * 2;
	}
	
	public int getNumOfBombs() {
		return numOfBombs;
	}
	
	public ArrayList BombMaker() {//Randomly generate coordinates for all the bombs
		Random rand = new Random();
		int width = rand.nextInt(super.getRowSize()) + 1;
		int height = rand.nextInt(super.getRowSize()) + 1;
		
		coords.add(width);
		coords.add(height);
		
		boolean check = true;

		for (int count = 1; count < numOfBombs; count++) {
			check = true;
			width = rand.nextInt(super.getRowSize()) + 1;
			height = rand.nextInt(super.getRowSize()) + 1;

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
}
