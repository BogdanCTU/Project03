package GamesUI.HorseRacing;

import Utilities.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class RaceResults extends JFrame{
    ImageIcon backGround=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//6tuy8e10bg251.jpg");
    ImageIcon winnerDiego=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//7fb26f33dcf0fc5e3e0bde56af81b56f.jpg");
    ImageIcon winnerGyro=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//EFC2ZnVUYAAtNFX.png");
    ImageIcon winnerJohnny=new ImageIcon("Casino//src//GamesUI/HorseRacing//Images//Johnny-Joestar-jojos-bizarre-adventure-40409230-353-576.png");
    ImageIcon winnerHotPants=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//Hot_Pants.png");
    ImageIcon winPic=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//a604rad7j4651-1.png");
    ImageIcon losePic=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//99b2f0ef3888532238e57c615a89019a.jpg");
   //
    public int winner=4;
    Random rnd=new Random();
    //
    private JPanel HRResults;
    private JButton backButton;
    private JLabel winnerAnnounce;
    private JLabel labelPic;
    private JLabel winLabel;
    private JLabel loseLabel;
    private JLabel winLabelPic;
    private JLabel loseLabelPic;
    private HorseRacingUI horseRacingForm;
    private JFrame hrResults;
    private JPanel contentPanel;
    private JLabel backgroundLabel;

    public RaceResults(HorseRacingUI horseRacingForm) {
        this.hrResults = new JFrame("Results");
        this.hrResults.setVisible(false);
        this.horseRacingForm = horseRacingForm;

    //
        this.labelPic.setSize(500,800);
        this.labelPic.setText("");
        this.loseLabelPic.setSize(500,800);
        this.winLabelPic.setSize(500,800);
        this.HRResults.setSize(1920,1080);
        this.HRResults.setOpaque(false);
        this.backgroundLabel=new JLabel();
        this.backgroundLabel.setIcon(backGround);
        this.backgroundLabel.setSize(1920,1080);
        this.contentPanel=new JPanel(null);
        this.contentPanel.setSize(1920,1040);
        this.contentPanel.add(HRResults);
        this.contentPanel.add(backgroundLabel);

    //Pic manipulations

        /*switch(winner){
            case 0:labelPic.setIcon(imageScale(winnerDiego,labelPic));
                break;
            case 1: labelPic.setIcon(imageScale(winnerGyro,labelPic));
                break;
            case 2:labelPic.setIcon(imageScale(winnerJohnny,labelPic));
                break;
            case 3:labelPic.setIcon(imageScale(winnerHotPants,labelPic));
                break;
            default:labelPic.setText("Error");

        }*/


        //
            backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetScreen();
                hrResults.setVisible(false);
                winner=rnd.nextInt(4);
                horseRacingForm.displayHRFrame();
                horseRacingForm.resetFrame();
            }
        });
    }
    public void displayResultsFrame() {

        hrResults.setContentPane(this.contentPanel);
        hrResults.setExtendedState(JFrame.MAXIMIZED_BOTH);
        hrResults.setResizable(false);
        // hrInfoFrame.setSize(400,400);
        hrResults.setVisible(true);
        winnerChecker();

    }
    /*public void winnerChecker(){
        this.winner=rnd.nextInt(4);

        if (this.winner == 0) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            labelPic.setIcon(imageScale(winnerDiego, labelPic));

        } else if (this.winner == 1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            labelPic.setIcon(imageScale(winnerGyro, labelPic));
        } else if (this.winner == 2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            labelPic.setIcon(imageScale(winnerJohnny, labelPic));
        } else if (this.winner == 3) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            labelPic.setIcon(imageScale(winnerHotPants, labelPic));
        }
    }*/
    public void winnerChecker(){
        this.winner=rnd.nextInt(4);

        if (this.winner == 0) {
            labelPic.setIcon(imageScale(winnerDiego, labelPic));
        }
        else if (this.winner == 1) {

            labelPic.setIcon(imageScale(winnerGyro, labelPic));

        } else if (this.winner == 2) {
            labelPic.setIcon(imageScale(winnerJohnny, labelPic));

        } else if (this.winner == 3) {
            labelPic.setIcon(imageScale(winnerHotPants, labelPic));
        }

        if (this.horseRacingForm.getChoice()==this.winner) {
            this.winLabelPic.setVisible(true);
            this.winLabelPic.setIcon(imageScale(losePic, winLabelPic));
            this.winLabel.setVisible(true);
            User.userMoney+=horseRacingForm.bet;
        }
        else if (this.horseRacingForm.getChoice()==this.winner) {
            this.winLabelPic.setVisible(true);
            this.winLabelPic.setIcon(imageScale(losePic, winLabelPic));
            this.winLabel.setVisible(true);
            User.userMoney+=horseRacingForm.bet;
        }
        else if (this.horseRacingForm.getChoice()==this.winner) {
            this.winLabelPic.setVisible(true);
            this.winLabelPic.setIcon(imageScale(losePic, winLabelPic));
            this.winLabel.setVisible(true);
            User.userMoney+=horseRacingForm.bet;
        }
        else if (this.horseRacingForm.getChoice()==this.winner) {
            this.winLabelPic.setVisible(true);
            this.winLabelPic.setIcon(imageScale(losePic, winLabelPic));
            this.winLabel.setVisible(true);
            User.userMoney+=horseRacingForm.bet;
        }
        else{
            this.loseLabel.setVisible(true);
            this.loseLabelPic.setIcon(imageScale(winPic, winLabelPic));
            this.loseLabelPic.setVisible(true);
        }

    }
    public void resetScreen(){
        this.loseLabelPic.setVisible(false);
        this.loseLabel.setVisible(false);
        this.winLabelPic.setVisible(false);
        this.winLabel.setVisible(false);
    }
    public ImageIcon imageScale(ImageIcon image,JLabel label){
        Image img=image.getImage();
        Image imgScale=img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon imgIcon=new ImageIcon(imgScale);
        return imgIcon;
    }
}
