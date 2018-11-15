package d00000.lecture04;

public class Sandbox {
    public static void main(String[] args) {
        // 変数
        int a = 0;          // 整数
        double b = 1.1;     // 実数
        String c = "文字列"; // 文字列
        boolean d = true;   // 論理型（boolean型）
        if (d) {
            System.out.println("dはtrue");
        } else {
            System.out.println("dはfalse");
        }
        boolean e = (1 < 2); // 比較演算子は、演算結果としてboolean型を返す
        if (e) {
            System.out.println("1 < 2 は正しい");
        } else {
            System.out.println("1 < 2 は誤り");
        }

        // 演算子
        double f = 5.555;
        int g = (int) f; // キャスト演算子
        System.out.println(f + "をintにキャストすると" + g);

        // 制御文
        for (int i = 100; i < 110; i++) { // forのカッコ内でカウンタ変数iの宣言が可能
            System.out.println(i);
        }
    }
}
