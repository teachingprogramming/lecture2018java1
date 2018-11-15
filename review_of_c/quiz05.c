#include <stdio.h>

double electricity_charge(int a, int kWh) {
    // 基本料金
    double base = 0;
    if (a == 10) {
        base = 280.80;
    } else if (a == 15) {
        base = 421.20;
    } else if (a == 20) {
        base = 561.60;
    } else if (a == 30) {
        base = 842.40;
    } else if (a == 40) {
        base = 1123.20;
    } else if (a == 50) {
        base = 1404.00;
    } else if (a == 60) {
        base = 1684.80;
    }

    // 電力量料金
    double charge = 0;
    if (kWh < 120.0) {
        charge += 19.52 * kWh;
    } else {
        charge += 19.52 * 120.0;
        if (kWh < 300) {
            charge += 26.00 * (kWh - 120.0);
        } else {
            charge += 26.00 * (300.0 - 120.0);
            charge += 30.02 * (kWh - 300.0);
        }
    }

    // 料金を返す
    return base + charge;
}

int main() {
    double ec1 = electricity_charge(20, 135);
    printf("従量電灯Bの契約アンペアが20Aで電力量が135kWhの電気料金は%lf円です。\n", ec1);

    double ec2 = electricity_charge(40, 200);
    printf("従量電灯Bの契約アンペアが40Aで電力量が200kWhの電気料金は%lf円です。\n", ec2);

    double ec3 = electricity_charge(15, 350);
    printf("従量電灯Bの契約アンペアが15Aで電力量が350kWhの電気料金は%lf円です。\n", ec3);

    return 0;
}
