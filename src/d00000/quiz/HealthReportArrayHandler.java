package d00000.quiz;


public class HealthReportArrayHandler {

    public double averageBmi(HealthReport[] healthReports) {
        double total = 0;
        for (int i = 0; i < healthReports.length; i++) {
            total += healthReports[i].getBmi();
        }
        return total / healthReports.length;
    }

    public HealthReport[] createHealthReports(String name, double length, double weightStart, int num) {
        HealthReport[] healthReports = new HealthReport[num];
        for (int i = 0; i < healthReports.length; i++) {
            HealthReport hr = new HealthReport(name + i, length, weightStart + i * 5.0);
            healthReports[i] = hr;
        }
        return healthReports;
    }
}
