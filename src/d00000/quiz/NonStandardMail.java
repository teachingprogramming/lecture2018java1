package d00000.quiz;

/**
 * 定形外郵便物
 */
public class NonStandardMail extends Mail {
    public boolean suitability;

    public NonStandardMail(int weight, boolean suitability) {
        this.weight = weight;
        this.suitability = suitability;
    }

    @Override
    public int getCharge() {
        if (suitability) {
            if (weight <= 50) {
                return 120;
            } else if (weight <= 100) {
                return 140;
            } else if (weight <= 150) {
                return 205;
            } else if (weight <= 250) {
                return 250;
            } else if (weight <= 500) {
                return 380;
            } else if (weight <= 1000) {
                return 570;
            }
        } else {
            if (weight <= 50) {
                return 200;
            } else if (weight <= 100) {
                return 220;
            } else if (weight <= 150) {
                return 290;
            } else if (weight <= 250) {
                return 340;
            } else if (weight <= 500) {
                return 500;
            } else if (weight <= 1000) {
                return 700;
            } else if (weight <= 2000) {
                return 1020;
            } else if (weight <= 4000) {
                return 1330;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if (suitability) {
            return "定形外郵便物（規格内）, " + weight + "g";
        } else {
            return "定形外郵便物（規格外）, " + weight + "g";
        }
    }
}
