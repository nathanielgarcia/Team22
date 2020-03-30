package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController extends GUIGame implements EventHandler<ActionEvent>{
	private Stage primaryStage;
	private MenuWindow menu = new MenuWindow(this);
	
	public MenuController(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	@Override
	public void handle(ActionEvent click) {
		Object source = click.getSource();
		
		if (source.equals(menu.getNoviceButton())) {
			super.setBoardSize(9);
		}
		else if (source.equals(menu.getIntermediateButton())) {
			super.setBoardSize(15);
		}
		else if (source.equals(menu.getAdvancedButton())) {
			super.setBoardSize(22);
		}
		try {
			super.getConfig().getGame().setup();
			BoardController bCon = new BoardController(primaryStage);
			bCon.initData(super.getBoardSize(), super.getBoardContents());
			Scene boardScene = new Scene(bCon.getWindow(), 800, 600);
			primaryStage.setScene(boardScene);
		
		}
		catch (Exception e) {
			
		}
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public MenuWindow getWindow() {
		return menu;
	}

}
