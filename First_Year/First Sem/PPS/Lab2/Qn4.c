/*4. Find the smallest among three numbers using conditional operator. */
#include <stdio.h>

int main() {
    int a, b, c, min;
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    printf("%d", min);

    return 0;
}
