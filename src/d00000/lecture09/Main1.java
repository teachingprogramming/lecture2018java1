package d00000.lecture09;

/**
 * 配列の利用例（プリミティブ型）
 */
public class Main1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 10;
        a[2] = 1000;
        a[3] = 10000;
        a[4] = 100000;

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int[] b = {2, 20, 200, 2000};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
