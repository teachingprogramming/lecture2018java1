package d00000.practice;

public class Practice01 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.x = 10;
        r1.y = 20;
        System.out.println("r1の面積は" + r1.getArea() + "です。");
        if (r1.isSquare()) {
            System.out.println("r1は正方形です。");
        } else {
            System.out.println("r1は正方形ではない。");
        }

        Rectangle r2 = new Rectangle();
        r2.x = 30;
        r2.y = 30;
        System.out.println("r2の面積は" + r2.getArea() + "です。");
        if (r1.isSquare()) {
            System.out.println("r2は正方形です。");
        } else {
            System.out.println("r2は正方形ではない。");
        }
    }
}
