package d00000.lecture13;

public class Cuboid extends Rectangle {
    public int z;

    public boolean isCube() {
        return x == y && x == z;
    }

    public int getVolume() {
        return x * y * z;
    }

    @Override
    public int getArea() {
        return (x * y + x * z + y * z) * 2;
    }

    @Override
    public String toString() {
        return "Cuboid[x=" + x + ",y=" + y + ",z=" + z + "]";
    }
}
