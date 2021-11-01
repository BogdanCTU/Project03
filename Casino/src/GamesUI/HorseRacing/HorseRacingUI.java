// Tarca Silviu

package GamesUI.HorseRacing;

import GamesUI.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HorseRacingUI{
    // UTILITIES
    ImageIcon imageDiego=new ImageIcon("C:\\Users\\tarca\\OneDrive\\Desktop\\Projects\\Casino\\src\\GamesUI\\HorseRacing\\Images\\400px-Diego_Brando_Infobox_Manga.png");
    ImageIcon imageGyro=new ImageIcon("C:\\Users\\tarca\\OneDrive\\Desktop\\Projects\\Casino\\src\\GamesUI\\HorseRacing\\Images\\pngkey.com-gyro-png-737618.png");
    ImageIcon imageJohnny=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//Johnny_Joestar_Infobox_Manga.png");
    ImageIcon imageHotPants=new ImageIcon("C:\\Users\\tarca\\OneDrive\\Desktop\\Projects\\Casino\\src\\GamesUI\\HorseRacing\\Images\\PngItem_2830700.png");
    ImageIcon backGround=new ImageIcon("Casino//src//GamesUI//HorseRacing//Images//6tuy8e10bg251.jpg");

    private short choice=4;
    private short bChoise=0;
    private int bet=0;

    private JButton backMenuButton;
    private JPanel HRPanel;
    private JButton userImage;
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
    private JFrame horseRacingFrame;
    private RaceResults raceResults=new RaceResults(this);
    private HorseRacingInfo hsInfoFrame;
    private MainMenu mainMenuframe;
    private JPanel contentPanel;
    private JLabel backgroundLabel;
    //sarutmana
    // CONSTRUCTOR
    public HorseRacingUI(MainMenu mainMenuframe) {
        this.horseRacingFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;
        this.hsInfoFrame=new HorseRacingInfo(this);
        this.labelPic.setSize(400,700);
        this.labelPic.setText("");
       // this.labelPic.setIcon(imageScale(this.imageDiego,labelPic));
        this.HRPanel.setSize(1920,1080);
        this.HRPanel.setOpaque(false);
        this.backgroundLabel=new JLabel();
        this.backgroundLabel.setIcon(backGround);
        this.backgroundLabel.setSize(1920,1080);
        this.contentPanel=new JPanel(null);
        this.contentPanel.setSize(1920,1040);
        this.contentPanel.add(HRPanel);
        this.contentPanel.add(backgroundLabel);
        this.horseChoseField.setText("");
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
                horseChoseField.setText("Horse chosen:Silver Bullet ");
            }
        });
        horse2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPic.setIcon(imageScale(imageGyro,labelPic));
                horseNameField.setText("VALKYRIE-Gyro");
                horseChoseField.setText("Horse chosen:VALKYRIE");
            }
        });
        horse3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            labelPic.setIcon(imageScale(imageJohnny,labelPic));
                horseNameField.setText("Slow Dancer-Johnny");
                horseChoseField.setText("Horse chosen:Slow Dancer");
            }
        });
        horse4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPic.setIcon(imageScale(imageHotPants,labelPic));
                horseNameField.setText("Gets Up-Hot Pants");
                horseChoseField.setText("Horse chosen:Gets Up");
            }
        });
        startRaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                raceResults.displayResultsFrame();
                horseRacingFrame.setVisible(false);
            }
        });
        bet50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            yourBetField.setText("YOur bet:50$");
            }
        });
        bet100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yourBetField.setText("YOur bet:100$");
            }
        });
        bet200.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yourBetField.setText("YOur bet:200$");
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

    public ImageIcon imageScale(ImageIcon image,JLabel label){
      Image img=image.getImage();
      Image imgScale=img.getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH);
      ImageIcon imgIcon=new ImageIcon(imgScale);
      return imgIcon;
    }
    //cod silviu

    //EOF - end of file
}
