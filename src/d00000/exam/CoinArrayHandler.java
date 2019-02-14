package d00000.exam;

public class CoinArrayHandler {
    public int smallCoinNumber(Coin[] coins) {
        int smallCoinNumber = 0;
        for (int i = 0; i < coins.length; i++) {
            Coin coin = coins[i];
            if (coin.getValueAsYen() < 100) {
                smallCoinNumber++;
            }
        }
        return smallCoinNumber;
    }

    public Coin[] createCoins(int coin1, int coin5, int coin10, int coin50, int coin100, int coin500) {
        Coin[] coins = new Coin[coin1 + coin5 + coin10 + coin50 + coin100 + coin500];
        for (int i = 0; i < coin1; i++) {
            coins[i] = new Coin(1);
        }
        for (int i = coin1; i < coin1 + coin5; i++) {
            coins[i] = new Coin(5);
        }
        for (int i = coin1 + coin5; i < coin1 + coin5 + coin10; i++) {
            coins[i] = new Coin(10);
        }
        for (int i = coin1 + coin5 + coin10; i < coin1 + coin5 + coin10 + coin50; i++) {
            coins[i] = new Coin(50);
        }
        for (int i = coin1 + coin5 + coin10 + coin50; i < coin1 + coin5 + coin10 + coin50 + coin100; i++) {
            coins[i] = new Coin(100);
        }
        for (int i = coin1 + coin5 + coin10 + coin50 + coin100; i < coin1 + coin5 + coin10 + coin50 + coin100 + coin500; i++) {
            coins[i] = new Coin(500);
        }
        return coins;
    }
}
