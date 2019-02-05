package d00000.quiz;

public class HealthReport {
    /** 名前 */
    public String name;
    /** 身長[m] */
    public double height;
    /** 体重 */
    public double weight;

    /** コンストラクタ */
    public HealthReport(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    /** BMIを算出するメソッド */
    public double getBmi() {
        return weight / (height * height);
    }

    /** BMIのクラスを算出するメソッド */
    public String getBmiClass() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "低体重";
        } else if (bmi < 25.0) {
            return "普通";
        } else {
            return "肥満";
        }
    }
}
