package d00000.quiz;

public class BragHand {
    public int card1;
    public int card2;
    public int card3;

    public boolean isPrial() {
        return card1 == card2 && card1 == card3;
    }

    public boolean isPair() {
        if (card1 == card2 && card1 != card3) {
            return true;
        } else if (card2 == card3 && card1 != card2) {
            return true;
        } else if (card1 == card3 && card1 != card2) {
            return true;
        }
        return false;
    }

}
