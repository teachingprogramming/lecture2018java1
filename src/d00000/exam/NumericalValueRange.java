package d00000.exam;

public class NumericalValueRange {
    public int start;
    public int end;

    public NumericalValueRange(int a, int b) {
        if (a < b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }
    }

    public int getSum() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public int getCountOfMultiples(int factor) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % factor == 0) {
                count++;
            }
        }
        return count;
    }

    public boolean contains(int number) {
        return start <= number && number <= end;
    }
}
