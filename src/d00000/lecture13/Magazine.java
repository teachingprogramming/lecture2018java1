package d00000.lecture13;

public class Magazine extends Book {
    public int year;
    public int month;

    public Magazine(String title, int price, int year, int month) {
        super(title, price);
        this.year = year;
        this.month = month;
    }

    @Override
    public String toString() {
        return title + "（" + year + "年" + month + "月号）, " + priceInclTax() + "円";
    }
}
