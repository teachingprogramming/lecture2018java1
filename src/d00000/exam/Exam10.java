package d00000.exam;

public class Exam10 {
    public static void main(String[] args) {
        Cuboid cuboid1 = new Cuboid(1, 2, 3);
        System.out.println("cuboid1");
        System.out.println("正方形を含む?: " + cuboid1.containsSquare());
        System.out.println("最短の辺の長さ: " + cuboid1.getMinEdge());
        System.out.println("最大の面の面積: " + cuboid1.getMaxFace());

        System.out.println();

        Cuboid cuboid2 = new Cuboid(3, 4, 3);
        System.out.println("cuboid2");
        System.out.println("正方形を含む?: " + cuboid2.containsSquare());
        System.out.println("最短の辺の長さ: " + cuboid2.getMinEdge());
        System.out.println("最大の面の面積: " + cuboid2.getMaxFace());
    }
}
