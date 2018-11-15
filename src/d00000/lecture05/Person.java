package d00000.lecture05;

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
}
