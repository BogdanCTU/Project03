package Utilities;

import javax.swing.*;

public class Card {

    // VARIABLES
    private char suit;
    private int value;
    private int points;
    private Icon image;

    // CONSTRUCTOR
    public Card(char newSuit, int newValue, int newPoints, Icon newImage) {
        this.value = newValue;
        this.suit = newSuit;
        this.points = newPoints;
        this.image = newImage;
    }

    // METHODES
    public String ToString() {
        return GetSuitType() + this.value;
    }

    public String GetSuitType() {
        String suit;
        if (this.suit == 'C') {
            suit = "CUORI"; //HEARTS
        } else if (this.suit == 'P') {
            suit = "PICCHE"; //SPADES
        } else if (this.suit == 'F') {
            suit = "FIORI"; //CRUBS
        } else if (this.suit == 'R') {
            suit = "Rombo"; //DIAMONDS
        } else {
            suit = "NULLA";
        }
        return suit;
    }

    public char GetSuitChar() {
        return this.suit;
    };

    public int GetValue() {
        return this.value;
    };

    public int GetPoints() {
        return this.value;
    };

    public Icon GetImage() {
        return this.image;
    };

    //TO STRING
    public String toStringCard(){
        return suit + " " + value + " " + " " + points + " " + image;
    }

    // EOF
}