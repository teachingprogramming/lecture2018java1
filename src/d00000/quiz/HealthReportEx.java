package d00000.quiz;

public class HealthReportEx extends HealthReport {
    public int age;
    public boolean male;

    public HealthReportEx(String name, double height, double weight, int age, boolean male) {
        super(name, height, weight);
        this.age = age;
        this.male = male;
    }

    public double getBasalMetabolism() {
        if (male) {
            return 13.397 * weight + 4.799 * height * 100 - 5.677 * age + 88.362;
        } else {
            return 9.247 * weight + 3.098 * height * 100 - 4.33 * age + 447.593;
        }
    }

    @Override
    public String getBmiClass() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "低体重(痩せ型)";
        } else if (bmi < 25.0) {
            return "普通体重";
        } else if (bmi < 30.0) {
            return "肥満(1度)";
        } else if (bmi < 35.0) {
            return "肥満(2度)";
        } else if (bmi < 40.0) {
            return "肥満(3度)";
        } else {
            return "肥満(4度)";
        }
    }
}
