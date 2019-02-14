package d00000.exam;

public class Exam08 {
    public static void main(String[] args) {
        CoinArrayHandler cah = new CoinArrayHandler();

        // 5円1枚、10円2枚、100円1枚、500円1枚
        Coin[] coinArray1 = {new Coin(10), new Coin(10), new Coin(500), new Coin(100), new Coin(5)};

        int smallCoinNumber = cah.smallCoinNumber(coinArray1);
        System.out.println("少額硬貨の数: " + smallCoinNumber);

        // 1円1枚、5円3枚、10円1枚、100円2枚、500円1枚
        Coin[] coinArray2 = cah.createCoins(1, 3, 2, 0, 2, 1);
        for (int i = 0; i < coinArray2.length; i++) {
            System.out.print(coinArray2[i] + " ");
        }
        System.out.println();
    }
}
