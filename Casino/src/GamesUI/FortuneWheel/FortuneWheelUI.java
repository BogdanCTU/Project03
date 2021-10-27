package GamesUI.FortuneWheel;

import GamesUI.MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FortuneWheelUI {
    // UTILITIES
    private JButton backMenuButton;
    private JPanel FWPanel;
    private JFrame fortuneWheelFrame;

    private MainMenu mainMenuframe;

    // CONSTRUCTOR
    public FortuneWheelUI(MainMenu mainMenuframe) {
        this.fortuneWheelFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;

        backMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                fortuneWheelFrame.setVisible(false);
            }
        });

    }

    // METHODS
    public void displayFWFrame(){
        fortuneWheelFrame.setContentPane(this.FWPanel);
        fortuneWheelFrame.setSize(400,400);
        fortuneWheelFrame.setVisible(true);
    }

    public JPanel getFWPanel() { return FWPanel; }

    //EOF - end of file
}
