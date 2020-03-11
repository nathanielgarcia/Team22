package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import java.util.Timer;
import java.util.TimerTask;

public class NoviceBoardController extends Main{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton menuButton;

    @FXML
    private Button mine11;

    @FXML
    private Button mine12;

    @FXML
    private Button mine13;

    @FXML
    private Button mine14;

    @FXML
    private Button mine15;

    @FXML
    private Button mine16;

    @FXML
    private Button mine21;

    @FXML
    private Button mine22;

    @FXML
    private Button mine23;

    @FXML
    private Button mine24;

    @FXML
    private Button mine25;

    @FXML
    private Button mine26;

    @FXML
    private Button mine31;

    @FXML
    private Button mine32;

    @FXML
    private Button mine33;

    @FXML
    private Button mine34;

    @FXML
    private Button mine35;

    @FXML
    private Button mine36;

    @FXML
    private Button mine41;

    @FXML
    private Button mine42;

    @FXML
    private Button mine43;

    @FXML
    private Button mine44;

    @FXML
    private Button mine45;

    @FXML
    private Button mine46;

    @FXML
    private Button mine51;

    @FXML
    private Button mine52;

    @FXML
    private Button mine53;

    @FXML
    private Button mine54;

    @FXML
    private Button mine55;

    @FXML
    private Button mine56;

    @FXML
    private Button mine61;

    @FXML
    private Button mine62;

    @FXML
    private Button mine63;

    @FXML
    private Button mine64;

    @FXML
    private Button mine65;

    @FXML
    private Button mine66;
    
    @FXML
    private ArrayList boardContents;
    
    @FXML
    private Label timer;

    int seconds = 0;
    Timer count = new Timer();
    TimerTask task = new TimerTask() {
    	public void run() {
    		Platform.runLater(() -> timer.setText(timerSetter(seconds)));
    		seconds++;
    	}
    };
    
    void setNoviceBoardContents(ArrayList contents) {
    	this.boardContents = contents;
    }

    String timerSetter(int time) {
    	String spitBack = "Hello";
    	if (seconds < 10) {
    		spitBack = "00:0" + time;
    	}
    	
    	else if (seconds >= 10 && seconds <= 59) {
    		spitBack = "00:" + time;
    	}
    	
    	else if (seconds >= 60) {
    		int minutes = seconds / 60;
    		int leftover = seconds - (minutes * 60); 
    		
    		if (minutes < 10 && leftover < 10) {
    			spitBack = "0" + minutes + ":0" + leftover;
    		}
    		
    		else if (minutes < 10 && leftover >= 10 && leftover <= 59) {
    			spitBack = "0" + minutes + ":" + leftover;
    		}
    		
    		else if (minutes >= 10 && leftover < 10) {
    			spitBack = minutes + ":0" + leftover;
    		}
    		
    		else if (minutes >= 10 && leftover >= 10 && leftover <= 59) {
    			spitBack = minutes + ":" + leftover;
    		}
    	}
    	
    	return spitBack;
    }
    
    @FXML
    void mine11Clicked(ActionEvent event) {
    	mine11.setText((String) boardContents.get(0));
    }

    @FXML
    void mine12Clicked(ActionEvent event) {
    	mine12.setText((String) boardContents.get(1));
    }

    @FXML
    void mine13Clicked(ActionEvent event) {
    	mine13.setText((String) boardContents.get(2));
    }

    @FXML
    void mine14Clicked(ActionEvent event) {
    	mine14.setText((String) boardContents.get(3));
    }

    @FXML
    void mine15Clicked(ActionEvent event) {
    	mine15.setText((String) boardContents.get(4));
    }

    @FXML
    void mine16Clicked(ActionEvent event) {
    	mine16.setText((String) boardContents.get(5));
    }

    @FXML
    void mine21Clicked(ActionEvent event) {
    	mine21.setText((String) boardContents.get(6));
    }

    @FXML
    void mine22Clicked(ActionEvent event) {
    	mine22.setText((String) boardContents.get(7));
    }

    @FXML
    void mine23Clicked(ActionEvent event) {
    	mine23.setText((String) boardContents.get(8));
    }
    
    @FXML
    void mine24Clicked(ActionEvent event) {
    	mine24.setText((String) boardContents.get(9));
    }
    
    @FXML
    void mine25Clicked(ActionEvent event) {
    	mine25.setText((String) boardContents.get(10));
    }

    @FXML
    void mine26Clicked(ActionEvent event) {
    	mine26.setText((String) boardContents.get(11));
    }

    @FXML
    void mine31Clicked(ActionEvent event) {
    	mine31.setText((String) boardContents.get(12));
    }

    @FXML
    void mine32Clicked(ActionEvent event) {
    	mine32.setText((String) boardContents.get(13));
    }

    @FXML
    void mine33Clicked(ActionEvent event) {
    	mine33.setText((String) boardContents.get(14));
    }

    @FXML
    void mine34Clicked(ActionEvent event) {
    	mine34.setText((String) boardContents.get(15));
    }

    @FXML
    void mine35Clicked(ActionEvent event) {
    	mine35.setText((String) boardContents.get(16));
    }

    @FXML
    void mine36Clicked(ActionEvent event) {
    	mine36.setText((String) boardContents.get(17));
    }

    @FXML
    void mine41Clicked(ActionEvent event) {
    	mine41.setText((String) boardContents.get(18));
    }

    @FXML
    void mine42Clicked(ActionEvent event) {
    	mine42.setText((String) boardContents.get(19));
    }

    @FXML
    void mine43Clicked(ActionEvent event) {
    	mine43.setText((String) boardContents.get(20));
    }

    @FXML
    void mine44Clicked(ActionEvent event) {
    	mine44.setText((String) boardContents.get(21));
    }

    @FXML
    void mine45Clicked(ActionEvent event) {
    	mine45.setText((String) boardContents.get(22));
    }

    @FXML
    void mine46Clicked(ActionEvent event) {
    	mine46.setText((String) boardContents.get(23));
    }

    @FXML
    void mine51Clicked(ActionEvent event) {
    	mine51.setText((String) boardContents.get(24));
    }

    @FXML
    void mine52Clicked(ActionEvent event) {
    	mine52.setText((String) boardContents.get(25));
    }

    @FXML
    void mine53Clicked(ActionEvent event) {
    	mine53.setText((String) boardContents.get(26));
    }

    @FXML
    void mine54Clicked(ActionEvent event) {
    	mine54.setText((String) boardContents.get(27));
    }

    @FXML
    void mine55Clicked(ActionEvent event) {
    	mine55.setText((String) boardContents.get(28));
    }

    @FXML
    void mine56Clicked(ActionEvent event) {
    	mine56.setText((String) boardContents.get(29));
    }

    @FXML
    void mine61Clicked(ActionEvent event) {
    	mine61.setText((String) boardContents.get(30));
    }

    @FXML
    void mine62Clicked(ActionEvent event) {
    	mine62.setText((String) boardContents.get(31));
    }

    @FXML
    void mine63Clicked(ActionEvent event) {
    	mine63.setText((String) boardContents.get(32));
    }

    @FXML
    void mine64Clicked(ActionEvent event) {
    	mine64.setText((String) boardContents.get(33));
    }

    @FXML
    void mine65Clicked(ActionEvent event) {
    	mine65.setText((String) boardContents.get(34));
    }

    @FXML
    void mine66Clicked(ActionEvent event) {
    	mine66.setText((String) boardContents.get(35));
    }
    
    void setTimer() {
    	
    }

    @FXML
    void initialize() {
        assert menuButton != null : "fx:id=\"menuButton\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine11 != null : "fx:id=\"mine11\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine12 != null : "fx:id=\"mine12\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine13 != null : "fx:id=\"mine13\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine14 != null : "fx:id=\"mine14\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine15 != null : "fx:id=\"mine15\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine16 != null : "fx:id=\"mine16\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine21 != null : "fx:id=\"mine21\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine22 != null : "fx:id=\"mine22\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine23 != null : "fx:id=\"mine23\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine24 != null : "fx:id=\"mine24\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine25 != null : "fx:id=\"mine25\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine26 != null : "fx:id=\"mine26\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine31 != null : "fx:id=\"mine31\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine32 != null : "fx:id=\"mine32\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine33 != null : "fx:id=\"mine33\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine34 != null : "fx:id=\"mine34\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine35 != null : "fx:id=\"mine35\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine36 != null : "fx:id=\"mine36\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine41 != null : "fx:id=\"mine41\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine42 != null : "fx:id=\"mine42\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine43 != null : "fx:id=\"mine43\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine44 != null : "fx:id=\"mine44\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine45 != null : "fx:id=\"mine45\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine46 != null : "fx:id=\"mine46\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine51 != null : "fx:id=\"mine51\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine52 != null : "fx:id=\"mine52\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine53 != null : "fx:id=\"mine53\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine54 != null : "fx:id=\"mine54\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine55 != null : "fx:id=\"mine55\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine56 != null : "fx:id=\"mine56\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine61 != null : "fx:id=\"mine61\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine62 != null : "fx:id=\"mine62\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine63 != null : "fx:id=\"mine63\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine64 != null : "fx:id=\"mine64\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine65 != null : "fx:id=\"mine65\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert mine66 != null : "fx:id=\"mine66\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";
        assert timer != null : "fx:id=\"timer\" was not injected: check your FXML file 'Minesweeper Try 1.fxml'.";

        Bombs l = new Bombs(1);
        setNoviceBoardContents(l.buildLowerBoard(l.BombMaker()));
        count.scheduleAtFixedRate(task,  1000, 1000);
    }

}
