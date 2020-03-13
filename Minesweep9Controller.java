package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
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
    private Button mine44;


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
    void mine17Clicked(ActionEvent event) {
    	mine17.setText((String) boardContents.get(6));
    }

    @FXML
    void mine18Clicked(ActionEvent event) {
    	mine18.setText((String) boardContents.get(7));

    }

    @FXML
    void mine19Clicked(ActionEvent event) {
    	mine19.setText((String) boardContents.get(8));

    }

    @FXML
    void mine21Clicked(ActionEvent event) {
    	mine21.setText((String) boardContents.get(9));

    }

    @FXML
    void mine22Clicked(ActionEvent event) {
    	mine22.setText((String) boardContents.get(10));

    }

    @FXML
    void mine23Clicked(ActionEvent event) {
    	mine23.setText((String) boardContents.get(11));

    }

    @FXML
    void mine24Clicked(ActionEvent event) {
    	mine24.setText((String) boardContents.get(12));

    }

    @FXML
    void mine25Clicked(ActionEvent event) {
    	mine25.setText((String) boardContents.get(13));

    }

    @FXML
    void mine26Clicked(ActionEvent event) {
    	mine26.setText((String) boardContents.get(14));

    }

    @FXML
    void mine27Clicked(ActionEvent event) {
    	mine27.setText((String) boardContents.get(15));

    }

    @FXML
    void mine28Clicked(ActionEvent event) {
    	mine28.setText((String) boardContents.get(16));

    }

    @FXML
    void mine29Clicked(ActionEvent event) {
    	mine29.setText((String) boardContents.get(17));

    }

    @FXML
    void mine31Clicked(ActionEvent event) {
    	mine31.setText((String) boardContents.get(18));

    }

    @FXML
    void mine32Clicked(ActionEvent event) {
    	mine32.setText((String) boardContents.get(19));

    }

    @FXML
    void mine33Clicked(ActionEvent event) {
    	mine33.setText((String) boardContents.get(20));

    }

    @FXML
    void mine34Clicked(ActionEvent event) {
    	mine34.setText((String) boardContents.get(21));

    }

    @FXML
    void mine35Clicked(ActionEvent event) {
    	mine35.setText((String) boardContents.get(22));

    }

    @FXML
    void mine36Clicked(ActionEvent event) {
    	mine36.setText((String) boardContents.get(23));

    }

    @FXML
    void mine37Clicked(ActionEvent event) {
    	mine37.setText((String) boardContents.get(24));

    }

    @FXML
    void mine38Clicked(ActionEvent event) {
    	mine38.setText((String) boardContents.get(25));

    }
    
    @FXML
    void mine39Clicked(ActionEvent event) {
    	mine39.setText((String) boardContents.get(26));

    }

    @FXML
    void mine41Clicked(ActionEvent event) {
    	mine41.setText((String) boardContents.get(27));

    }

    @FXML
    void mine42Clicked(ActionEvent event) {
    	mine42.setText((String) boardContents.get(28));

    }

    @FXML
    void mine43Clicked(ActionEvent event) {
    	mine43.setText((String) boardContents.get(29));

    }

    @FXML
    void mine44Clicked(ActionEvent event) {
    	mine44.setText((String) boardContents.get(30));

    }

    @FXML
    void mine45Clicked(ActionEvent event) {
    	mine45.setText((String) boardContents.get(31));

    }

    @FXML
    void mine46Clicked(ActionEvent event) {
    	mine46.setText((String) boardContents.get(32));

    }

    @FXML
    void mine47Clicked(ActionEvent event) {
    	mine47.setText((String) boardContents.get(33));

    }

    @FXML
    void mine48Clicked(ActionEvent event) {
    	mine48.setText((String) boardContents.get(34));

    }

    

    @FXML
    void mine49Clicked(ActionEvent event) {
    	mine49.setText((String) boardContents.get(35));

        }

    

    @FXML
    void mine51Clicked(ActionEvent event) {
    	mine51.setText((String) boardContents.get(36));

    }

    @FXML
    void mine52Clicked(ActionEvent event) {
    	mine52.setText((String) boardContents.get(37));

    }

    @FXML
    void mine53Clicked(ActionEvent event) {
    	mine53.setText((String) boardContents.get(38));

    }

    @FXML
    void mine54Clicked(ActionEvent event) {
    	mine54.setText((String) boardContents.get(39));

    }

    @FXML
    void mine55Clicked(ActionEvent event) {
    	mine55.setText((String) boardContents.get(40));

    }

    @FXML
    void mine56Clicked(ActionEvent event) {
    	mine56.setText((String) boardContents.get(41));

    }

    @FXML
    void mine57Clicked(ActionEvent event) {
    	mine57.setText((String) boardContents.get(42));

    }

    @FXML
    void mine58Clicked(ActionEvent event) {
    	mine58.setText((String) boardContents.get(43));

    }

    @FXML
    void mine59Clicked(ActionEvent event) {
    	mine59.setText((String) boardContents.get(44));

    }

    @FXML
    void mine61Clicked(ActionEvent event) {
    	mine61.setText((String) boardContents.get(45));
    }

    @FXML
    void mine62Clicked(ActionEvent event) {
    	mine62.setText((String) boardContents.get(46));

    }

    @FXML
    void mine63Clicked(ActionEvent event) {
    	mine63.setText((String) boardContents.get(47));

    }

    @FXML
    void mine64Clicked(ActionEvent event) {
    	mine64.setText((String) boardContents.get(48));

    }

    @FXML
    void mine65Clicked(ActionEvent event) {
    	mine65.setText((String) boardContents.get(49));

    }

    @FXML
    void mine66Clicked(ActionEvent event) {
    	mine66.setText((String) boardContents.get(50));

    }

    @FXML
    void mine67Clicked(ActionEvent event) {
    	mine67.setText((String) boardContents.get(51));
    }

    @FXML
    void mine68Clicked(ActionEvent event) {
    	mine68.setText((String) boardContents.get(52));

    }

    @FXML
    void mine69Clicked(ActionEvent event) {
    	mine69.setText((String) boardContents.get(53));

    }

    @FXML
    void mine71Clicked(ActionEvent event) {
    	mine71.setText((String) boardContents.get(54));

    }

    @FXML
    void mine72Clicked(ActionEvent event) {
    	mine72.setText((String) boardContents.get(55));

    }

    @FXML
    void mine73Clicked(ActionEvent event) {
    	mine73.setText((String) boardContents.get(56));

    }

    @FXML
    void mine74Clicked(ActionEvent event) {
    	mine74.setText((String) boardContents.get(57));

    }

    @FXML
    void mine75Clicked(ActionEvent event) {
    	mine75.setText((String) boardContents.get(55));

    }

    @FXML
    void mine76Clicked(ActionEvent event) {
    	mine76.setText((String) boardContents.get(56));

    }

    @FXML
    void mine77Clicked(ActionEvent event) {
    	mine77.setText((String) boardContents.get(57));

    }

    @FXML
    void mine78Clicked(ActionEvent event) {
    	mine78.setText((String) boardContents.get(58));
    }

    @FXML
    void mine79Clicked(ActionEvent event) {
    	mine79.setText((String) boardContents.get(59));

    }

    @FXML
    void mine81Clicked(ActionEvent event) {
    	mine81.setText((String) boardContents.get(60));

    }

    @FXML
    void mine82Clicked(ActionEvent event) {
    	mine82.setText((String) boardContents.get(61));

    }

    @FXML
    void mine83Clicked(ActionEvent event) {
    	mine83.setText((String) boardContents.get(62));

    }

    @FXML
    void mine84Clicked(ActionEvent event) {
    	mine84.setText((String) boardContents.get(63));

    }

    @FXML
    void mine85Clicked(ActionEvent event) {
    	mine85.setText((String) boardContents.get(64));

    }

    @FXML
    void mine86Clicked(ActionEvent event) {
    	mine86.setText((String) boardContents.get(65));
    }

    @FXML
    void mine87Clicked(ActionEvent event) {
    	mine87.setText((String) boardContents.get(66));

    }

    @FXML
    void mine88Clicked(ActionEvent event) {
    	mine88.setText((String) boardContents.get(67));
    }

    @FXML
    void mine89Clicked(ActionEvent event) {
    	mine89.setText((String) boardContents.get(68));

    }

    @FXML
    void mine99Clicked(ActionEvent event) {
    	mine99.setText((String) boardContents.get(77));

    }

    @FXML
    void mine98Clicked(ActionEvent event) {
    	mine98.setText((String) boardContents.get(76));
    	
    }

    @FXML
    void mine97Clicked(ActionEvent event) {
    	mine97.setText((String) boardContents.get(75));
    }

    @FXML
    void mine96Clicked(ActionEvent event) {
    	mine96.setText((String) boardContents.get(74));

    }

    @FXML
    void mine95Clicked(ActionEvent event) {
    	mine95.setText((String) boardContents.get(73));

    }

    @FXML
    void mine94Clicked(ActionEvent event) {
    	mine94.setText((String) boardContents.get(72));

    }

    @FXML
    void mine93Clicked(ActionEvent event) {
    	mine93.setText((String) boardContents.get(71));

    }

    @FXML
    void mine92Clicked(ActionEvent event) {
    	mine92.setText((String) boardContents.get(70));

    }

    @FXML
    void mine91Clicked(ActionEvent event) {
    	mine91.setText((String) boardContents.get(69));

    }
    
    
    
    
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