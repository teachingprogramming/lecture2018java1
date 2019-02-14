package d00000.exam;

public class ForeignCoin extends Coin {
    public String unit;
    public double rate;

    public ForeignCoin(int value, String unit, double rate) {
        super(value);
        this.unit = unit;
        this.rate = rate;
    }

    @Override
    public int getValueAsYen() {
        double yen = value * rate;
        return (int) yen;
    }

    @Override
    public String toString() {
        return value + unit + "（" + getValueAsYen() + "円）";
    }
}
