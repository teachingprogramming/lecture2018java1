package d00000.exam;

public class Coin {
    public int value;
    public boolean useConstructor = false;

    public Coin(int value) {
        this.value = value;
        useConstructor = true;
    }

    public int getValueAsYen() {
        return value;
    }

    @Override
    public String toString() {
        return value + "円";
    }
}
