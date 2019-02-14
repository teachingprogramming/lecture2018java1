package d00000.exam;

public class Exam12 {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random(0); // 乱数生成器をインスタンス化

        BaseballCount bc = new BaseballCount();
        System.out.println("開始: " + bc.ballCount + "ボール " + bc.strikeCount + "ストライク " + bc.outCount + "アウト");

        while (bc.outCount != 3) { // 3アウトになるまでループ
            double r = random.nextDouble();
            if (r < 0.4) { // 40%でストライク
                if (bc.strike()) {
                    System.out.print("三振: ");
                } else {
                    System.out.print("ストライク: ");
                }
            } else if (r < 0.9) { // 50%でボール
                if (bc.ball()) {
                    System.out.print("フォアボール: ");
                } else {
                    System.out.print("ボール: ");
                }
            } else if (r < 0.95) { // 5%でヒット
                bc.hit();
                System.out.print("ヒット: ");
            } else { // 5%でアウト
                bc.out();
                System.out.print("アウト: ");
            }
            System.out.println(bc.ballCount + "ボール " + bc.strikeCount + "ストライク " + bc.outCount + "アウト");
        }
    }
}
