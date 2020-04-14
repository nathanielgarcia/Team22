package application;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class NearbySquares {
	private BoardController window;
	private ArrayList<SquareMaker> tileList;
	
	public NearbySquares(BoardController window, ArrayList<SquareMaker> tileList) {
		this.window = window;
		this.tileList = tileList;
	}
	
	public void Open(int i) {
		if (!tileList.get(i).getSquareContent().getText().contentEquals("B") && !tileList.get(i).getSquareContent().getText().contentEquals(" ")) {
			tileList.get(i).setOpen(true);
			tileList.get(i).getSquareContent().setVisible(true);
			tileList.get(i).getSquareLayout().setFill(Color.GHOSTWHITE);
		}
		else if (tileList.get(i).getSquareContent().getText().contentEquals("B")) {
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
			else if (i == (window.getBoardSize() * window.getBoardSize()) - 1) {
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
			else if ((i + 1) % window.getBoardSize() == 0) {
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