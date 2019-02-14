package d00000.exam;

public class Exam09 {
    public static void main(String[] args) {
        Coin[] coinArray1 = {new Coin(100), new ForeignCoin(1, "ドル", 109.7), new ForeignCoin(2, "ユーロ", 124.4)};

        int totalYen = 0;
        for (int i = 0; i < coinArray1.length; i++) {
            totalYen += coinArray1[i].getValueAsYen();
            System.out.println(coinArray1[i]);
        }
        System.out.println("--------------------");
        System.out.println("合計金額: " + totalYen + "円");
    }
}
