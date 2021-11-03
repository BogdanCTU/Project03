// Tarca Silviu

package GamesUI.HorseRacing;

import GamesUI.MainMenu;
import Utilities.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class HorseRacingUI{
    // UTILITIES
    ImageIcon imageDiego=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//400px-Diego_Brando_Infobox_Manga.png");
    ImageIcon imageGyro=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//pngkey.com-gyro-png-737618.png");
    ImageIcon imageJohnny=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//Johnny_Joestar_Infobox_Manga.png");
    ImageIcon imageHotPants=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//PngItem_2830700.png");
    ImageIcon backGround=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//6tuy8e10bg251.jpg");

    public int winner=0;
    public int bChoise=4;
    protected int bet=0;
    Random rand=new Random();
    private JButton backMenuButton;
    private JPanel HRPanel;
    private JButton userImageHR;
    private JLabel userLabel;
    private JButton horse2Button;
    private JButton hsInfoButton;
    private JButton horse4Button;
    private JLabel horseTitle;
    private JButton horse3Button;
    private JButton horse1Button;
    private JButton bet50;
    private JButton bet100;
    private JButton bet200;
    private JLabel labelPic;
    private JButton startRaceButton;
    private JLabel yourBetField;
    private JLabel horseChoseField;
    private JLabel horseNameField;
    private JLabel warnLabel;
    private JButton refreshButton;
    private JLabel userLabelHR;
    private JFrame horseRacingFrame;
    private RaceResults raceResults=new RaceResults(this);
    private HorseRacingInfo hsInfoFrame;
    private MainMenu mainMenuframe;
    private JPanel contentPanel;
    private JLabel backgroundLabel;


    // CONSTRUCTOR
    public HorseRacingUI(MainMenu mainMenuframe) {
        this.horseRacingFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;
        this.hsInfoFrame=new HorseRacingInfo(this);
        this.labelPic.setSize(500,800);
        this.labelPic.setText("");
        //this.labelPic.setIcon(imageScale(this.imageDiego,labelPic));

        this.HRPanel.setSize(1920,1080);
        this.HRPanel.setOpaque(false);
        this.backgroundLabel=new JLabel();
        this.backgroundLabel.setIcon(backGround);
        this.backgroundLabel.setSize(1920,1080);
        this.contentPanel=new JPanel(null);
        this.contentPanel.setSize(1920,1040);
        this.contentPanel.add(HRPanel);
        this.contentPanel.add(backgroundLabel);

        backMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                horseRacingFrame.setVisible(false);
            }
        });

        //cod silviu
        hsInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hsInfoFrame.displayHsInfoFrame();
                horseRacingFrame.setVisible(false);
            }
        });

        horse1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPic.setIcon(imageScale(imageDiego,labelPic));
                horseNameField.setText("Silver Bullet-Diego");
                horseChoseField.setText("Horse chosen:Silver Bullet");
                bChoise=0;
            }
        });

        horse2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPic.setIcon(imageScale(imageGyro,labelPic));
                horseNameField.setText("VALKYRIE-Gyro");
                horseChoseField.setText("Horse chosen:VALKYRIE");
                bChoise=1;
            }
        });

        horse3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            labelPic.setIcon(imageScale(imageJohnny,labelPic));
                horseNameField.setText("Slow Dancer-Johnny");
                horseChoseField.setText("Horse chosen:Slow Dancer");
                bChoise=2;
            }
        });

        horse4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPic.setIcon(imageScale(imageHotPants,labelPic));
                horseNameField.setText("Gets Up-Hot Pants");
                horseChoseField.setText("Horse chosen:Gets Up");
                bChoise=3;
            }
        });

        startRaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User.userMoney -= bet;
                if(bet==0){
                    warnLabel.setText("Pls place a bet!");
                }
                else if(bChoise==4){
                    warnLabel.setText("Pls choose an horse!");
                }
                else {

                    raceResults.displayResultsFrame();
                    horseRacingFrame.setVisible(false);
                    warnLabel.setText("");
                    resetFrame();
                }
            }
        });

        bet50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            yourBetField.setText("YOur bet:50$");
            bet=50;
            }
        });

        bet100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yourBetField.setText("YOur bet:100$");
                bet=100;
            }
        });

        bet200.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yourBetField.setText("YOur bet:200$");
                bet=200;
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User.userMoney-=bet;
                if(User.casinoUser.getUserName() != null) userLabelHR.setText("User: " + User.casinoUser.getUserName() + " / Currency: " + User.userMoney);
                if(User.casinoUser.getUserIcon() != null) userImageHR.setIcon(User.casinoUser.getUserIcon());
            }
        });
    }

    // METHODS
    public void displayHRFrame(){
        horseRacingFrame.setContentPane(this.contentPanel);
        horseRacingFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        horseRacingFrame.setResizable(false);
        //horseRacingFrame.setSize(550,550);
        horseRacingFrame.setVisible(true);
    }

    public JPanel getHorsePannel() { return HRPanel; }

    public void resetFrame(){

        this.bChoise=4;
        this.bet=0;
        this.labelPic.setIcon(null);
        this.horseNameField.setText(" ");
        this.yourBetField.setText("Your bet:0");
        this.horseChoseField.setText("Horse chosen:");
        //winnerRandomizer();
    }

    public int getChoice(){
        return this.bChoise;
    }

    public void winnerRandomizer(int var){
        var=this.rand.nextInt(3);
    }

    public ImageIcon imageScale(ImageIcon image,JLabel label){
      Image img=image.getImage();
      Image imgScale=img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
      ImageIcon imgIcon=new ImageIcon(imgScale);
      return imgIcon;
    }

    //EOF - end of file
}
