#include <stdio.h>

int sum_of_absolute_values(int array[5][3]) {
    int i;
    int j;
    int sum = 0;
    for (j = 0; j < 5; j++) {
        for (i = 0; i < 3; i++) {
            if (array[j][i] >= 0) {
                sum += array[j][i];
            } else {
                sum += array[j][i] * -1;
            }
        }
    }
    return sum;
}

int main() {
    int array1[5][3] = {
            {0,  -1,  2},
            {-3, 4,   -5},
            {6,  -7,  8},
            {-9, 10,  -11},
            {12, -13, 14},
    };
    int sum1 = sum_of_absolute_values(array1);
    printf("array1に含まれる数の絶対値の合計は%dです。\n", sum1);

    int array2[5][3] = {
            {1, -1, 1},
            {1, -1, 1},
            {1, -1, 1},
            {1, -1, 1},
            {1, -1, 1},
    };
    int sum2 = sum_of_absolute_values(array2);
    printf("array2に含まれる数の絶対値の合計は%dです。\n", sum2);

    return 0;
}
