package GamesUI.FortuneWheel;


import GamesUI.MainMenu;
import Utilities.User;
//import GamesUI.FortuneWheel.wof.gui.PanelScor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FortuneWheelUI extends JFrame{
    // UTILITIES
    private JButton backMenuButton;
    private JPanel FWPanel;
    private JButton UserImageFW;
    private JLabel UserLabelFW;
    private JButton refreshButton;
    private JButton playGameButton;
    private JFrame fortuneWheelFrame;

    private MainMenu mainMenuframe;

    // CONSTRUCTOR

    public FortuneWheelUI(MainMenu mainMenuframe) {

        //super();
        //RoataNorocului game = new RoataNorocului();
        //PanelScor scorPanel = new PanelScor(game);
        //PanelRoata wheelPanel = new PanelRoata(game,scorPanel);
        //add(scorPanel);
        //add(wheelPanel);

        this.fortuneWheelFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;

        backMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                fortuneWheelFrame.setVisible(false);
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(User.casinoUser.getUserName() != null) UserLabelFW.setText("User: " + User.casinoUser.getUserName() + " / Currency: " + User.userMoney);
                if(User.casinoUser.getUserIcon() != null) UserImageFW.setIcon(User.casinoUser.getUserIcon());
            }
        });

        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mainMenuJFrame.setVisible(false);     //TODO need back button

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new wof.gui.Frame();
                    }
                });
            }
        });

    }

    // METHODS
    public void displayFWFrame(){

        fortuneWheelFrame.setContentPane(this.FWPanel);
        fortuneWheelFrame.setSize(400,400);
        fortuneWheelFrame.setVisible(true);
    }


    /*
    public FortuneWheelUI(MainMenu mainMenuframe) {
        super("Roata Norocului");
        RoataNorocului game = new RoataNorocului();
        PanelScor scorPanel = new PanelScor(game);
        PanelRoata wheelPanel = new PanelRoata(game,scorPanel);
        add(scorPanel);
        add(wheelPanel);
    }
    */

    public JPanel getFWPanel() { return FWPanel; }

    // COD IOANA
    // aici sunt operatile mele




    //EOF - end of file
}
