// Tarca Silviu

package GamesUI.HorseRacing;

import GamesUI.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HorseRacingUI {
    // UTILITIES
    private JButton backMenuButton;
    private JPanel HRPanel;
    private JButton userImage;
    private JLabel userLabel;
    private JButton twoHorseRaceButton;
    private JButton hsInfoButton;
    private JButton fourHorseRaceButton;
    private JLabel horseTitle;

    private JFrame horseRacingFrame;
    private HorseRacingInfo hsInfoFrame;
    private MainMenu mainMenuframe;

    //sarutmana
    // CONSTRUCTOR
    public HorseRacingUI(MainMenu mainMenuframe) {
        this.horseRacingFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;
        this.hsInfoFrame=new HorseRacingInfo(this);

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
        //sf cod silviu
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

    //cod silviu

    //EOF - end of file
}
