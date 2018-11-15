package d00000.quiz;

public class BlackjackHand {
    public int card1;
    public int card2;

    public int getScore() {
        int score = 0;
        if (card1 == 1) {
            score += 11;
        } else if (card1 > 10) {
            score += 10;
        } else {
            score += card1;
        }

        if (card2 == 1 && card1 != 1) {
            score += 11;
        } else if (card2 > 10) {
            score += 10;
        } else {
            score += card2;
        }

        return score;
    }
}
