package d00000.quiz;

public class Comic {
    /** 漫画のタイトル */
    public String title;
    /** 巻 */
    public int volume;
    /** 本体価格 */
    public int price;

    /** コンストラクタ */
    public Comic(String title, int volume, int price) {
        this.title = title;
        this.volume = volume;
        this.price = price;
    }

    /** 税込価格を算出するメソッド */
    public int priceInclTax() {
        return (int) (price * 1.08);
    }
}
