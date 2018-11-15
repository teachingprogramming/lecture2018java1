#include <stdio.h>

int odd_check(int array[4][6]) {
    int i;
    int j;
    int odd = 0;
    for (j = 0; j < 4; j++) {
        for (i = 0; i < 6; i++) {
            if (array[j][i] % 2 == 1) {
                odd++;
            }
        }
    }
    return odd;
}

int main() {
    int array1[4][6] = {
            {0,  1,  2,  3,  4,  5},
            {6,  7,  8,  9,  10, 11},
            {12, 13, 14, 15, 16, 17},
            {18, 19, 20, 21, 22, 23}
    };
    int odd1 = odd_check(array1);
    printf("array1に含まれる奇数の個数は%dです。\n", odd1);

    int array2[4][6] = {
            {1, 5, 3, 2, 4, 5},
            {1, 1, 8, 4, 3, 2},
            {7, 3, 4, 5, 6, 3},
            {4, 2, 4, 1, 2, 7}
    };
    int odd2 = odd_check(array2);
    printf("array2に含まれる奇数の個数は%dです。\n", odd2);

    return 0;
}
