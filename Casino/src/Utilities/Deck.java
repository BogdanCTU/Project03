package Utilities;

import javax.swing.*;

public class Deck {

    // CARDS

    //CUORI - c
    //Casino//src//GamesUI//HorseRacing//Images//400px-Diego_Brando_Infobox_Manga.png
    //Casino//src//CardsPackage//0.png
    static Icon ic1 = new ImageIcon("Casino//src//CardsPackage//c1.png");
    static Card c1 = new Card('c', 1, 11, ic1);
    static Icon ic2 = new ImageIcon("Casino//src//CardsPackage//c2.png");
    static Card c2 = new Card('c', 2, 0, ic2);
    static Icon ic3 = new ImageIcon("Casino//src//CardsPackage//c3.png");
    static Card c3 = new Card('c', 3, 0, ic3);
    static Icon ic4 = new ImageIcon("Casino//src//CardsPackage//c4.png");
    static Card c4 = new Card('c', 4, 0, ic4);
    static Icon ic5 = new ImageIcon("Casino//src//CardsPackage//c5.png");
    static Card c5 = new Card('c', 5, 0, ic5);
    static Icon ic6 = new ImageIcon("Casino//src//CardsPackage//c6.png");
    static Card c6 = new Card('c', 6, 0, ic6);
    static Icon ic7 = new ImageIcon("Casino//src//CardsPackage//c7.png");
    static Card c7 = new Card('c', 7, 0, ic7);
    static Icon icj = new ImageIcon("Casino//src//CardsPackage//cj.png");
    static Card cj = new Card('c', 11, 2, icj);
    static Icon icq = new ImageIcon("Casino//src//CardsPackage//cq.png");
    static Card cq = new Card('c', 12, 3, icq);
    static Icon ick = new ImageIcon("Casino//src//CardsPackage//ck.png");
    static Card ck = new Card('c', 13, 4, ick);

    //PICCHE - p
    static Icon ip1 = new ImageIcon("Casino//src//CardsPackage//p1.png");
    static Card p1 = new Card('p', 1, 11, ip1);
    static Icon ip2 = new ImageIcon("Casino//src//CardsPackage//p2.png");
    static Card p2 = new Card('p', 2, 0, ip2);
    static Icon ip3 = new ImageIcon("Casino//src//CardsPackage//p3.png");
    static Card p3 = new Card('p', 3, 0, ip3);
    static Icon ip4 = new ImageIcon("Casino//src//CardsPackage//p4.png");
    static Card p4 = new Card('p', 4, 0, ip4);
    static Icon ip5 = new ImageIcon("Casino//src//CardsPackage//p5.png");
    static Card p5 = new Card('p', 5, 0, ip5);
    static Icon ip6 = new ImageIcon("Casino//src//CardsPackage//p6.png");
    static Card p6 = new Card('p', 6, 0, ip6);
    static Icon ip7 = new ImageIcon("Casino//src//CardsPackage//p7.png");
    static Card p7 = new Card('p', 7, 0, ip7);
    static Icon ipj = new ImageIcon("Casino//src//CardsPackage//pj.png");
    static Card pj = new Card('p', 11, 2, ipj);
    static Icon ipq = new ImageIcon("Casino//src//CardsPackage//pq.png");
    static Card pq = new Card('p', 12, 3, ipq);
    static Icon ipk = new ImageIcon("Casino//src//CardsPackage//pk.png");
    static Card pk = new Card('p', 13, 4, ipk);

    //FIORI - f
    static Icon if1 = new ImageIcon("Casino//src//CardsPackage//f1.png");
    static Card f1 = new Card('f', 1, 11, if1);
    static Icon if2 = new ImageIcon("Casino//src//CardsPackage//f2.png");
    static Card f2 = new Card('f', 2, 0, if2);
    static Icon if3 = new ImageIcon("Casino//src//CardsPackage//f3.png");
    static Card f3 = new Card('f', 3, 0, if3);
    static Icon if4 = new ImageIcon("Casino//src//CardsPackage//f4.png");
    static Card f4 = new Card('f', 4, 0, if4);
    static Icon if5 = new ImageIcon("Casino//src//CardsPackage//f5.png");
    static Card f5 = new Card('f', 5, 0, if5);
    static Icon if6 = new ImageIcon("Casino//src//CardsPackage//f6.png");
    static Card f6 = new Card('f', 6, 0, if6);
    static Icon if7 = new ImageIcon("Casino//src//CardsPackage//f7.png");
    static Card f7 = new Card('f', 7, 0, if7);
    static Icon ifj = new ImageIcon("Casino//src//CardsPackage//fj.png");
    static Card fj = new Card('f', 11, 2, ifj);
    static Icon ifq = new ImageIcon("Casino//src//CardsPackage//fq.png");
    static Card fq = new Card('f', 12, 3, ifq);
    static Icon ifk = new ImageIcon("Casino//src//CardsPackage//fk.png");
    static Card fk = new Card('f', 13, 4, ifk);

    //ROMBI - r
    static Icon ir1 = new ImageIcon("Casino//src//CardsPackage//r1.png");
    static Card r1 = new Card('r', 1, 11, ir1);
    static Icon ir2 = new ImageIcon("Casino//src//CardsPackage//r2.png");
    static Card r2 = new Card('r', 2, 0, ir2);
    static Icon ir3 = new ImageIcon("Casino//src//CardsPackage//r3.png");
    static Card r3 = new Card('r', 3, 0, ir3);
    static Icon ir4 = new ImageIcon("Casino//src//CardsPackage//r4.png");
    static Card r4 = new Card('r', 4, 0, ir4);
    static Icon ir5 = new ImageIcon("Casino//src//CardsPackage//r5.png");
    static Card r5 = new Card('r', 5, 0, ir5);
    static Icon ir6 = new ImageIcon("Casino//src//CardsPackage//r6.png");
    static Card r6 = new Card('r', 6, 0, ir6);
    static Icon ir7 = new ImageIcon("Casino//src//CardsPackage//r7.png");
    static Card r7 = new Card('r', 7, 0, ir7);
    static Icon irj = new ImageIcon("Casino//src//CardsPackage//rj.png");
    static Card rj = new Card('r', 11, 2, irj);
    static Icon irq = new ImageIcon("Casino//src//CardsPackage//rq.png");
    static Card rq = new Card('r', 12, 3, irq);
    static Icon irk = new ImageIcon("Casino//src//CardsPackage//rk.png");
    static Card rk = new Card('r', 13, 4, irk);

    //NULL Card
    static Icon nulli = new ImageIcon("Casino//src//CardsPackage//0.png");

    // DECK
    public static Card[] deck = {c1, c2, c3, c4, c5, c6, c7, cj, cq, ck, p1, p2, p3, p4, p5, p6, p7, pj, pq, pk, f1, f2, f3, f4, f5, f6, f7, fj, fq, fk, r1, r2, r3, r4, r5, r6, r7, rj, rq, rk};

    // EOF
}