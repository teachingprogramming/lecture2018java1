package d00000.quiz;

public class Quiz14 {
    public static void main(String[] args) {
        BragHand b1 = new BragHand();
        b1.card1 = 3;
        b1.card2 = 5;
        b1.card3 = 8;
        System.out.print("b1は");
        if (b1.isPair()) {
            System.out.println("ペア");
        } else if (b1.isPrial()) {
            System.out.println("プライアル");
        } else {
            System.out.println("役無し");
        }

        BragHand b2 = new BragHand();
        b2.card1 = 1;
        b2.card2 = 1;
        b2.card3 = 2;
        System.out.print("b2は");
        if (b2.isPair()) {
            System.out.println("ペア");
        } else if (b2.isPrial()) {
            System.out.println("プライアル");
        } else {
            System.out.println("役無し");
        }

        BragHand b3 = new BragHand();
        b3.card1 = 10;
        b3.card2 = 10;
        b3.card3 = 10;
        System.out.print("b3は");
        if (b3.isPair()) {
            System.out.println("ペア");
        } else if (b3.isPrial()) {
            System.out.println("プライアル");
        } else {
            System.out.println("役無し");
        }

    }
}
