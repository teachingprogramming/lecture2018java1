package d00000.exam;

public class Exam05 {
    public static void main(String[] args) {
        GeometricProgression gp1 = new GeometricProgression(1, 2);
        System.out.println("初項が" + gp1.a + "、公比が" + gp1.r + "の等比数列");
        System.out.println("第2項: " + gp1.getNthValue(2));
        System.out.println("第2項までの総和: " + gp1.getSum(2));
        System.out.println("第4項: " + gp1.getNthValue(4));
        System.out.println("第4項までの総和: " + gp1.getSum(4));

        System.out.println();

        GeometricProgression gp2 = new GeometricProgression(2, 3);
        System.out.println("初項が" + gp2.a + "、公比が" + gp2.r + "の等比数列");
        System.out.println("第2項: " + gp2.getNthValue(2));
        System.out.println("第2項までの総和: " + gp2.getSum(2));
        System.out.println("第4項: " + gp2.getNthValue(4));
        System.out.println("第4項までの総和: " + gp2.getSum(4));
    }
}
