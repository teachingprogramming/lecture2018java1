package d00000.lecture07;

public class Rectangle {
    public int x;
    public int y;

    /**
     * 引数無しのコンストラクタ
     */
    public Rectangle() {
        x = 10;
        y = 20;
    }

    /**
     * 引数有り（int型が2個）のコンストラクタ
     */
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getArea() {
        return x * y;
    }

    public boolean isSquare() {
        return x == y;
    }

}
