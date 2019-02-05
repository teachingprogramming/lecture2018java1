package d00000.quiz;

/**
 * 定形郵便物
 */
public class StandardMail extends Mail {
    public boolean express;

    public StandardMail(int weight, boolean express) {
        this.weight = weight;
        this.express = express;
    }

    @Override
    public int getCharge() {
        int charge;
        if (weight <= 25) {
            charge = 82;
        } else {
            charge = 92;
        }
        if (express) {
            charge += 280;
        }
        return charge;
    }

    @Override
    public String toString() {
        if (express) {
            return "定形郵便物（速達）, " + weight + "g";
        } else {
            return "定形郵便物, " + weight + "g";
        }
    }
}
