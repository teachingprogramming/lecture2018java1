package d00000.lecture07;

public class Main2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); // 引数無しのコンストラクタが使われれる。
        System.out.println("r1の面積は" + r1.getArea() + "です。");
        if (r1.isSquare()) {
            System.out.println("r1は正方形です。");
        } else {
            System.out.println("r1は正方形ではない。");
        }

        Rectangle r2 = new Rectangle(30, 30); // 引数有りのコンストラクタが使われる。
        System.out.println("r2の面積は" + r2.getArea() + "です。");
        if (r1.isSquare()) {
            System.out.println("r2は正方形です。");
        } else {
            System.out.println("r2は正方形ではない。");
        }
    }
}
