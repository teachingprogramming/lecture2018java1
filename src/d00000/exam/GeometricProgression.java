package d00000.exam;

public class GeometricProgression {
    public int a;
    public int r;

    public GeometricProgression(int a, int r) {
        this.a = a;
        this.r = r;
    }

    public int getNthValue(int n) {
        int value = a;
        for (int i = 0; i < n - 1; i++) {
            value *= r;
        }
        return value;
    }

    public int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getNthValue(i);
        }
        return sum;
    }
}
