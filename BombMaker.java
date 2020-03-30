package application;

import java.util.ArrayList;
import java.util.Random;

public class BombMaker extends NumberMaker{
	private int bombCount;
	private ArrayList<Integer> coords = new ArrayList<Integer>(this.bombCount * 2); 
	
	public BombMaker(int BoardSize) {
		super(BoardSize);
		bombCount = (int) ((BoardSize * BoardSize) * 0.20625);
	}
	
	public int getBombCount() {
		return this.bombCount;
	}
	
	public ArrayList<Integer> locationMaker() {
		Random rand = new Random();
		int width = rand.nextInt(super.getBoardSize()) + 1;
		int height = rand.nextInt(super.getBoardSize()) + 1;
		
		coords.add(width);
		coords.add(height);
		
		boolean check = true;

		for (int count = 1; count < bombCount; count++) {
			check = true;
			width = rand.nextInt(super.getBoardSize()) + 1;
			height = rand.nextInt(super.getBoardSize()) + 1;

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
