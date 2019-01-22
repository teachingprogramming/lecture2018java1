package d00000.lecture13;

public class Main2 {
    public static void main(String[] args) {
        Book b = new Book("Javaの絵本", 1580);
        System.out.println(b);
        Comic c = new Comic("capeta", 562, 32);
        System.out.println(c);
        Magazine m = new Magazine("Software Design", 1220, 2019, 2);
        System.out.println(m);

        System.out.println("-----------------");

        Book[] bookArray = new Book[]{
                new Book("Java 逆引きレシピ", 2800),
                new Comic("失踪日記", 1140),
                new Magazine("ラジオ 基礎英語１", 450, 2019, 2)
        };
        int totalPrice = 0;
        for (int i = 0; i < bookArray.length; i++) {
            totalPrice += bookArray[i].priceInclTax();
            System.out.println(bookArray[i]);
        }
        System.out.println("合計金額: " + totalPrice + "円");
    }
}
