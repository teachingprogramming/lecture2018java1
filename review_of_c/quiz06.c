#include <stdio.h>

int count(int start, int end, int x, int y) {
    int i;
    int c = 0;
    for (i = start; i <= end; i++) {
        if (i % x == 0 || i % y == 0) {
            c++;
        }
    }
    return c;
}

int main() {
    int c1 = count(100, 200, 3, 5);
    printf("100以上200以下の数のうち、3もしくは5の倍数の個数は%d個です。\n", c1);

    int c2 = count(1000, 2000, 7, 11);
    printf("1000以上2000以下の数のうち、7もしくは11の倍数の個数は%d個です。\n", c2);

    int c3 = count(2000, 4000, 13, 17);
    printf("2000以上4000以下の数のうち、13もしくは17の倍数の個数は%d個です。\n", c3);

    return 0;
}
