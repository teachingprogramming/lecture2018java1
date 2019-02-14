#include <stdio.h>

int sum(int start, int end, int x, int y) {
    int i;
    int s = 0;
    for (i = start; i <= end; i++) {
        if (i % x != 0 || i % y != 0) {
            s += i;
        }
    }
    return s;
}

int main() {
    int s1 = sum(100, 200, 3, 5);
    printf("100以上200以下の数の合計（ただし3もしくは5倍数を除く）は%dです。\n", s1);

    int s2 = sum(1000, 2000, 2, 7);
    printf("1000以上2000以下の数の合計（ただし2もしくは7倍数を除く）は%dです。\n", s2);

    int s3 = sum(123, 456, 11, 13);
    printf("123以上456以下の数の合計（ただし11もしくは13の倍数を除く）は%dです。\n", s3);

    return 0;
}
