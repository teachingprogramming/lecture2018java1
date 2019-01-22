package d00000.lecture13;

public class Book {
    /** タイトル */
    public String title;
    /** 本体価格 */
    public int price;

    /** コンストラクタ */
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    /** 税込価格を算出するメソッド */
    public int priceInclTax() {
        return (int) (price * 1.08);
    }

    @Override
    public String toString() {
        return title + ", " + priceInclTax() + "円";
    }
}
