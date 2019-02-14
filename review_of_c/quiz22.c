#include <stdio.h>

double product(double data[10]) {
    int i;
    double p = 1.0;
    for (i = 0; i < 10; i++) {
        p *= data[i];
    }
    return p;
}

int main() {
    double data1[10] = {2.2, 2.1, 5.4, 3.2, 2.9, 6.1, 3.3, 8.2, 7.1, 8.1};
    double p1 = product(data1);
    printf("data1の総乗は%lfです。\n", p1);

    double data2[10] = {3.1, 5.3, 0.1, 7.3, 2.1, 6.5, 3.1, 11.0, 0.9, 13.3};
    double p2 = product(data2);
    printf("data2の総乗は%lfです。\n", p2);

    return 0;
}
