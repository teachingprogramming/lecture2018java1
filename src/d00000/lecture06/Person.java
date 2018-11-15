package d00000.lecture06;

public class Person {
    public String name;
    public double height;
    public double weight;
    public int age;
    public boolean hasDriverLicense;

    public double getBmi() {
        double bmi = weight / (height * height);
        return bmi;
    }

    /**
     * フィールドをセットする。
     * @param name 名前
     * @param height 身長[m]
     * @param weight 体重[kg]
     * @param age 年齢
     * @param hasDriverLicense 運転免許証の有無
     */
    public void set(String name, double height, double weight, int age, boolean hasDriverLicense) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.hasDriverLicense = hasDriverLicense;
    }

    /**
     * フィールドの状態を説明する文字列を返す。
     * @return 状態の説明
     */
    public String getStatus() {
        String status = "";
        status += "名前: " + name + "\n";
        status += "年齢: " + age + "才\n";
        status += "身長: " + (height * 100) + "cm\n";
        status += "体重: " + weight + "kg\n";
        status += "自動車免許: ";
        if (hasDriverLicense) {
            status += "有";
        } else {
            status += "無";
        }
        status += "\n";
        return status;
    }

    /**
     * BMIのカテゴリーを返す
     * @return BMIのカテゴリー
     */
    public String getBmiCategory() {
        double bmi = getBmi();
        if (bmi < 18.5) {
            return "低体重";
        } else if (bmi < 25.0) {
            return "標準体重";
        } else {
            return "肥満";
        }
    }

    /**
     * ダイエットした場合のBMIを計算して返す。
     * @param reduced ダイエットで減らす重さ[kg]
     * @return BMI
     */
    public double getBmiAfterDieting(double reduced) {
        return (weight - reduced) / (height * height);
    }
}
