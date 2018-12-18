package d00000.practice;

public class RectangleArrayHandler {
    public int sumOfArea(Rectangle[] rectangles) {
        int area = 0;
        for (int i = 0; i < rectangles.length; i++) {
            area += rectangles[i].getArea();
        }
        return area;
    }

    public Rectangle[] createSquares(int min, int max) {
        Rectangle[] squares = new Rectangle[max - min + 1];
        for (int i = 0; i < squares.length; i++) {
            Rectangle r = new Rectangle();
            r.x = min + i;
            r.y = min + i;
            squares[i] = r;
        }
        return squares;
    }
}
