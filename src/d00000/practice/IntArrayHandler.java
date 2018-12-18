package d00000.practice;

public class IntArrayHandler {
    public int sum(int[] array) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        return s;
    }

    public int[] join(int[] a, int[] b) {
        int l = a.length + b.length;
        int[] j = new int[l];
        for (int i = 0; i < a.length; i++) {
            j[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            j[a.length + i] = b[i];
        }
        return j;
    }
}
