package d00000.lecture05;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "太郎";
        person1.height = 1.7;
        person1.weight = 60.0;
        person1.age = 19;
        person1.hasDriverLicense = true;

        System.out.println(person1.name + "は" + person1.age + "才です。");
        System.out.print("運転免許証を");
        if (person1.hasDriverLicense) {
            System.out.print("持っています。");
        } else {
            System.out.print("持っていません。");
        }

        double bmi1 = person1.getBmi();
        System.out.println(person1.name + "のBMIは" + bmi1 + "才です。");
        // System.out.println(person1.name + "のBMIは" + person1.getBmi() + "才です。");
    }
}
