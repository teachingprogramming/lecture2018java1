package d00000.quiz;

public class RightTriangle {
    public double a;
    public double h;

    public boolean isIsoscelesTriangle() {
        return a == h;
    }

    public double getArea() {
        return a * h / 2.0;
    }

    public double getB() {
        return Math.sqrt(a * a + h * h);
    }

}
