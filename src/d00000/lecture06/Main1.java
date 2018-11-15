package d00000.lecture06;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.set("太郎", 1.7, 60.0, 19, true);
        System.out.println(person1.getStatus());

        System.out.println(person1.name + "のBMIは" + person1.getBmi() + "で、カテゴリーは" + person1.getBmiCategory() + "です。");

        int r = 5;
        System.out.println(r + "kg痩せると、BMIは" + person1.getBmiAfterDieting(r) + "になります。");
    }
}
