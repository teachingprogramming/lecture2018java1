package d00000.lecture09;

import d00000.lecture07.Rectangle;

/**
 * 配列の利用例（クラス型・参照型）
 */
public class Main2 {
    public static void main(String[] args) {
        Rectangle[] a = new Rectangle[3];
        a[0] = new Rectangle(1, 2);
        a[1] = new Rectangle(3, 4);
        a[2] = new Rectangle(4, 5);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]の面積は" + a[i].getArea());
        }

        Rectangle[] b = {new Rectangle(5, 6), new Rectangle(7, 8)};
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]の面積は" + b[i].getArea());
        }
    }
}
