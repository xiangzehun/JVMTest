#include <stdio.h>

int foo = 10;

int main() {

    volatile int a = foo + 10;

    __asm__ volatile ("lock; addl $0,0(%%rsp)" : : : "cc", "memory");

    volatile int b = foo + 20;

    return 0;
}