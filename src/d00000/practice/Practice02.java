package d00000.practice;

public class Practice02 {
    public static void main(String[] args) {
        Seiseki s1 = new Seiseki();
        s1.name = "数学";
        s1.presence = 13;
        s1.absence = 2;
        s1.score = 80;

        System.out.print(s1.name + "は");
        if (s1.isPassing()) {
            System.out.println("合格です。");
        } else {
            System.out.println("不合格です。");
        }

        Seiseki s2 = new Seiseki();
        s2.name = "英語";
        s2.presence = 14;
        s2.absence = 1;
        s2.score = 50;

        System.out.print(s2.name + "は");
        if (s2.isPassing()) {
            System.out.println("合格です。");
        } else {
            System.out.println("不合格です。");
        }
    }
}
