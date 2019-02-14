package d00000.exam;

public class ArithmeticProgression {
    public int a;
    public int d;

    public ArithmeticProgression(int a, int d) {
        this.a = a;
        this.d = d;
    }

    public int getNthValue(int n) {
        return a + (n - 1) * d;
    }

    public int getProd(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= getNthValue(i);
        }
        return prod;
    }
}
