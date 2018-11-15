package d00000.quiz;

public class Quiz10 {
    public static void main(String[] args) {
        BlackjackHand h1 = new BlackjackHand();
        h1.card1 = 7;
        h1.card2 = 8;
        System.out.println("h1の点数: " + h1.getScore());

        BlackjackHand h2 = new BlackjackHand();
        h2.card1 = 7;
        h2.card2 = 12;
        System.out.println("h2の点数: " + h2.getScore());

        BlackjackHand h3 = new BlackjackHand();
        h3.card1 = 1;
        h3.card2 = 8;
        System.out.println("h3の点数: " + h3.getScore());

        BlackjackHand h4 = new BlackjackHand();
        h4.card1 = 12;
        h4.card2 = 1;
        System.out.println("h4の点数: " + h4.getScore());

        BlackjackHand h5 = new BlackjackHand();
        h5.card1 = 1;
        h5.card2 = 1;
        System.out.println("h5の点数: " + h5.getScore());
    }
}
