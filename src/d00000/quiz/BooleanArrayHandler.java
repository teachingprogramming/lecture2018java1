package d00000.quiz;

public class BooleanArrayHandler {

    public int delta(boolean[] array) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                s++;
            } else {
                s--;
            }
        }
        return s;
    }

    public boolean[] shuttle(boolean[] a) {
        boolean[] s = new boolean[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            s[i] = a[i];
            s[s.length - i - 1] = a[i];
        }
        return s;
    }
}
