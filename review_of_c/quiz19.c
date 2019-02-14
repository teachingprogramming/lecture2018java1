#include <stdio.h>

int income_tax(int income) {
    if (income <= 1950000) {
        return (int) (income * 0.05);
    } else if (income <= 3300000) {
        return (int) (income * 0.1 - 97500);
    } else if (income <= 6950000) {
        return (int) (income * 0.2 - 427500);
    } else if (income <= 9000000) {
        return (int) (income * 0.23 - 636000);
    } else if (income <= 18000000) {
        return (int) (income * 0.33 - 1536000);
    } else if (income <= 40000000) {
        return (int) (income * 0.4 - 2796000);
    } else {
        return (int) (income * 0.45 - 4796000);
    }
}


int main() {
    int incomeArray[] = {100, 200, 400, 700, 1000, 2000, 5000};
    int i;
    for (i = 0; i < 7; i++) {
        int income = incomeArray[i] * 10000;
        int tax = income_tax(income);
        printf("所得金額が%d万円の場合の税額は%d円です。\n", incomeArray[i], tax);
    }

    return 0;
}
