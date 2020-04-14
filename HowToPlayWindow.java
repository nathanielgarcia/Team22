package application;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class HowToPlayWindow extends VBox{
	private final Button backButton = new Button("Back");
	
	public HowToPlayWindow(final HowToPlayController htpCon) {
		
		Text rule1Title = new Text();
		rule1Title.setText("Picking the Difficulty Level");
		rule1Title.setFont(new Font("Segoe UI Semibold", 17));
		
		Text rule1Text = new Text();
		rule1Text.setText("On the main menu, select the level of difficulty you wish to play at. \nThe novice board is 9 x 9 with 16 bombs. The intermediate board is 15 x 15 with 46 bombs. The advanced board is 22 x 22 with 99 bombs.");
		rule1Text.setFont(new Font("Segoe UI Semibold", 12));
		
		VBox rule1 = new VBox(rule1Title, rule1Text);
		
		
		Text rule2Title = new Text();
		rule2Title.setText("Beginning the Game");
		rule2Title.setFont(new Font("Segoe UI Semibold", 17));
		
		Text rule2Text = new Text();
		rule2Text.setText("Click on any square on the board to begin the game. It will reveal either a bomb, a number, or an empty square. \nIf it reveals an empty square, the squares around it will open until they hit a number. \nIf it reveals a bomb, the game ends and you'll have to start over.");
		rule2Text.setFont(new Font("Segoe UI Semibold", 12));
		
		VBox rule2 = new VBox(rule2Title, rule2Text);
		
		
		Text rule3Title = new Text();
		rule3Title.setText("Reviewing the Numbers");
		rule3Title.setFont(new Font("Segoe UI Semibold", 17));
		
		Text rule3Text = new Text();
		rule3Text.setText("Any number on the board refers to the number of mines currently touching that number's square. \nThere can be up to 8 bombs touching one square as it includes the diagonal direction");
		rule3Text.setFont(new Font("Segoe UI Semibold", 12));
		
		VBox rule3 = new VBox(rule3Title, rule3Text);
		
		
		Text rule4Title = new Text();
		rule4Title.setText("Flagging Possible Bombs");
		rule4Title.setFont(new Font("Segoe UI Semibold", 17));
		
		Text rule4Text = new Text();
		rule4Text.setText("To flag a possible bomb, right click on the square that you think contains the bomb. This will ensure that you don't accidentally open it. \nTo un-flag a square, right click it again");
		rule4Text.setFont(new Font("Segoe UI Semibold", 12));
		
		VBox rule4 = new VBox(rule4Title, rule4Text);
		
		
		Text rule5Title = new Text();
		rule5Title.setText("Opening New Squares");
		rule5Title.setFont(new Font("Segoe UI Semibold", 17));
		
		Text rule5Text = new Text();
		rule5Text.setText("Click on squares you're sure don't contain bombs to open them");
		rule5Text.setFont(new Font("Segoe UI Semibold", 12));

		VBox rule5 = new VBox(rule5Title, rule5Text);
		
		
		Text rule6Title = new Text();
		rule6Title.setText("Winning the Game");
		rule6Title.setFont(new Font("Segoe UI Semibold", 17));
		
		Text rule6Text = new Text();
		rule6Text.setText("To win the game, you need to open up every square that doesn't contain a bomb without ever opening one that does contain a bomb. \nFlagging the location of all the bombs will not be enough to win the game.");
		rule6Text.setFont(new Font("Segoe UI Semibold", 12));
		
		VBox rule6 = new VBox(rule6Title, rule6Text);
		
		
		Text rule7Title = new Text();
		rule7Title.setText("Losing the Game");
		rule7Title.setFont(new Font("Segoe UI Semibold", 17));
		
		Text rule7Text = new Text();
		rule7Text.setText("The game will be lost if a bomb is opened at any point in the game. Upon losing the game, all the bomb locations will also be revealed.");
		rule7Text.setFont(new Font("Segoe UI Semibold", 12));
		
		VBox rule7 = new VBox(rule7Title, rule7Text);
		
		
		VBox vBox = new VBox(20, rule1, rule2, rule3, rule4, rule5, rule6, rule7);
		
		this.getChildren().addAll(backButton, vBox);
		
		backButton.setOnAction(event -> {
			htpCon.handle(event);
		});
	}
	
	public Button getButton() {
		return backButton;
	}

}
