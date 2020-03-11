package application;
import java.util.ArrayList;

public class Lower extends Grids{
	private ArrayList bombSquad = new ArrayList(super.getGameSpaces());
	
	public Lower(int aLevel) {
		super(aLevel);
	}
	
	public ArrayList buildLowerBoard(ArrayList game) {
		return addNumbers(addBombs(game));
	}
	
	public ArrayList addBombs(ArrayList bombs) {
	
		for (int i = 0; i < super.getGameSpaces(); i++) {
			bombSquad.add("[ ]");
		}
		
		for (int x = 0; x < bombs.size(); x += 2) {
			int bombLocation = ((int)bombs.get(x) - 1) * (super.getRowSize()) + ((int)bombs.get(x + 1) - 1);
			bombSquad.set(bombLocation, "[B]");
		}
		return bombSquad;
	}
	
public ArrayList addNumbers(ArrayList coords) {
		
		for (int i = 0; i < (super.getRowSize() * super.getRowSize()); i++) {
			if (coords.get(i) == "[ ]") {
				int num = 0;

					if (i == 0) {

						if (coords.get(i + 1) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize() + 1) == "[B]") {
							num++;
						}
					}

					else if (i == (super.getRowSize() - 1)) {

						if (coords.get(i - 1) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize() - 1) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize()) == "[B]") {
							num++;
						}
					}

					else if (i == (super.getRowSize() * super.getRowSize() - super.getRowSize())) {

						if (coords.get(i + 1) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize() + 1) == "[B]") {
							num++;
						}
					}

					else if (i == super.getRowSize() - 1) {

						if (coords.get(i - 1) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize() - 1) == "[B]") {
							num++;
						}
					}

					else if (i >= 1 && i < super.getRowSize()) {

						if (coords.get(i - 1) == "[B]") {
							num++;
						}

						if (coords.get(i + 1) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize() - 1) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize() + 1) == "[B]") {
							num++;
						}
					}

					else if (i == super.getRowSize() * 1 || i == super.getRowSize() * 2 || i == super.getRowSize() * 3 || i == super.getRowSize() * 4 || i == super.getRowSize() * 5 || i == super.getRowSize() * 6 || i == super.getRowSize() * 7 || i == super.getRowSize() * 8 || i == super.getRowSize() * 9 || i == super.getRowSize() * 10) {

						if (coords.get(i - super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize() + 1) == "[B]") {
							num++;
						}

						if (coords.get(i + 1) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize() + 1) == "[B]") {
							num++;
						}
					}

					else if (i == super.getRowSize() * 1 - 1 || i == super.getRowSize() * 2 - 1 || i == super.getRowSize() * 3 - 1 || i == super.getRowSize() * 4 - 1 || i == super.getRowSize() * 5 - 1 || i == super.getRowSize() * 6 - 1 || i == super.getRowSize() * 7 - 1 || i == super.getRowSize() * 8 - 1 || i == super.getRowSize() * 9 - 1 || i == super.getRowSize() * 10 - 1) {

						if (coords.get(i - super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize() - 1) == "[B]") {
							num++;
						}

						if (coords.get(i - 1) == "[B]") {
							num++;
						}
						try {
							if (coords.get(i + super.getRowSize()) == "[B]") {
								num++;
							}
							
							if (coords.get(i + super.getRowSize() - 1) == "[B]") {
								num++;
							}
						}
						catch (IndexOutOfBoundsException e) {
							
						}
					}

					else if (i > super.getRowSize() * super.getRowSize() - super.getRowSize() && i < super.getRowSize() * super.getRowSize() - 1) {

						if (coords.get(i - 1) == "[B]") {
							num++;
						}

						if (coords.get(i + 1) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize() + 1) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize() - 1) == "[B]") {
							num++;
						}
					}

					else {

						if (coords.get(i - super.getRowSize() - 1) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i - super.getRowSize() + 1) == "[B]") {
							num++;
						}

						if (coords.get(i - 1) == "[B]") {
							num++;
						}

						if (coords.get(i + 1) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize() - 1) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize()) == "[B]") {
							num++;
						}

						if (coords.get(i + super.getRowSize() + 1) == "[B]") {
							num++;
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
