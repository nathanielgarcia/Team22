package application;

import java.util.ArrayList;

public class NumberMaker {
	private int gameSpaces;
	private int boardSize;
	private ArrayList<Object> bombSquad = new ArrayList<Object>(gameSpaces);
	
	public NumberMaker(int BoardSize) {
		this.boardSize = BoardSize;
		this.gameSpaces = boardSize * boardSize;
	}
	
	public int getBoardSize() {
		return boardSize;
	}
	
	public void addBombs(ArrayList<Integer> bombs) {
		for (int i = 0; i < gameSpaces; i++) {
			bombSquad.add(" ");
		}
		
		for (int x = 0; x < bombs.size(); x += 2) {
			int bombLocation = ((int)bombs.get(x) - 1) * (boardSize) + ((int)bombs.get(x + 1) - 1);
			bombSquad.set(bombLocation, "B");
		}
	}
	
	public ArrayList<Object> addNumbers() {
		
		for (int i = 0; i < (gameSpaces); i++) {
			if (bombSquad.get(i) == " ") {
				int num = 0;

					if (i == 0) {

						if (bombSquad.get(i + 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize + 1) == "B") {
							num++;
						}
					}

					else if (i == (boardSize - 1)) {

						if (bombSquad.get(i - 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize - 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize) == "B") {
							num++;
						}
					}

					else if (i == (gameSpaces - boardSize)) {

						if (bombSquad.get(i + 1) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize + 1) == "B") {
							num++;
						}
					}

					else if (i == gameSpaces - 1) {

						if (bombSquad.get(i - 1) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize - 1) == "B") {
							num++;
						}
					}

					else if (i >= 1 && i < boardSize) {

						if (bombSquad.get(i - 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize - 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize + 1) == "B") {
							num++;
						}
					}

					else if (i % boardSize == 0 && i != gameSpaces - boardSize) {

						if (bombSquad.get(i - boardSize) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize + 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize) == "B") {
							num++;
						}

						if (bombSquad.get(i + boardSize + 1) == "B") {
							num++;
						}
					}

					else if ((i + 1) % boardSize == 0 && i != gameSpaces - 1) {
						
						if (bombSquad.get(i - boardSize) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize - 1) == "B") {
							num++;
						}

						if (bombSquad.get(i - 1) == "B") {
							num++;
						}
						if (bombSquad.get(i + boardSize) == "B") {
							num++;
						}
							
						if (bombSquad.get(i + boardSize - 1) == "B") {
							num++;
						}
					}

					else if (i > gameSpaces - boardSize && i < gameSpaces - 1) {

						if (bombSquad.get(i - 1) == "B") {
							num++;
						}

						if (bombSquad.get(i + 1) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize + 1) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize) == "B") {
							num++;
						}

						if (bombSquad.get(i - boardSize - 1) == "B") {
							num++;
						}
					}

					else {
						try {

							if (bombSquad.get(i - boardSize - 1) == "B") {
								num++;
							}
						}
						catch (Exception e) {
							
						}
						
						try {
							if (bombSquad.get(i - boardSize) == "B") {
								num++;
							}
						}
						catch (Exception e) {
						
						}
						
						try {
							
							if (bombSquad.get(i - boardSize + 1) == "B") {
								num++;
							}
						}
						catch (Exception e) {
							
						}

						try {
							
							if (bombSquad.get(i - 1) == "B") {
								num++;
							}
						}
						catch (Exception e) {
							
						}

						try {
							
							if (bombSquad.get(i + 1) == "B") {
								num++;
							}
						}
						catch (Exception e) {
							
						}
							
						try {
							
							if (bombSquad.get(i + boardSize - 1) == "B") {
								num++;
							}
						}
						catch (Exception e) {
							
						}

						try {
							
							if (bombSquad.get(i + boardSize) == "B") {
								num++;
							}
						}
						catch (Exception e) {
							
						}

						try {
							
							if (bombSquad.get(i + boardSize + 1) == "B") {
								num++;
							}
						}
						catch (Exception e) {
							
						}
					}
			
				if (num != 0) {
					String inp = ("" + num);
					bombSquad.set(i, inp);
				}
			}
		}
		return bombSquad;
	}

}
