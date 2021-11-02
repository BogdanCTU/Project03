package wof.gui;

public class adaugareBani{
    private bani card;
    private Suits suit;
    private String UID;

    public static enum bani{
        Unu(250),
        Doi(300),
        Trei(350),
        Patru(400),
        Cinci(450),
        Sase(500),
        Sapte(550),
        Opt(600),
        Noua(650),
        Zece(700),
        Unsprezece(750),
        Douasprezece(800),
        Treisprezece(850),
        Paisprezece(900),
        Cinsprezece(950),
        Saisprezece(1000);

        private final int value;

        bani(int value){
            this.value = value;
        }

    };

    public static enum Suits{Bani};


    public adaugareBani(bani card,Suits suit)
    {
        this.card = card;
        this.suit = suit;
        this.UID = Integer.toString(card.ordinal()) + Integer.toString(suit.ordinal());
    }

    public String getSuitString()
    {
        return suit.toString();
    }

    public Suits getSuit(){
        return suit;
    }
    public int getCardNumber(){
        return card.ordinal();
    }
    public String getFileName(){
        return card.toString() + suit.toString() + ".png";
    }
    public String getUID(){
        return UID;
    }

    public String toString(){
        return card.toString() + " of " + suit.toString();
    }
}