#include <stdio.h>

int sum(int a, int b, int c) {
    int i;
    int s = 0;
    for (i = a; i <= b; i++) {
        if (i % c != 0) {
            s += i;
        }
    }
    return s;
}

int main() {
    int s1 = sum(100, 200, 3);
    printf("100以上200以下の数の合計（ただし3の倍数を除く）は%dです。\n", s1);

    int s2 = sum(1000, 2000, 2);
    printf("1000以上2000以下の数の合計（ただし2の倍数を除く）は%dです。\n", s2);

    int s3 = sum(123, 456, 7);
    printf("123以上456以下の数の合計（ただし7の倍数を除く）は%dです。\n", s3);

    return 0;
}
