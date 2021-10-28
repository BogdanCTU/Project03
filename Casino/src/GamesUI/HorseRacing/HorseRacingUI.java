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
    private JButton infoButton;
    private JFrame horseRacingFrame;

    private MainMenu mainMenuframe;

    // CONSTRUCTOR
    public HorseRacingUI(MainMenu mainMenuframe) {
        this.horseRacingFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;

        backMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                horseRacingFrame.setVisible(false);
            }
        });

        //cod silviu
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        //sfarsit cod silviu

    }

    // METHODS
    public void displayMainFrame(){
        horseRacingFrame.setContentPane(this.HRPanel);
        horseRacingFrame.setSize(400,400);
        horseRacingFrame.setVisible(true);
    }

    public JPanel getHorsePannel() { return HRPanel; }

    //cod silviu


    //EOF - end of file
}
