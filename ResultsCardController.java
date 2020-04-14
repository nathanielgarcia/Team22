package application;

import javafx.stage.Stage;

public class ResultsCardController {
	private Stage secondaryStage;
	private boolean results;
	private ResultsCardWindow resultsCard;
	
	public ResultsCardController(Stage secondaryStage) {
		this.secondaryStage = secondaryStage;
	}
	
	public void initData(boolean results) {
		this.results = results;
		resultsCard = new ResultsCardWindow(this);
	}
	
	public Stage getSecondaryStage() {
		return secondaryStage;
	}
	
	public ResultsCardWindow getWindow() {
		return resultsCard;
	}
	
	public boolean getResults() {
		return results;
	}

}
