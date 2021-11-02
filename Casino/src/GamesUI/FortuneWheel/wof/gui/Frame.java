package wof.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import wof.game.RoataNorocului;

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

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame();
            }
        });
    }
}