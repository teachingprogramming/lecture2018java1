package d00000.exam;

public class WaterChargeCalculator {
    public int diameter;

    public WaterChargeCalculator(int diameter) {
        this.diameter = diameter;
    }

    public int getBase() {
        int base = 0;
        if (diameter == 13 || diameter == 20 || diameter == 25) {
            base = 920;
        } else if (diameter == 30) {
            base = 2800;
        } else if (diameter == 40) {
            base = 5200;
        } else if (diameter == 50) {
            base = 9600;
        } else if (diameter == 75) {
            base = 20200;
        } else if (diameter == 100) {
            base = 33000;
        } else if (diameter == 150) {
            base = 78600;
        }
        return base;
    }

    public int getExcess(int cubicMeter) {
        int excess = 0;
        if (cubicMeter > 20) {
            excess = (cubicMeter - 20) * 115;
        }
        return excess;
    }

    public int getWaterCharge(int cubicMeter) {
        return getBase() + getExcess(cubicMeter);
    }

}
