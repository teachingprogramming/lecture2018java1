package d00000.practice;

public class Rectangle {
    public int x;
    public int y;

    public int getArea() {
        return x * y;
    }

    public boolean isSquare() {
        return x == y;
        /*
        if (x == y) {
            return true;
        } else {
            return false;
        }
        */
    }

}
