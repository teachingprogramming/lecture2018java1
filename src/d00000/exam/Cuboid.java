package d00000.exam;

public class Cuboid {
    public int x;
    public int y;
    public int z;

    public Cuboid(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /** 面に正方形があるか */
    public boolean containsSquare() {
        return x == y || y == z || z == x;
    }

    /** 最短の辺の長さ */
    public int getMinEdge() {
        if (x <= y && x <= z) {
            return x;
        } else if (y <= x && y <= z) {
            return y;
        } else {
            return z;
        }
    }

    /** 最大の面の面積 */
    public int getMaxFace() {
        int face1 = x * y;
        int face2 = y * z;
        int face3 = z * x;
        if (face2 <= face1 && face3 <= face1) {
            return face1;
        } else if (face1 <= face2 && face3 <= face2) {
            return face2;
        } else {
            return face3;
        }
    }
}
