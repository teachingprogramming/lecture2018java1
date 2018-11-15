#include <stdio.h>

double variance(double data[10]) {
    int i;
    double sum = 0;
    for (i = 0; i < 10; i++) {
        sum += data[i];
    }
    double ave = sum / 10;
    double sum_of_diff = 0;
    for (i = 0; i < 10; i++) {
        sum_of_diff += (data[i] - ave) * (data[i] - ave);
    }
    double v = sum_of_diff / 10;
    return v;
}

int main() {
    double data1[10] = {2.2, 2.1, 5.4, 3.2, 2.9, 6.1, 3.3, 8.2, 7.1, 8.1};
    double v1 = variance(data1);
    printf("data1の分散は%lfです。\n", v1);

    double data2[10] = {3.1, 5.3, 0.1, 7.3, 2.1, 6.5, 3.1, 11.0, 0.9, 13.3};
    double v2 = variance(data2);
    printf("data2の分散は%lfです。\n", v2);

    return 0;
}
