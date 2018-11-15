#include <stdio.h>

double mid_range(double data[10]) {
    double min = data[0];
    double max = data[0];
    int i;
    for (i = 1; i < 10; i++) {
        if (data[i] < min) {
            min = data[i];
        } else if (max < data[i]) {
            max = data[i];
        }
    }
    return (max + min) / 2;
}

int main() {
    double data1[10] = {2.2, 2.1, 5.4, 3.2, 2.9, 6.1, 3.3, 8.2, 7.1, 8.1};
    double mr1 = mid_range(data1);
    printf("data1の中点値は%lfです。\n", mr1);

    double data2[10] = {3.1, 5.3, 0.1, 7.3, 2.1, 6.5, 3.1, 11.0, 0.9, 13.3};
    double mr2 = mid_range(data2);
    printf("data2の中点値は%lfです。\n", mr2);

    return 0;
}
