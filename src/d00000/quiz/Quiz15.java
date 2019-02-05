package d00000.quiz;

public class Quiz15 {
    public static void main(String[] args) {
        HealthReportEx[] healthReports = {
                new HealthReportEx("たろう", 1.6, 90.0, 19, true),
                new HealthReportEx("じろう", 1.7, 80.0, 15, true),
                new HealthReportEx("はなこ", 1.5, 45.0, 14, false)
        };

        for (int i = 0; i < healthReports.length; i++) {
            System.out.println("-------------------------");
            HealthReportEx hr = healthReports[i];
            System.out.println("名前: " + hr.name);
            System.out.println("基礎代謝: " + hr.getBasalMetabolism());
            System.out.println("BMIクラス: " + hr.getBmiClass());
        }
    }
}
