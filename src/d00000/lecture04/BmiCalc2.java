package d00000.lecture04;

public class BmiCalc2 {
    public static void main(String[] args) {
        Person a = new Person(); // Aを表すPersonのインスタンス（変数）
        a.height = 1.7;          // Aの身長 1.7m
        a.weight = 65.0;         // Aの体重 65kg
        Person b = new Person(); // Bを表すPersonのインスタンス（変数）
        b.height = 1.8;          // Bの身長 1.8m
        b.weight = 75.0;         // Bの体重 75kg

        double a_bmi = a.weight / (a.height * a.height);
        System.out.println("AのBMIは" + a_bmi);
        double b_bmi = b.weight / (b.height * b.height);
        System.out.println("BのBMIは" + b_bmi);
    }
}
