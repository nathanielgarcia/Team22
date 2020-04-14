package application;

import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class SquareMaker extends StackPane{
	private BoardWindow window;
	private int xcoord, ycoord, index;
	private boolean open = false;
	private Rectangle squareLayout;
	private Text squareContent = new Text();
	
	public SquareMaker(int x, int y, double xsquare, double ysquare, String contents, int index, BoardWindow window) {
		this.window = window;
		this.xcoord = x;
		this.ycoord = y;
		this.index = index;
		
		squareContent.setFont(new Font("Segoe UI BLACK", 18));
		squareContent.setTextAlignment(TextAlignment.CENTER);
		squareContent.setText(contents);
		
		if (contents.equals("1")) {
			squareContent.setFill(Color.BLUE);
		}
		else if (contents.equals("2")) {
			squareContent.setFill(Color.GREEN);
		}
		else if (contents.equals("3")) {
			squareContent.setFill(Color.RED);
		}
		else if (contents.equals("4")) {
			squareContent.setFill(Color.PURPLE);
		}
		else if (contents.equals("5")) {
			squareContent.setFill(Color.ORANGE);
		}
		else if (contents.equals("6")) {
			squareContent.setFill(Color.TURQUOISE);
		}
		else if (contents.equals("7")) {
			squareContent.setFill(Color.HOTPINK);
		}
		else if (contents.equals("8")) {
			squareContent.setFill(Color.LIGHTSALMON);
		}
		else {
			squareContent.setFill(Color.BLACK);
		}
		
		squareContent.setVisible(open);
		setTranslateX(xcoord * xsquare);
		setTranslateY(ycoord * ysquare);
		
		squareLayout = new Rectangle(xsquare, ysquare);
		squareLayout.setStroke(Color.GHOSTWHITE);
		squareLayout.setFill(Color.BLACK);
		
		
		getChildren().addAll(squareLayout, squareContent);
		
		if (!open) {
			setOnMouseClicked(event -> 
			{
				if (event.getButton() == MouseButton.PRIMARY) {
					window.clickedSquare(this);
				}
				else if (event.getButton() == MouseButton.SECONDARY) {
					if (squareLayout.getFill() == Color.RED) {
						squareLayout.setFill(Color.BLACK);
					}
					else if (squareLayout.getFill() == Color.BLACK) {
						squareLayout.setFill(Color.RED);
					}
				}
			});
		}		
	}
	
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public boolean getOpen() {
		return this.open;
	}
	
	public Rectangle getSquareLayout() {
		return this.squareLayout;
	}
	
	public Text getSquareContent() {
		return this.squareContent;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public int getXCoord() {
		return this.xcoord;
	}
	
	public int getYCoord() {
		return this.ycoord;
	}
}
