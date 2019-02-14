package d00000.exam;

public class Exam11 {
    public static void main(String[] args) {
        ArithmeticProgression ap1 = new ArithmeticProgression(1, 2);
        System.out.println("初項が" + ap1.a + "、公差が" + ap1.d + "の等差数列");
        System.out.println("第2項: " + ap1.getNthValue(2));
        System.out.println("第2項までの総乗: " + ap1.getProd(2));
        System.out.println("第4項: " + ap1.getNthValue(4));
        System.out.println("第4項までの総乗: " + ap1.getProd(4));

        System.out.println();

        ArithmeticProgression ap2 = new ArithmeticProgression(2, 3);
        System.out.println("初項が" + ap2.a + "、公差が" + ap2.d + "の等差数列");
        System.out.println("第2項: " + ap2.getNthValue(2));
        System.out.println("第2項までの総乗: " + ap2.getProd(2));
        System.out.println("第4項: " + ap2.getNthValue(4));
        System.out.println("第4項までの総乗: " + ap2.getProd(4));
    }
}
