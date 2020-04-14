package application;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class ResultsCardWindow extends HBox{
	private Text card = new Text("");
	private Rectangle background = new Rectangle(500, 350);
	
	public ResultsCardWindow(ResultsCardController rcCon) {
    	StackPane stack = new StackPane();
    	
    	if (rcCon.getResults()) {
    		winCard();
    	}
    	
    	else {
    		loseCard();
    	}
    	
    	HBox hBox = new HBox(card);
    	hBox.setAlignment(Pos.CENTER);
    	stack.getChildren().addAll(background, hBox);
    	this.getChildren().addAll(stack);   
	}
	
	public void winCard() {
		card.setText("YOU WIN!");
		card.setFill(Color.BLACK);
		card.setFont(Font.font("Bank Gothic", FontWeight.BOLD, 100));
		
		final IntegerProperty i = new SimpleIntegerProperty(0);
		Timeline timeline = new Timeline(
				new KeyFrame(
						Duration.seconds(1.5),
						event -> {
							i.set(i.get() + 1);
							if (i.get() % 2 == 1) {
								card.setFill(Color.GHOSTWHITE);
								background.setFill(Color.BLACK);
							}
							else if (i.get() % 2 == 0) {
								card.setFill(Color.BLACK);
								background.setFill(Color.GHOSTWHITE);
							}
						}
				)
		);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}
	
	public void loseCard() {
		card.setText("GAME OVER!");
		card.setFill(Color.BLACK);
		card.setFont(Font.font("Bank Gothic", FontWeight.BOLD, 80));
		
		final IntegerProperty i = new SimpleIntegerProperty(0);
		Timeline timeline = new Timeline(
				new KeyFrame(
						Duration.seconds(1.5),
						event -> {
							i.set(i.get() + 1);
							if (i.get() % 2 == 1) {
								card.setFill(Color.GHOSTWHITE);
								background.setFill(Color.BLACK);
							}
							else if (i.get() % 2 == 0) {
								card.setFill(Color.BLACK);
								background.setFill(Color.GHOSTWHITE);
							}
						}
				)
		);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

}
