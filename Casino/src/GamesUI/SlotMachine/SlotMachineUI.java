package GamesUI.SlotMachine;

import GamesUI.MainMenu;
import Utilities.Deck;
import Utilities.User;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SlotMachineUI {
    // UTILITIES
    private JPanel SlotMachinePannel;
    private JButton backMenuButton;
    private JButton userImageSM;
    private JLabel userLabelSM;
    private JButton refreshButton;
    private JButton line_1_1;
    private JButton line_1_2;
    private JButton line_1_3;
    private JButton line_2_1;
    private JButton line_2_2;
    private JButton line_2_3;
    private JButton line_3_1;
    private JButton line_3_2;
    private JButton line_3_3;
    private JButton bet50Button;
    private JPanel SlotMachineGamePannel;
    private JButton bet100Button;
    private JButton bet200Button;
    private JButton spinButton;
    private JLabel currentbetLabel;

    private MainMenu mainMenuframe;
    private JFrame slotMachineFrame;

    // TIMER
    Timer timer = new Timer (100, e->{});

    // LOCAL VARIABLES
    Random rnd = new Random();
    private int line11rnd = 0;
    private int line21rnd = 0;
    private int line31rnd = 0;
    private int line12rnd = 0;
    private int line22rnd = 0;
    private int line32rnd = 0;
    private int line13rnd = 0;
    private int line23rnd = 0;
    private int line33rnd = 0;
    private int currentBet = 50;   // basic bet
    private int spinCount = 0;   // reglementare spin 200 (prea multe optiuni pozitive)

    // CONSTRUCTOR
    public SlotMachineUI(MainMenu mainMenuframe) {
        timer.start();
        this.slotMachineFrame = new JFrame("Slot Machine Frame");
        this.mainMenuframe = mainMenuframe;

        backMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                slotMachineFrame.setVisible(false);
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(User.casinoUser.getUserName() != null) userLabelSM.setText("User: " + User.casinoUser.getUserName() + " / Currency: " + User.userMoney);
                if(User.casinoUser.getUserIcon() != null) userImageSM.setIcon(User.casinoUser.getUserIcon());
            }
        });

        bet50Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentBet = 50;
                currentbetLabel.setText("Current bet: " + currentBet);
            }
        });

        bet100Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentBet = 100;
                currentbetLabel.setText("Current bet: " + currentBet);
            }
        });

        bet200Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentBet = 200;
                currentbetLabel.setText("Current bet: " + currentBet);
            }
        });

        spinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(User.casinoUser.getUserName() != null) userLabelSM.setText("User: " + User.casinoUser.getUserName() + " / Currency: " + User.userMoney);


                    line11rnd = rnd.nextInt(1, 40);
                    line21rnd = rnd.nextInt(1, 40);
                    line31rnd = rnd.nextInt(1, 40);
                    line12rnd = rnd.nextInt(1, 40);
                    line22rnd = rnd.nextInt(1, 40);
                    line32rnd = rnd.nextInt(1, 40);
                    line13rnd = rnd.nextInt(1, 40);
                    line23rnd = rnd.nextInt(1, 40);
                    line33rnd = rnd.nextInt(1, 40);

                    line_1_1.setIcon(Deck.deck[line11rnd].GetImage());
                    line_1_2.setIcon(Deck.deck[line12rnd].GetImage());
                    line_1_3.setIcon(Deck.deck[line13rnd].GetImage());
                    line_2_1.setIcon(Deck.deck[line21rnd].GetImage());
                    line_2_2.setIcon(Deck.deck[line22rnd].GetImage());
                    line_2_3.setIcon(Deck.deck[line23rnd].GetImage());
                    line_3_1.setIcon(Deck.deck[line31rnd].GetImage());
                    line_3_2.setIcon(Deck.deck[line32rnd].GetImage());
                    line_3_3.setIcon(Deck.deck[line33rnd].GetImage());


                slotMachine();
                User.userMoney -= currentBet;
            }
        });



//a
    }

    // METHODS
    public void displaySMFrame(){
        slotMachineFrame.setContentPane(this.SlotMachinePannel);
        slotMachineFrame.setSize(450,500);
        slotMachineFrame.setVisible(true);
    }

    //a
    //path relativ pentru carti
    //cauta

    public void slotMachine(){
        if(currentBet == 50){
            if ((line11rnd == line12rnd && line12rnd == line13rnd) || (line21rnd == line22rnd && line22rnd == line23rnd) || (line31rnd == line32rnd && line32rnd == line33rnd)){
                User.userMoney += 200;
            }
            if ((line13rnd == (line12rnd + 1) && line12rnd == (line11rnd + 1)) || (line23rnd == (line22rnd + 1) && line22rnd == (line21rnd + 1)) || (line33rnd == (line32rnd + 1) && line32rnd == (line31rnd + 1))){
                User.userMoney += 150;
            }
            if (((line11rnd >= 1 && line11rnd <= 10) && (line12rnd >= 1 && line12rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) || ((line21rnd >= 1 && line21rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line23rnd >= 1 && line23rnd <= 10)) || ((line31rnd >= 1 && line31rnd <= 10) && (line32rnd >= 1 && line32rnd <= 10) && (line33rnd >= 1 && line33rnd <= 10))){
                User.userMoney += 100;
            }
            if (((line11rnd >= 11 && line11rnd <= 20) && (line12rnd >= 11 && line12rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) || ((line21rnd >= 11 && line21rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line23rnd >= 11 && line23rnd <= 20)) || ((line31rnd >= 11 && line31rnd <= 20) && (line32rnd >= 11 && line32rnd <= 20) && (line33rnd >= 11 && line33rnd <= 20))){
                User.userMoney += 100;
            }
            if (((line11rnd >= 21 && line11rnd <= 30) && (line12rnd >= 21 && line12rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) || ((line21rnd >= 21 && line21rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line23rnd >= 21 && line23rnd <= 30)) || ((line31rnd >= 21 && line31rnd <= 30) && (line32rnd >= 21 && line32rnd <= 30) && (line33rnd >= 21 && line33rnd <= 30))){
                User.userMoney += 100;
            }
            if (((line11rnd >= 31 && line11rnd <= 40) && (line12rnd >= 31 && line12rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) || ((line21rnd >= 31 && line21rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line23rnd >= 31 && line23rnd <= 40)) || ((line31rnd >= 31 && line31rnd <= 40) && (line32rnd >= 31 && line32rnd <= 40) && (line33rnd >= 31 && line33rnd <= 40))){
                User.userMoney += 100;
            }
        }
        else if (currentBet == 100){
            if ((line11rnd == line12rnd && line12rnd == line13rnd) || (line21rnd == line22rnd && line22rnd == line23rnd) || (line31rnd == line32rnd && line32rnd == line33rnd)){
                User.userMoney += 400;
            }
            if ((line13rnd == (line12rnd + 1) && line12rnd == (line11rnd + 1)) || (line23rnd == (line22rnd + 1) && line22rnd == (line21rnd + 1)) || (line33rnd == (line32rnd + 1) && line32rnd == (line31rnd + 1))){
                User.userMoney += 300;
            }
            if (((line11rnd >= 1 && line11rnd <= 10) && (line12rnd >= 1 && line12rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) || ((line21rnd >= 1 && line21rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line23rnd >= 1 && line23rnd <= 10)) || ((line31rnd >= 1 && line31rnd <= 10) && (line32rnd >= 1 && line32rnd <= 10) && (line33rnd >= 1 && line33rnd <= 10))){
                User.userMoney += 200;
            }
            if (((line11rnd >= 11 && line11rnd <= 20) && (line12rnd >= 11 && line12rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) || ((line21rnd >= 11 && line21rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line23rnd >= 11 && line23rnd <= 20)) || ((line31rnd >= 11 && line31rnd <= 20) && (line32rnd >= 11 && line32rnd <= 20) && (line33rnd >= 11 && line33rnd <= 20))){
                User.userMoney += 200;
            }
            if (((line11rnd >= 21 && line11rnd <= 30) && (line12rnd >= 21 && line12rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) || ((line21rnd >= 21 && line21rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line23rnd >= 21 && line23rnd <= 30)) || ((line31rnd >= 21 && line31rnd <= 30) && (line32rnd >= 21 && line32rnd <= 30) && (line33rnd >= 21 && line33rnd <= 30))){
                User.userMoney += 200;
            }
            if (((line11rnd >= 31 && line11rnd <= 40) && (line12rnd >= 31 && line12rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) || ((line21rnd >= 31 && line21rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line23rnd >= 31 && line23rnd <= 40)) || ((line31rnd >= 31 && line31rnd <= 40) && (line32rnd >= 31 && line32rnd <= 40) && (line33rnd >= 31 && line33rnd <= 40))){
                User.userMoney += 200;
            }
            if ((line11rnd == line22rnd && line22rnd == line33rnd) || (line31rnd == line22rnd && line22rnd == line13rnd) || (line21rnd == line12rnd && line12rnd == line33rnd) || (line11rnd == line32rnd && line32rnd == line23rnd) || (line21rnd == line32rnd && line32rnd == line13rnd) || (line31rnd == line12rnd && line12rnd == line23rnd)) {
                User.userMoney += 400;
            }
            if (((line33rnd == (line22rnd + 1)) && (line22rnd == (line11rnd + 1))) || ((line13rnd == (line22rnd + 1)) && (line22rnd == (line31rnd + 1))) || ((line32rnd == (line12rnd + 1)) && (line12rnd == (line31rnd + 1))) || ((line31rnd == (line32rnd + 1)) && (line32rnd == (line21rnd + 1)))) {
                User.userMoney += 300;
            }
            if (((line11rnd >= 1 && line11rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line33rnd >= 1 && line33rnd <= 10)) || ((line31rnd >= 1 && line31rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) || ((line12rnd >= 1 && line12rnd <= 10) && (line23rnd >= 1 && line23rnd <= 10) && (line31rnd >= 1 && line31rnd <= 10)) || ((line21rnd >= 1 && line21rnd <= 10) && (line32rnd >= 1 && line32rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) ){
                User.userMoney += 200;
            }
            if (((line11rnd >= 11 && line11rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line33rnd >= 11 && line33rnd <= 20)) || ((line31rnd >= 11 && line31rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) || ((line12rnd >= 11 && line12rnd <= 20) && (line23rnd >= 11 && line23rnd <= 20) && (line31rnd >= 11 && line31rnd <= 20)) || ((line21rnd >= 11 && line21rnd <= 20) && (line32rnd >= 11 && line32rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) ){
                User.userMoney += 200;
            }
            if (((line11rnd >= 21 && line11rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line33rnd >= 21 && line33rnd <= 30)) || ((line31rnd >= 21 && line31rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) || ((line12rnd >= 21 && line12rnd <= 30) && (line23rnd >= 21 && line23rnd <= 30) && (line31rnd >= 21 && line31rnd <= 30)) || ((line21rnd >= 21 && line21rnd <= 30) && (line32rnd >= 21 && line32rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) ){
                User.userMoney += 200;
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        //
            if (((line11rnd >= 31 && line11rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line33rnd >= 31 && line33rnd <= 40)) || ((line31rnd >= 31 && line31rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) || ((line12rnd >= 31 && line12rnd <= 40) && (line23rnd >= 31 && line23rnd <= 40) && (line31rnd >= 31 && line31rnd <= 40)) || ((line21rnd >= 31 && line21rnd <= 40) && (line32rnd >= 31 && line32rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) ){
                User.userMoney += 200;
            }
        }
        else if (currentBet == 200){
            spinCount += 1;
            if ((line11rnd == line12rnd && line12rnd == line13rnd) || (line21rnd == line22rnd && line22rnd == line23rnd) || (line31rnd == line32rnd && line32rnd == line33rnd)){
                User.userMoney += 800;
            }
            if ((line13rnd == (line12rnd + 1) && line12rnd == (line11rnd + 1)) || (line23rnd == (line22rnd + 1) && line22rnd == (line21rnd + 1)) || (line33rnd == (line32rnd + 1) && line32rnd == (line31rnd + 1))){
                User.userMoney += 600;
            }
            if (((line11rnd >= 1 && line11rnd <= 10) && (line12rnd >= 1 && line12rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) || ((line21rnd >= 1 && line21rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line23rnd >= 1 && line23rnd <= 10)) || ((line31rnd >= 1 && line31rnd <= 10) && (line32rnd >= 1 && line32rnd <= 10) && (line33rnd >= 1 && line33rnd <= 10))){
                User.userMoney += 400;
            }
            if (((line11rnd >= 11 && line11rnd <= 20) && (line12rnd >= 11 && line12rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) || ((line21rnd >= 11 && line21rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line23rnd >= 11 && line23rnd <= 20)) || ((line31rnd >= 11 && line31rnd <= 20) && (line32rnd >= 11 && line32rnd <= 20) && (line33rnd >= 11 && line33rnd <= 20))){
                User.userMoney += 400;
            }
            if (((line11rnd >= 21 && line11rnd <= 30) && (line12rnd >= 21 && line12rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) || ((line21rnd >= 21 && line21rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line23rnd >= 21 && line23rnd <= 30)) || ((line31rnd >= 21 && line31rnd <= 30) && (line32rnd >= 21 && line32rnd <= 30) && (line33rnd >= 21 && line33rnd <= 30))){
                User.userMoney += 400;
            }
            if (((line11rnd >= 31 && line11rnd <= 40) && (line12rnd >= 31 && line12rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) || ((line21rnd >= 31 && line21rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line23rnd >= 31 && line23rnd <= 40)) || ((line31rnd >= 31 && line31rnd <= 40) && (line32rnd >= 31 && line32rnd <= 40) && (line33rnd >= 31 && line33rnd <= 40))){
                User.userMoney += 400;
            }
            if ((line11rnd == line22rnd && line22rnd == line33rnd) || (line31rnd == line22rnd && line22rnd == line13rnd) || (line21rnd == line12rnd && line12rnd == line33rnd) || (line11rnd == line32rnd && line32rnd == line23rnd) || (line21rnd == line32rnd && line32rnd == line13rnd) || (line31rnd == line12rnd && line12rnd == line23rnd)) {
                User.userMoney += 800;
            }
            if (((line33rnd == (line22rnd + 1)) && (line22rnd == (line11rnd + 1))) || ((line13rnd == (line22rnd + 1)) && (line22rnd == (line31rnd + 1))) || ((line32rnd == (line12rnd + 1)) && (line12rnd == (line31rnd + 1))) || ((line31rnd == (line32rnd + 1)) && (line32rnd == (line21rnd + 1)))) {
                User.userMoney += 600;
            }
            if (((line11rnd >= 1 && line11rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line33rnd >= 1 && line33rnd <= 10)) || ((line31rnd >= 1 && line31rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) || ((line12rnd >= 1 && line12rnd <= 10) && (line23rnd >= 1 && line23rnd <= 10) && (line31rnd >= 1 && line31rnd <= 10)) || ((line21rnd >= 1 && line21rnd <= 10) && (line32rnd >= 1 && line32rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10))){
                User.userMoney += 400;
            }
            if (((line11rnd >= 11 && line11rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line33rnd >= 11 && line33rnd <= 20)) || ((line31rnd >= 11 && line31rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) || ((line12rnd >= 11 && line12rnd <= 20) && (line23rnd >= 11 && line23rnd <= 20) && (line31rnd >= 11 && line31rnd <= 20)) || ((line21rnd >= 11 && line21rnd <= 20) && (line32rnd >= 11 && line32rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20))){
                User.userMoney += 400;
            }
            if (((line11rnd >= 21 && line11rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line33rnd >= 21 && line33rnd <= 30)) || ((line31rnd >= 21 && line31rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) || ((line12rnd >= 21 && line12rnd <= 30) && (line23rnd >= 21 && line23rnd <= 30) && (line31rnd >= 21 && line31rnd <= 30)) || ((line21rnd >= 21 && line21rnd <= 30) && (line32rnd >= 21 && line32rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30))){
                User.userMoney += 400;
            }
            if (((line11rnd >= 31 && line11rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line33rnd >= 31 && line33rnd <= 40)) || ((line31rnd >= 31 && line31rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) || ((line12rnd >= 31 && line12rnd <= 40) && (line23rnd >= 31 && line23rnd <= 40) && (line31rnd >= 31 && line31rnd <= 40)) || ((line21rnd >= 31 && line21rnd <= 40) && (line32rnd >= 31 && line32rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40))){
                User.userMoney += 400;
            }
            if(spinCount == 3) {
                if ((line11rnd == line32rnd && line32rnd == line13rnd) || (line21rnd == line12rnd && line12rnd == line23rnd) || (line31rnd == line22rnd && line22rnd == line33rnd) || (line11rnd == line12rnd && line12rnd == line23rnd) || (line21rnd == line22rnd && line22rnd == line33rnd) || (line31rnd == line32rnd && line32rnd == line13rnd) || (line11rnd == line32rnd && line32rnd == line33rnd) || (line21rnd == line12rnd && line12rnd == line13rnd) || (line31rnd == line22rnd && line22rnd == line23rnd)) {
                    User.userMoney += 800;
                }
                if ((line13rnd == (line32rnd + 1) && line32rnd == (line11rnd + 1)) || (line23rnd == (line12rnd + 1) && line12rnd == (line21rnd + 1)) || (line33rnd == (line22rnd + 1) && line22rnd == (line31rnd + 1)) || (line23rnd == (line12rnd + 1) && line12rnd == (line11rnd + 1)) || (line33rnd == (line22rnd + 1) && line22rnd == (line21rnd + 1)) || (line13rnd == (line32rnd + 1) && line32rnd == (line31rnd + 1)) || (line33rnd == (line32rnd + 1) && line32rnd == (line11rnd + 1)) || (line23rnd == (line22rnd + 1) && line22rnd == (line31rnd + 1)) || (line13rnd == (line12rnd + 1) && line12rnd == (line21rnd + 1))) {
                    User.userMoney += 600;
                }
                if (((line11rnd >= 1 && line11rnd <= 10) && (line12rnd >= 1 && line12rnd <= 10) && (line23rnd >= 1 && line23rnd <= 10)) || ((line21rnd >= 1 && line21rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line33rnd >= 1 && line33rnd <= 10)) || ((line31rnd >= 1 && line31rnd <= 10) && (line32rnd >= 1 && line32rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) || ((line11rnd >= 1 && line11rnd <= 10) && (line32rnd >= 1 && line32rnd <= 10) && (line33rnd >= 1 && line33rnd <= 10)) || ((line21rnd >= 1 && line21rnd <= 10) && (line12rnd >= 1 && line12rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) || ((line31rnd >= 1 && line31rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line23rnd >= 1 && line23rnd <= 10)) || ((line11rnd >= 1 && line11rnd <= 10) && (line32rnd >= 1 && line32rnd <= 10) && (line13rnd >= 1 && line13rnd <= 10)) || ((line21rnd >= 1 && line21rnd <= 10) && (line12rnd >= 1 && line12rnd <= 10) && (line23rnd >= 1 && line23rnd <= 10)) || ((line31rnd >= 1 && line31rnd <= 10) && (line22rnd >= 1 && line22rnd <= 10) && (line33rnd >= 1 && line33rnd <= 10))) {
                    User.userMoney += 400;
                }
                if (((line11rnd >= 11 && line11rnd <= 20) && (line12rnd >= 11 && line12rnd <= 20) && (line23rnd >= 11 && line23rnd <= 20)) || ((line21rnd >= 11 && line21rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line33rnd >= 11 && line33rnd <= 20)) || ((line31rnd >= 11 && line31rnd <= 20) && (line32rnd >= 11 && line32rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) || ((line11rnd >= 11 && line11rnd <= 20) && (line32rnd >= 11 && line32rnd <= 20) && (line33rnd >= 11 && line33rnd <= 20)) || ((line21rnd >= 11 && line21rnd <= 20) && (line12rnd >= 11 && line12rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) || ((line31rnd >= 11 && line31rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line23rnd >= 11 && line23rnd <= 20)) || ((line11rnd >= 11 && line11rnd <= 20) && (line32rnd >= 11 && line32rnd <= 20) && (line13rnd >= 11 && line13rnd <= 20)) || ((line21rnd >= 11 && line21rnd <= 20) && (line12rnd >= 11 && line12rnd <= 20) && (line23rnd >= 11 && line23rnd <= 20)) || ((line31rnd >= 11 && line31rnd <= 20) && (line22rnd >= 11 && line22rnd <= 20) && (line33rnd >= 11 && line33rnd <= 20))) {
                    User.userMoney += 400;
                }
                if (((line11rnd >= 21 && line11rnd <= 30) && (line12rnd >= 21 && line12rnd <= 30) && (line23rnd >= 21 && line23rnd <= 30)) || ((line21rnd >= 21 && line21rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line33rnd >= 21 && line33rnd <= 30)) || ((line31rnd >= 21 && line31rnd <= 30) && (line32rnd >= 21 && line32rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) || ((line11rnd >= 21 && line11rnd <= 30) && (line32rnd >= 21 && line32rnd <= 30) && (line33rnd >= 21 && line33rnd <= 30)) || ((line21rnd >= 21 && line21rnd <= 30) && (line12rnd >= 21 && line12rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) || ((line31rnd >= 21 && line31rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line23rnd >= 21 && line23rnd <= 30)) || ((line11rnd >= 21 && line11rnd <= 30) && (line32rnd >= 21 && line32rnd <= 30) && (line13rnd >= 21 && line13rnd <= 30)) || ((line21rnd >= 21 && line21rnd <= 30) && (line12rnd >= 21 && line12rnd <= 30) && (line23rnd >= 21 && line23rnd <= 30)) || ((line31rnd >= 21 && line31rnd <= 30) && (line22rnd >= 21 && line22rnd <= 30) && (line33rnd >= 21 && line33rnd <= 30))) {
                    User.userMoney += 400;
                }
                if (((line11rnd >= 31 && line11rnd <= 40) && (line12rnd >= 31 && line12rnd <= 40) && (line23rnd >= 31 && line23rnd <= 40)) || ((line21rnd >= 31 && line21rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line33rnd >= 31 && line33rnd <= 40)) || ((line31rnd >= 31 && line31rnd <= 40) && (line32rnd >= 31 && line32rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) || ((line11rnd >= 31 && line11rnd <= 40) && (line32rnd >= 31 && line32rnd <= 40) && (line33rnd >= 31 && line33rnd <= 40)) || ((line21rnd >= 31 && line21rnd <= 40) && (line12rnd >= 31 && line12rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) || ((line31rnd >= 31 && line31rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line23rnd >= 31 && line23rnd <= 40)) || ((line11rnd >= 31 && line11rnd <= 40) && (line32rnd >= 31 && line32rnd <= 40) && (line13rnd >= 31 && line13rnd <= 40)) || ((line21rnd >= 31 && line21rnd <= 40) && (line12rnd >= 31 && line12rnd <= 40) && (line23rnd >= 31 && line23rnd <= 40)) || ((line31rnd >= 31 && line31rnd <= 40) && (line22rnd >= 31 && line22rnd <= 40) && (line33rnd >= 31 && line33rnd <= 40))) {
                    User.userMoney += 400;
                }
                spinCount = 0;
            }
        }
    }

    public JPanel getSMPanel() { return SlotMachinePannel; }

    // EOF
}
