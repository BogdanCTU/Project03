package GamesUI.Game_4.DiceGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollDicePanel extends JFrame {

    private static final long serialVersionUID = 1L;

    private final DiceGameModel model;

    private Dice myLeftDie;
    private Dice myRightDie;

    private InnerSquarePanel[] innerPanels;

    private JTextField scoreField1;
    private JTextField scoreField2;

    public RollDicePanel() {
        this.model = new DiceGameModel();

        this.setTitle("Dice Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(createOuterPanel(), BorderLayout.CENTER);
        this.pack();
        this.setLocationByPlatform(true);
        this.setVisible(true);
    }

    private JPanel createOuterPanel() {
        int length = model.getBoardSquares().size();
        this.innerPanels = new InnerSquarePanel[length];
        for (int index = 0; index < length; index++) {
            innerPanels[index] = new InnerSquarePanel(
                    model.getBoardSquares().get(index));
        }

        JPanel panel = new JPanel(new GridLayout(0, 3));
        panel.add(innerPanels[1].getPanel());
        panel.add(innerPanels[2].getPanel());
        panel.add(innerPanels[3].getPanel());
        panel.add(innerPanels[0].getPanel());
        panel.add(createCenterPanel());
        panel.add(innerPanels[4].getPanel());
        panel.add(innerPanels[7].getPanel());
        panel.add(innerPanels[6].getPanel());
        panel.add(innerPanels[5].getPanel());

        innerPanels[0].getPlayer1Label().setText("Player 1");
        innerPanels[0].getPlayer2Label().setText("Player 2");

        return panel;
    }

    private JPanel createCenterPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        Font font = new Font("Arial", Font.BOLD, 12);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridwidth = 1;

        gbc.gridx = 0;
        gbc.gridy = 0;
        JButton rollButton1 = new JButton("Player 1");
        rollButton1.setFont(font);
        rollButton1.addActionListener(new RollListener1());
        panel.add(rollButton1, gbc);

        gbc.gridx++;
        JButton rollButton2 = new JButton("Player 2");
        rollButton2.setFont(font);
        rollButton2.addActionListener(new RollListener2());
        panel.add(rollButton2, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        myLeftDie = new Dice();
        panel.add(myLeftDie, gbc);

        gbc.gridx++;
        myRightDie = new Dice();
        panel.add(myRightDie, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        JLabel label = new JLabel("Score");
        label.setFont(font);
        panel.add(label, gbc);

        gbc.gridx++;
        label = new JLabel("Score");
        label.setFont(font);
        panel.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        scoreField1 = new JTextField(4);
        scoreField1.setEditable(false);
        scoreField1.setFont(font);
        scoreField1.setHorizontalAlignment(JTextField.CENTER);
        panel.add(scoreField1, gbc);

        gbc.gridx++;
        scoreField2 = new JTextField(4);
        scoreField2.setEditable(false);
        scoreField2.setFont(font);
        scoreField2.setHorizontalAlignment(JTextField.CENTER);
        panel.add(scoreField2, gbc);

        return panel;
    }

    private class RollListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            int position = model.getPlayer1position();
            int roll = myLeftDie.roll();

            model.incrementPlayer1position(roll);
            BoardSquare boardSquare = model.getBoardSquares().get(
                    model.getPlayer1position());
            int score = boardSquare.execute(model.getPlayer1score());
            model.setPlayer1score(score);

            innerPanels[position].getPlayer1Label().setText(" ");
            innerPanels[model.getPlayer1position()].getPlayer1Label().
                    setText("Player 1");
            scoreField1.setText(Integer.toString(score));
        }
    }

    private class RollListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            int position = model.getPlayer2position();
            int roll = myRightDie.roll();

            model.incrementPlayer2position(roll);
            BoardSquare boardSquare = model.getBoardSquares().get(
                    model.getPlayer2position());
            int score = boardSquare.execute(model.getPlayer2score());
            model.setPlayer2score(score);

            innerPanels[position].getPlayer2Label().setText(" ");
            innerPanels[model.getPlayer2position()].getPlayer2Label().
                    setText("Player 2");
            scoreField2.setText(Integer.toString(score));
        }
    }

}
