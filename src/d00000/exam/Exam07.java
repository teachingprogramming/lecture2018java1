package d00000.exam;

public class Exam07 {
    public static void main(String[] args) {
        CoinBank coinBank = new CoinBank(0, 0, 0, 0, 5, 1); // 100円硬貨5枚、500円硬貨1枚
        System.out.println("最初の状態: " + coinBank.getTotalNumber() + "枚、" + coinBank.getTotalValue() + "円");

        Coin c1 = new Coin(10); // 10円硬貨
        coinBank.deposit(c1); // 10円硬貨を貯金
        Coin c2 = new Coin(50); // 50円硬貨
        coinBank.deposit(c2); // 50円硬貨を貯金
        System.out.println("貯金後1: " + coinBank.getTotalNumber() + "枚、" + coinBank.getTotalValue() + "円");

        Coin c3 = new Coin(109); // 1ドル硬貨（1ドルが109円のとき）
        coinBank.deposit(c3); // 1ドル硬貨を貯金
        System.out.println("貯金後2: " + coinBank.getTotalNumber() + "枚、" + coinBank.getTotalValue() + "円");

        int money = coinBank.withdrawal(); // 全額取り出し
        System.out.println("取り出した金額: " + money + "円");
        System.out.println("取り出した直後: " + coinBank.getTotalNumber() + "枚、" + coinBank.getTotalValue() + "円");
    }
}
