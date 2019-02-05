package d00000.quiz;

public class Quiz17 {
    public static void main(String[] args) {
        boolean[] a = {true, true, false};
        boolean[] b = {false, true, false, false};

        BooleanArrayHandler bah = new BooleanArrayHandler();

        System.out.println("aの要素のtrueとfalseの数の差: " + bah.delta(a));
        System.out.println("bの要素のtrueとfalseの数の差: " + bah.delta(b));

        boolean[] c = bah.shuttle(a);
        System.out.print("cの要素: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        boolean[] d = bah.shuttle(b);
        System.out.print("dの要素: ");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
    }
}
