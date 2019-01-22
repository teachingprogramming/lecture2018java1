package d00000.lecture13;

public class Main1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.x = 1;
        r.y = 2;
        System.out.println("rは正方形?: " + r.isSquare());
        System.out.println("rの面積: " + r.getArea());
        System.out.println("そのまま表示: " + r);

        System.out.println();

        Cuboid c = new Cuboid();
        c.x = 1;
        c.y = 2;
        c.z = 3;
        System.out.println("cは立方体?: " + c.isCube());
        System.out.println("cの体積: " + c.getVolume());
        System.out.println("rの表面積: " + c.getArea());
        System.out.println("そのまま表示: " + c);
    }
}
