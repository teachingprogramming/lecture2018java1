package d00000.quiz;

public class Quiz09 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        c1.x = 5;
        c1.y = 6;
        c1.z = 7;
        System.out.println("c1の表面積は" + c1.getArea() + "です。");
        if (c1.isCube()) {
            System.out.println("c1は立方体です。");
        } else {
            System.out.println("c1は立方体ではない。");
        }

        Cuboid c2 = new Cuboid();
        c2.x = 8;
        c2.y = 8;
        c2.z = 8;
        System.out.println("c2の表面積は" + c2.getArea() + "です。");
        if (c2.isCube()) {
            System.out.println("c2は立方体です。");
        } else {
            System.out.println("c2は立方体ではない。");
        }
    }
}
