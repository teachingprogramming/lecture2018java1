package d00000.quiz;

public class Quiz13 {
    public static void main(String[] args) {
        RightTriangle rt1 = new RightTriangle();
        rt1.a = 3;
        rt1.h = 4;
        System.out.println("rt1");
        System.out.println("  面積: " + rt1.getArea());
        System.out.println("  二等辺三角形?: " + rt1.isIsoscelesTriangle());
        System.out.println("  斜辺: " + rt1.getB());

        RightTriangle rt2 = new RightTriangle();
        rt2.a = 5;
        rt2.h = 5;
        System.out.println("rt2");
        System.out.println("  面積: " + rt2.getArea());
        System.out.println("  二等辺三角形?: " + rt2.isIsoscelesTriangle());
        System.out.println("  斜辺: " + rt2.getB());
    }
}
