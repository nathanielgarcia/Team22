package application;

import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class NearbySquares {
	private BoardController window;
	private BoardWindow win;
	private SquareMaker tile;
	private ArrayList<SquareMaker> tileList;
	
	public NearbySquares(BoardWindow win, BoardController window, SquareMaker tile, ArrayList<SquareMaker> tileList) {
		this.tile = tile;
		this.window = window;
		this.win = win;
		this.tileList = tileList;
	}
	
	public void Open(int i) {
		if (tileList.get(i).getSquareContent().getText().equals("1") || tileList.get(i).getSquareContent().getText().equals("2") || tileList.get(i).getSquareContent().getText().equals("3") || tileList.get(i).getSquareContent().getText().equals("4") || tileList.get(i).getSquareContent().getText().equals("5") || tileList.get(i).getSquareContent().getText().equals("6") || tileList.get(i).getSquareContent().getText().equals("7") || tileList.get(i).getSquareContent().getText().equals("8")) {
			tileList.get(i).setOpen(true);
			tileList.get(i).getSquareContent().setVisible(true);
			tileList.get(i).getSquareLayout().setFill(Color.GHOSTWHITE);
		}
		else if (tileList.get(i).getSquareContent().getText().contentEquals("B")) {
			win.setResults("Game Over!", Color.DARKRED);
			for (int b = 0; b < tileList.size(); b++) {
				if (tileList.get(b).getSquareContent().getText().contentEquals("B")) {
					tileList.get(b).getSquareContent().setVisible(true);
					tileList.get(b).getSquareLayout().setFill(Color.INDIANRED);
					
				}
			}
		}
		else {
			tileList.get(i).setOpen(true);
			tileList.get(i).getSquareContent().setVisible(true);
			tileList.get(i).getSquareLayout().setFill(Color.GHOSTWHITE);
			if (i == 0) {
				if (!tileList.get(i + 1).getOpen()) {
					Open(i + 1);
				}
				if (!tileList.get(i + window.getBoardSize()).getOpen()) {
					Open(i + window.getBoardSize());
				}
				if (!tileList.get(i + window.getBoardSize() + 1).getOpen()) {
					Open(i + window.getBoardSize() + 1);
				}
			}
			else if (i == (window.getBoardSize() - 1)) {
				if (!tileList.get(i - 1).getOpen()) {
					Open(i - 1);
				}
				if (!tileList.get(i + window.getBoardSize()).getOpen()) {
					Open(i + window.getBoardSize());
				}
				if (!tileList.get(i + window.getBoardSize() - 1).getOpen()) {
					Open(i + window.getBoardSize() - 1);
				}
			}
			else if (i == ((window.getBoardSize() * window.getBoardSize()) - window.getBoardSize())) {
				if (!tileList.get(i + 1).getOpen()) {
					Open(i + 1);
				}
				if (!tileList.get(i - window.getBoardSize()).getOpen()) {
					Open(i - window.getBoardSize());
				}
				if (!tileList.get(i - window.getBoardSize() + 1).getOpen()) {
					Open(i - window.getBoardSize() + 1);
				}
			}
			else if (i == window.getBoardSize() - 1) {
				if (!tileList.get(i - 1).getOpen()) {
					Open(i - 1);
				}
				if (!tileList.get(i - window.getBoardSize()).getOpen()) {
					Open(i - window.getBoardSize());
				}
				if (!tileList.get(i - window.getBoardSize() - 1).getOpen()) {
					Open(i - window.getBoardSize() - 1);
				}
			}
			else if (i >= 1 && i < window.getBoardSize()) {
				if (!tileList.get(i - 1).getOpen()) {
					Open(i - 1);
				}
				if (!tileList.get(i + 1).getOpen()) {
					Open(i + 1);
				}
				if (!tileList.get(i + window.getBoardSize()).getOpen()) {
					Open(i + window.getBoardSize());
				}
				if (!tileList.get(i + window.getBoardSize() - 1).getOpen()) {
					Open(i + window.getBoardSize() - 1);
				}
				if (!tileList.get(i + window.getBoardSize() + 1).getOpen()) {
					Open(i + window.getBoardSize() + 1);
				}
			}
			else if (i % window.getBoardSize() == 0) {
				if (!tileList.get(i + 1).getOpen()) {
					Open(i + 1);
				}
				if (!tileList.get(i - window.getBoardSize()).getOpen()) {
					Open(i - window.getBoardSize());
				}
				if (!tileList.get(i - window.getBoardSize() + 1).getOpen()) {
					Open(i - window.getBoardSize() + 1);
				}
				if (!tileList.get(i + window.getBoardSize()).getOpen()) {
					Open(i + window.getBoardSize());
				}
				if (!tileList.get(i + window.getBoardSize() + 1).getOpen()) {
					Open(i + window.getBoardSize() + 1);
				}
			}
			else if (i % (window.getBoardSize() - 1) == 0) {
				if (!tileList.get(i - 1).getOpen()) {
					Open(i - 1);
				}
				if (!tileList.get(i - window.getBoardSize()).getOpen()) {
					Open(i - window.getBoardSize());
				}
				if (!tileList.get(i + window.getBoardSize()).getOpen()) {
					Open(i + window.getBoardSize());
				}
				if (!tileList.get(i - window.getBoardSize() - 1).getOpen()) {
					Open(i - window.getBoardSize() - 1);
				}
				if (!tileList.get(i + window.getBoardSize() - 1).getOpen()) {
					Open(i + window.getBoardSize() - 1);
				}
			}
			else if (i > (window.getBoardSize() * window.getBoardSize()) - window.getBoardSize() && i < (window.getBoardSize() * window.getBoardSize()) - 1) {
				if (!tileList.get(i + 1).getOpen()) {
					Open(i + 1);
				}
				if (!tileList.get(i - 1).getOpen()) {
					Open(i - 1);
				}
				if (!tileList.get(i - window.getBoardSize()).getOpen()) {
					Open(i - window.getBoardSize());
				}
				if (!tileList.get(i - window.getBoardSize() - 1).getOpen()) {
					Open(i - window.getBoardSize() - 1);
				}
				if (!tileList.get(i - window.getBoardSize() + 1).getOpen()) {
					Open(i - window.getBoardSize() + 1);
				}
			}
			else {
				if (!tileList.get(i + 1).getOpen()) {
					Open(i + 1);
				}
				if (!tileList.get(i - 1).getOpen()) {
					Open(i - 1);
				}
				if (!tileList.get(i - window.getBoardSize()).getOpen()) {
					Open(i - window.getBoardSize());
				}
				if (!tileList.get(i - window.getBoardSize() - 1).getOpen()) {
					Open(i - window.getBoardSize() - 1);
				}
				if (!tileList.get(i - window.getBoardSize() + 1).getOpen()) {
					Open(i - window.getBoardSize() + 1);
				}
				if (!tileList.get(i + window.getBoardSize()).getOpen()) {
					Open(i + window.getBoardSize());
				}
				if (!tileList.get(i + window.getBoardSize() - 1).getOpen()) {
					Open(i + window.getBoardSize() - 1);
				}
				if (!tileList.get(i + window.getBoardSize() + 1).getOpen()) {
					Open(i + window.getBoardSize() + 1);
				}
			}
		}
	}
}