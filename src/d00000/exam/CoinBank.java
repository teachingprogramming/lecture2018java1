package d00000.exam;

public class CoinBank {
    public int coin1;
    public int coin5;
    public int coin10;
    public int coin50;
    public int coin100;
    public int coin500;
    public int coinOther;
    public int coinOtherValue;

    public CoinBank(int coin1, int coin5, int coin10, int coin50, int coin100, int coin500) {
        this.coin1 = coin1;
        this.coin5 = coin5;
        this.coin10 = coin10;
        this.coin50 = coin50;
        this.coin100 = coin100;
        this.coin500 = coin500;
        coinOther = 0;
        coinOtherValue = 0;
    }

    public void deposit(Coin coin) {
        if (coin.getValueAsYen() == 1) {
            coin1++;
        } else if (coin.getValueAsYen() == 5) {
            coin5++;
        } else if (coin.getValueAsYen() == 10) {
            coin10++;
        } else if (coin.getValueAsYen() == 50) {
            coin50++;
        } else if (coin.getValueAsYen() == 100) {
            coin100++;
        } else if (coin.getValueAsYen() == 500) {
            coin500++;
        } else {
            coinOther++;
            coinOtherValue += coin.getValueAsYen();
        }
    }

    public int getTotalNumber() {
        return coin1 + coin5 + coin10 + coin50 + coin100 + coin500 + coinOther;
    }

    public int getTotalValue() {
        return coin1 + coin5 * 5 + coin10 * 10+ coin50 * 50 + coin100 * 100 + coin500 * 500 + coinOtherValue;
    }

    public int withdrawal() {
        int totalValue = getTotalValue();
        coin1 = 0;
        coin5 = 0;
        coin10 = 0;
        coin50 = 0;
        coin100 = 0;
        coin500 = 0;
        coinOther = 0;
        coinOtherValue = 0;
        return totalValue;
    }
}
