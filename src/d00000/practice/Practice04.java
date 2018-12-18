package d00000.practice;

public class Practice04 {
    public static void main(String[] args) {
        RectangleArrayHandler rah = new RectangleArrayHandler();

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[0].x = 1;
        rectangles[0].y = 2;
        rectangles[1] = new Rectangle();
        rectangles[1].x = 30;
        rectangles[1].y = 40;
        rectangles[2] = new Rectangle();
        rectangles[2].x = 500;
        rectangles[2].y = 600;
        int area = rah.sumOfArea(rectangles);
        System.out.println("面積の合計: " + area);

        System.out.println();

        Rectangle[] squares = rah.createSquares(5, 8);
        for (int i = 0; i < squares.length; i++) {
            System.out.println("square[" + i + "]");
            System.out.println("  正方形: " + squares[i].isSquare());
            System.out.println("  辺の長さ: " + squares[i].x);
        }
    }
}
