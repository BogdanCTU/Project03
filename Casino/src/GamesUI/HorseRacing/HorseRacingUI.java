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
    ImageIcon imageJohnny=new ImageIcon("C:\\Users\\tarca\\OneDrive\\Desktop\\Projects\\Casino\\src\\GamesUI\\HorseRacing\\Images\\Johnny_Joestar_Infobox_Manga.png");
    ImageIcon imageHotPants=new ImageIcon("C:\\Users\\tarca\\OneDrive\\Desktop\\Projects\\Casino\\src\\GamesUI\\HorseRacing\\Images\\PngItem_2830700.png");

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
    private JFrame horseRacingFrame;
    private HorseRacingInfo hsInfoFrame;
    private MainMenu mainMenuframe;

    //sarutmana
    // CONSTRUCTOR
    public HorseRacingUI(MainMenu mainMenuframe) {
        this.horseRacingFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;
        this.hsInfoFrame=new HorseRacingInfo(this);
        this.labelPic.setSize(400,700);
        this.labelPic.setText("");
       // this.labelPic.setIcon(imageScale(this.imageDiego,labelPic));

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
            }
        });
        horse2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPic.setIcon(imageScale(imageGyro,labelPic));

            }
        });
        horse3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPic.setIcon(imageScale(imageJohnny,labelPic));
            }
        });
        horse4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelPic.setIcon(imageScale(imageHotPants,labelPic));
            }
        });
    }

    // METHODS
    public void displayHRFrame(){
        horseRacingFrame.setContentPane(this.HRPanel);
        horseRacingFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        horseRacingFrame.setResizable(false);
        //horseRacingFrame.setSize(400,400);
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
