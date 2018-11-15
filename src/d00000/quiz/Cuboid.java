package d00000.quiz;

public class Cuboid {
    public int x;
    public int y;
    public int z;

    public boolean isCube() {
        return x == y && x == z;
    }

    public int getArea() {
        return 2 * (x * y + y * z + z * x);
    }

}
