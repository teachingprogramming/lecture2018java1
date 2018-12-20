package d00000.exam;

public class Parcel {
    public int a;
    public int b;
    public int c;
    public int weight;

    public Parcel(int a, int b, int c, int weight) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.weight = weight;
    }

    public int getSize() {
        int sum = a + b + c;
        if (sum <= 60) {
            return 60;
        } else if (sum <= 80) {
            return 80;
        } else if (sum <= 100) {
            return 100;
        } else if (sum <= 120) {
            return 120;
        } else if (sum <= 140) {
            return 140;
        } else if (sum <= 160) {
            return 160;
        } else if (sum <= 170) {
            return 170;
        } else {
            return -1;
        }
    }

    public int getCost() {
        int cost = 0;
        int size = getSize();
        if (size == 60) {
            cost = 800;
        } else if (size == 80) {
            cost = 1010;
        } else if (size == 100) {
            cost = 1260;
        } else if (size == 120) {
            cost = 1500;
        } else if (size == 140) {
            cost = 1750;
        } else if (size == 160) {
            cost = 1970;
        } else if (size == 170) {
            cost = 2300;
        } else {
            return -1;
        }
        if (25 < weight && weight <= 30) {
            cost += 500;
        } else if (30 < weight) {
            return -1;
        }
        return cost;
    }
}
