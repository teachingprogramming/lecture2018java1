package d00000.quiz;

public class Quiz18 {
    public static void main(String[] args) {
        HealthReportArrayHandler hrah = new HealthReportArrayHandler();

        HealthReport[] healthReports = new HealthReport[3];
        healthReports[0] = new HealthReport("たろう", 1.7, 70.0);
        healthReports[1] = new HealthReport("じろう", 1.6, 60.0);
        healthReports[2] = new HealthReport("はなこ", 1.5, 50.0);

        double average = hrah.averageBmi(healthReports);
        System.out.println("BMIの平均: " + average);

        System.out.println();

        HealthReport[] samples = hrah.createHealthReports("サンプル", 1.7, 51.7, 6);
        for (int i = 0; i < samples.length; i++) {
            HealthReport hr = samples[i];
            System.out.println("hr[" + i + "]: " + hr.name + " " + hr.height + "[m] " + hr.weight + "[kg] " + hr.getBmiClass());
        }
    }
}
