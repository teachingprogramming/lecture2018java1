package d00000.practice;

public class Practice03 {
    public static void main(String[] args) {
        int[] a = {1, 10, 100};
        int[] b = {2, 20, 200, 2000};

        IntArrayHandler iah = new IntArrayHandler();

        System.out.println("aの要素の合計は" + iah.sum(a));
        System.out.println("bの要素の合計は" + iah.sum(b));

        int[] c = iah.join(a, b);
        System.out.print("cの要素: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
