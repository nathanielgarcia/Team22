package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.text.Font;
import java.util.Timer;
import java.util.TimerTask;

public class Minesweep9Controller extends Main{
	   
    @FXML
    private ResourceBundle resources;

    
    @FXML
    private URL location;

    
    @FXML
    private Button mine39;

    
    @FXML
    private Button mine38;


    @FXML
    private Button mine33;


    @FXML
    private Button mine77;


    @FXML
    private Button mine32;


    @FXML
    private Button mine76;


    @FXML
    private Button mine31;


    @FXML
    private Button mine75;


    @FXML
    private Button mine74;


    @FXML
    private Button mine37;


    @FXML
    private Button mine36;


    @FXML
    private Button mine35;


    @FXML
    private Button mine79;


    @FXML
    private Button mine34;


    @FXML
    private Button mine78;


    @FXML
    private Button mine73;


    @FXML
    private Button mine72;


    @FXML
    private Button mine71;


    @FXML
    private Button mine29;


    @FXML
    private Button mine28;


    @FXML
    private Button mine27;


    @FXML
    private Button mine22;


    @FXML
    private Button mine66;


    @FXML
    private Button mine21;


    @FXML
    private Button mine65;


    @FXML
    private Button mine64;


    @FXML
    private Button mine63;


    @FXML
    private Button mine26;


    @FXML
    private Button mine25;


    @FXML
    private Button mine69;


    @FXML
    private Button mine24;


    @FXML
    private Button mine68;


    @FXML
    private Button mine23;


    @FXML
    private Button mine67;


    @FXML
    private Button mine62;


    @FXML
    private Button mine61;


    @FXML
    private Insets x2;


    @FXML
    private Font x6;


    @FXML
    private Button mine19;


    @FXML
    private Button mine18;


    @FXML
    private Button mine17;


    @FXML
    private Button mine16;


    @FXML
    private Button mine11;


    @FXML
    private Button mine55;


    @FXML
    private Button mine99;


    @FXML
    private Button mine54;


    @FXML
    private Button mine98;


    @FXML
    private Button mine53;


    @FXML
    private Button mine97;


    @FXML
    private Button mine52;


    @FXML
    private Button mine96;


    @FXML
    private Button mine15;


    @FXML
    private Button mine59;


    @FXML
    private Button mine14;


    @FXML
    private Button mine58;


    @FXML
    private Button mine13;


    @FXML
    private Button mine57;


    @FXML
    private Button mine12;


    @FXML
    private Button mine56;


    @FXML
    private Button mine91;


    @FXML
    private Button mine51;


    @FXML
    private Button mine95;


    @FXML
    private Button mine94;


    @FXML
    private Button mine93;


    @FXML
    private Button mine92;


    @FXML
    private Button mine49;


    @FXML
    private Button mine88;


    @FXML
    private Button mine43;


    @FXML
    private Button mine87;


    @FXML
    private Button mine42;


    @FXML
    private Button mine86;


    @FXML
    private Button mine41;


    @FXML
    private Button mine85;


    @FXML
    private Button mine48;


    @FXML
    private Button mine47;


    @FXML
    private Button mine46;


    @FXML
    private Button mine45;


    @FXML
    private Button mine89;


    @FXML
    private Button mine84;


    @FXML
    private Button mine83;


    @FXML
    private Button mine82;


    @FXML
    private Button mine81;
    
    
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
    
    
    @FXML
    private ArrayList boardContents;


    @FXML
    private MenuButton menuButton;
    
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
    
    void setIntermediateBoardContents(ArrayList contents) {
    	this.boardContents = contents;
    }

    @FXML
    void initialize() {
        assert mine39 != null : "fx:id=\"mine39\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine38 != null : "fx:id=\"mine38\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine33 != null : "fx:id=\"mine33\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine77 != null : "fx:id=\"mine77\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine32 != null : "fx:id=\"mine32\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine76 != null : "fx:id=\"mine76\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine31 != null : "fx:id=\"mine31\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine75 != null : "fx:id=\"mine75\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine74 != null : "fx:id=\"mine74\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine37 != null : "fx:id=\"mine37\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine36 != null : "fx:id=\"mine36\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine35 != null : "fx:id=\"mine35\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine79 != null : "fx:id=\"mine79\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine34 != null : "fx:id=\"mine34\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine78 != null : "fx:id=\"mine78\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine73 != null : "fx:id=\"mine73\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine72 != null : "fx:id=\"mine72\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine71 != null : "fx:id=\"mine71\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine29 != null : "fx:id=\"mine29\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine28 != null : "fx:id=\"mine28\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine27 != null : "fx:id=\"mine27\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine22 != null : "fx:id=\"mine22\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine66 != null : "fx:id=\"mine66\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine21 != null : "fx:id=\"mine21\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine65 != null : "fx:id=\"mine65\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine64 != null : "fx:id=\"mine64\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine63 != null : "fx:id=\"mine63\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine26 != null : "fx:id=\"mine26\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine25 != null : "fx:id=\"mine25\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine69 != null : "fx:id=\"mine69\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine24 != null : "fx:id=\"mine24\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine68 != null : "fx:id=\"mine68\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine23 != null : "fx:id=\"mine23\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine67 != null : "fx:id=\"mine67\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine62 != null : "fx:id=\"mine62\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine61 != null : "fx:id=\"mine61\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert x2 != null : "fx:id=\"x2\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert x6 != null : "fx:id=\"x6\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine19 != null : "fx:id=\"mine19\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine18 != null : "fx:id=\"mine18\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine17 != null : "fx:id=\"mine17\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine16 != null : "fx:id=\"mine16\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine11 != null : "fx:id=\"mine11\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine55 != null : "fx:id=\"mine55\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine99 != null : "fx:id=\"mine99\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine54 != null : "fx:id=\"mine54\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine98 != null : "fx:id=\"mine98\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine53 != null : "fx:id=\"mine53\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine97 != null : "fx:id=\"mine97\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine52 != null : "fx:id=\"mine52\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine96 != null : "fx:id=\"mine96\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine15 != null : "fx:id=\"mine15\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine59 != null : "fx:id=\"mine59\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine14 != null : "fx:id=\"mine14\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine58 != null : "fx:id=\"mine58\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine13 != null : "fx:id=\"mine13\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine57 != null : "fx:id=\"mine57\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine12 != null : "fx:id=\"mine12\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine56 != null : "fx:id=\"mine56\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine91 != null : "fx:id=\"mine91\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert timer != null : "fx:id=\"timer\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine51 != null : "fx:id=\"mine51\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine95 != null : "fx:id=\"mine95\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine94 != null : "fx:id=\"mine94\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine93 != null : "fx:id=\"mine93\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine92 != null : "fx:id=\"mine92\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine49 != null : "fx:id=\"mine49\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine88 != null : "fx:id=\"mine88\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine43 != null : "fx:id=\"mine43\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine87 != null : "fx:id=\"mine87\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine42 != null : "fx:id=\"mine42\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine86 != null : "fx:id=\"mine86\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine41 != null : "fx:id=\"mine41\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine85 != null : "fx:id=\"mine85\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine48 != null : "fx:id=\"mine48\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine47 != null : "fx:id=\"mine47\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine46 != null : "fx:id=\"mine46\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine45 != null : "fx:id=\"mine45\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine89 != null : "fx:id=\"mine89\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine84 != null : "fx:id=\"mine84\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine83 != null : "fx:id=\"mine83\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine82 != null : "fx:id=\"mine82\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert mine81 != null : "fx:id=\"mine81\" was not injected: check your FXML file '9x9 Board.fxml'.";
        assert menuButton != null : "fx:id=\"menuButton\" was not injected: check your FXML file '9x9 Board.fxml'.";
        
        Bombs l = new Bombs(2);
        setIntermediateBoardContents(l.buildLowerBoard(l.BombMaker()));
        count.scheduleAtFixedRate(task,  1000, 1000);
    }
}     