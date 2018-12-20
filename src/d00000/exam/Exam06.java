package d00000.exam;

public class Exam06 {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random(1); // 乱数生成器をインスタンス化

        SuperMarioBros smb = new SuperMarioBros();
        System.out.println("ゲームスタート");
        System.out.println("マリオ: " + smb.mario + "、コイン: " + smb.coin);

        boolean gameover = false;
        while (!gameover) { // ゲームオーバーになるまでループ
            double r = random.nextDouble();
            if (r < 0.01) {
                gameover = smb.fail(); // 1%でミス
                System.out.println("マリオ: " + smb.mario + "、コイン: " + smb.coin);
            } else {
                smb.takeCoin(); // 99%でコイン取得
            }
        }
        System.out.println("ゲームオーバー");
    }
}
