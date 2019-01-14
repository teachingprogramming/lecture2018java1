package d00000.quiz;

public class DoubleArrayHandler {
    public double sumOfMod(double[] array) {
        double s = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                s += array[i];
            } else {
                s -= array[i];
            }
        }
        return s;
    }

    public double[] treble(double[] a) {
        int l = a.length * 3;
        double[] t = new double[l];
        for (int i = 0; i < a.length; i++) {
            t[i*3] = a[i];
            t[i*3+1] = a[i];
            t[i*3+2] = a[i];
        }
        return t;
    }
}
