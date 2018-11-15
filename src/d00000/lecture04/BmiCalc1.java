package d00000.lecture04;

public class BmiCalc1 {
    public static void main(String[] args) {
        double a_height = 1.7;  // Aの身長 1.7m
        double a_weight = 65.0; // Aの体重 65kg
        double b_height = 1.8;  // Bの身長 1.8m
        double b_weight = 75.0; // Bの体重 75kg

        double a_bmi = a_weight / (a_height * a_height);
        System.out.println("AのBMIは" + a_bmi);
        double b_bmi = b_weight / (b_height * b_height);
        System.out.println("BのBMIは" + b_bmi);
    }
}
