package d00000.lecture12;

public class Main1 {
    public static void main(String[] args) {
        // (1) プリミティブ型の宣言と初期化
        int a = 0;
        int b = 1;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // (2) プリミティブ型の代入
        b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // (3) プリミティブ型の代入
        a = 2;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("-----------------------------");

        // (4) 参照型のインスタンス化とフィールドへの代入
        Circle c1 = new Circle();
        c1.radius = 0;
        Circle c2 = new Circle();
        c2.radius = 1;
        System.out.println("c1.radius: " + c1.radius);
        System.out.println("c2.radius: " + c2.radius);

        // (5) 参照型の代入
        c2 = c1;
        System.out.println("c1.radius: " + c1.radius);
        System.out.println("c2.radius: " + c2.radius);

        // (6) 参照型のフィールドに代入
        c1.radius = 2;
        System.out.println("c1.radius: " + c1.radius);
        System.out.println("c2.radius: " + c2.radius);

        System.out.println("-----------------------------");

        // (7) 配列のインスタンス化と要素への代入
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 100;
        array1[2] = 1000;
        int[] array2 = new int[3];
        array2[0] = 20;
        array2[1] = 200;
        array2[2] = 2000;
        System.out.println("array1: " + array1[0] + ", " + array1[1] + ", " + array1[2]);
        System.out.println("array2: " + array2[0] + ", " + array2[1] + ", " + array2[2]);

        // (8) 配列の代入
        array2 = array1;
        System.out.println("array1: " + array1[0] + ", " + array1[1] + ", " + array1[2]);
        System.out.println("array2: " + array2[0] + ", " + array2[1] + ", " + array2[2]);

        // (9) 要素への代入
        array1[1] = 300;
        System.out.println("array1: " + array1[0] + ", " + array1[1] + ", " + array1[2]);
        System.out.println("array2: " + array2[0] + ", " + array2[1] + ", " + array2[2]);
    }
}
