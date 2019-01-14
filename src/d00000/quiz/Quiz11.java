package d00000.quiz;

public class Quiz11 {
    public static void main(String[] args) {
        double[] a = {1.1, -11.1, 111.1};
        double[] b = {-2.2, 33.3, -123.4, 4.4};

        DoubleArrayHandler dah = new DoubleArrayHandler();

        System.out.println("aの要素の絶対値の合計は" + dah.sumOfMod(a));
        System.out.println("bの要素の絶対値の合計は" + dah.sumOfMod(b));

        double[] c = dah.treble(a);
        System.out.print("cの要素: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
