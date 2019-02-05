package d00000.quiz;

public class Mail {
    /** 重さ[g] */
    public int weight;

    /** 料金を取得するメソッド（オーバーライドされることが前提のメソッド） */
    public int getCharge() {
        return -1;
    }
}
