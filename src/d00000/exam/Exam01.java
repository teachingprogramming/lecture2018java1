package d00000.exam;

public class Exam01 {
    public static void main(String[] args) {
        WaterChargeCalculator wcc1 = new WaterChargeCalculator(20);
        System.out.println("* 口径" + wcc1.diameter + "ミリメートル");
        System.out.println("  - 基本料金: " + wcc1.getBase() + "円");
        System.out.println("  - 35立方メートルの超過料金: " + wcc1.getExcess(35) + "円");
        System.out.println("  - 35立方メートルの料金（合計）: " + wcc1.getWaterCharge(35) + "円");
        System.out.println("  - 70立方メートルの超過料金: " + wcc1.getExcess(70) + "円");
        System.out.println("  - 70立方メートルの料金（合計）: " + wcc1.getWaterCharge(70) + "円");

        WaterChargeCalculator wcc2 = new WaterChargeCalculator(50);
        System.out.println("* 口径" + wcc2.diameter + "ミリメートル");
        System.out.println("  - 基本料金: " + wcc2.getBase() + "円");
        System.out.println("  - 15立方メートルの超過料金: " + wcc2.getExcess(15) + "円");
        System.out.println("  - 15立方メートルの料金（合計）: " + wcc2.getWaterCharge(15) + "円");
        System.out.println("  - 30立方メートルの超過料金: " + wcc2.getExcess(30) + "円");
        System.out.println("  - 30立方メートルの料金（合計）: " + wcc2.getWaterCharge(30) + "円");
    }
}
