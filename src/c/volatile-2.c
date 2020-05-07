#include <stdio.h>

int fun() {
    return 10;
}

int main() {
    // 1
//    int a = 5;
//    int b = 10;

    // 2
    volatile int a = 5;
    volatile int b = 10;

    a = fun(); // eax

    b = a + 1; //addl

    printf("%d\n", b);

    return 0;
}