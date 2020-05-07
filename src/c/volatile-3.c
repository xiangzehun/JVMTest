#include <stdio.h>

int fun(volatile int *p) {
    return 10;
}

int main() {
    int b = 10;

    fun(&b);

    printf("%d\n", b);

    return 0;
}