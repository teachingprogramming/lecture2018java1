#include <stdio.h>

int max(int array[3][4]) {
    int i;
    int j;
    int max = array[0][0];
    for (j = 0; j < 3; j++) {
        for (i = 0; i < 4; i++) {
            if (max < array[j][i]) {
                max = array[j][i];
            }
        }
    }
    return max;
}

int main() {
    int array1[3][4] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
    };
    int max1 = max(array1);
    printf("array1に含まれる数の最大は%dです。\n", max1);

    int array2[3][4] = {
            {-1,  -2,  -3,  -4},
            {-5,  -6,  -7,  -8},
            {-9, -10, -11, -12}
    };
    int max2 = max(array2);
    printf("array2に含まれる数の最大は%dです。\n", max2);

    int array3[3][4] = {
            {-1,  2,  -3,  4},
            {5,  -6,  7,  -8},
            {1,  -2,  3,  -4}
    };
    int max3 = max(array3);
    printf("array3に含まれる数の最大は%dです。\n", max3);

    return 0;
}
