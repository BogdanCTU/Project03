package GamesUI.FortuneWheel.wof.gui;

import GamesUI.FortuneWheel.wof.game.RoataNorocului;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;

public class Panel extends JPanel {

    private static final int SQUARE_WIDTH = 35, SQUARE_HEIGHT = 45,
            SPACE_WIDTH = 2, PUZZLE_WIDTH = 12 * SQUARE_WIDTH,
            PUZZLE_HEIGHT = 4 * SQUARE_HEIGHT;

    private RoataNorocului game;
    private JLabel categoryLabel;

    private JLabel scoreLabel, turnsLabel;

    private JTextField scoreField, turnsField;
    public Panel(RoataNorocului game) {
        super();

        this.game = game;

        categoryLabel = new JLabel();
        categoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        categoryLabel.setBounds(23,21,32,12);
        add(categoryLabel);


        Box labelBox = Box.createVerticalBox();
        labelBox.add(Box.createVerticalStrut(400));
        labelBox.add(categoryLabel);

        add(labelBox);
        setPreferredSize(new Dimension(900, 250));
    }

    public void newGame() {
        repaint();
    }
}





