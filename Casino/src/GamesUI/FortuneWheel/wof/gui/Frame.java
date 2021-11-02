package GamesUI.FortuneWheel.wof.gui;

import GamesUI.FortuneWheel.wof.game.RoataNorocului;

import javax.swing.JFrame;

public class Frame extends JFrame {

    public Frame() {
        super("Roata Norocului");

        RoataNorocului game = new RoataNorocului();
        PanelScor scorPanel = new PanelScor(game);
        PanelRoata wheelPanel = new PanelRoata(game,scorPanel);

        add(scorPanel);
        add(wheelPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    /*
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame();
            }
        });
    }
    */
}