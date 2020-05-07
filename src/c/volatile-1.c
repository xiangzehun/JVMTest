#include <stdio.h>

/*
    gcc -S **.c -O2
*/

int fun() {
    return 10;
}

int main() {
    volatile int a = 5;
    int b = 10;

    a = fun();

    b = a + 1;

    return 0;
}