#include <stdio.h>

int water_charge(int diameter, int cubic_meter) {
    // 基本料金を計算する
    int base = 0;
    if (diameter == 13 || diameter == 20 || diameter == 25) {
        base = 920;
    } else if (diameter == 30) {
        base = 2800;
    } else if (diameter == 40) {
        base = 5200;
    } else if (diameter == 50) {
        base = 9600;
    } else if (diameter == 75) {
        base = 20200;
    } else if (diameter == 100) {
        base = 33000;
    } else if (diameter == 150) {
        base = 78600;
    }

    // 超過料金を計算する
    int excess = 0;
    if (cubic_meter > 20) {
        excess = (cubic_meter - 20) * 115;
    }

    // 料金を返す
    return base + excess;
}

int main() {
    int wc1 = water_charge(20, 35);
    printf("口径が20ミリメートルで、35立方メートルの水道料金は%d円です。\n", wc1);

    int wc2 = water_charge(50, 15);
    printf("口径が50ミリメートルで、15立方メートルの水道料金は%d円です。\n", wc2);

    int wc3 = water_charge(100, 30);
    printf("口径が100ミリメートルで、30立方メートルの水道料金は%d円です。\n", wc3);

    return 0;
}
