package wof.gui;

import javax.swing.*;
import wof.game.RoataNorocului;

public class PanelScor extends JPanel {

    private RoataNorocului game;
    private JLabel scoreLabel, turnsLabel;
    public JTextField scoreField, turnsField;

    public PanelScor(RoataNorocului game) {
        super();
        this.game = game;

        scoreLabel = new JLabel("Scor:",JLabel.RIGHT);
        turnsLabel = new JLabel("Turns left:", JLabel.RIGHT);

        scoreField = new JTextField("$" + this.game.getScore());
        scoreField.setEditable(true);
        scoreField.setBounds(50,150,45,45);
        turnsField = new JTextField("" + this.game.getTurnsLeft());
        turnsField.setEditable(true);


    }

    public void addScore(int score) {
        game.addScore(score);
        scoreField.setText("$" + game.getScore());
    }

    public void resetScore() {
        game.resetScore();
        scoreField.setText("$" + game.getScore());
    }

    public void resetValues() {
        game.resetValues();
        turnsField.setText("" + game.getTurnsLeft());
        scoreField.setText("$" + game.getScore());
    }

    public void subtractTurn() {
        game.subtractTurn();
        turnsField.setText("" + game.getTurnsLeft());
    }
}