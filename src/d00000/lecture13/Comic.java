package d00000.lecture13;

public class Comic extends Book {
    /** 巻 */
    public int volume;

    /** コンストラクタ（巻数がある場合） */
    public Comic(String title, int price, int volume) {
        super(title, price); // スーパークラスのコンストラクタを実行
        this.volume = volume;
    }

    /** コンストラクタ（巻数がない場合） */
    public Comic(String title, int price) {
        super(title, price); // スーパークラスのコンストラクタを実行
        this.volume = -1;
    }

    @Override
    public String toString() {
        if (volume < 0) {
            return super.toString();
        } else {
            return title + "（" + volume + "巻）, " + priceInclTax() + "円";
        }
    }
}
