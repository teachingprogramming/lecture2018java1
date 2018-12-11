package d00000.exam;

public class Exam02 {
    public static void main(String[] args) {
        NumericalValueRange nvr1 = new NumericalValueRange(0, 10);
        System.out.println(nvr1.start + "から" + nvr1.end + "までの数");
        System.out.println("合計: " + nvr1.getSum());
        System.out.println("3の倍数の数: " + nvr1.getCountOfMultiples(3));
        System.out.println("7が範囲内かどうか: " + nvr1.contains(7));
        System.out.println("17が範囲内かどうか: " + nvr1.contains(17));

        System.out.println();

        NumericalValueRange nvr2 = new NumericalValueRange(200, 100);
        System.out.println(nvr2.start + "から" + nvr2.end + "までの数");
        System.out.println("合計: " + nvr2.getSum());
        System.out.println("5の倍数の数: " + nvr2.getCountOfMultiples(5));
        System.out.println("97が範囲内かどうか: " + nvr2.contains(97));
        System.out.println("107が範囲内かどうか: " + nvr2.contains(107));
    }
}
