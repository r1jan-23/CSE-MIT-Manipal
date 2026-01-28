/*2.  Generate Floyd’s triangle using natural numbers for a given limit N. (using for loops) 
[Hint: Floyd’s triangle is a right angled-triangle using the natural numbers] 
Ex: Input: N = 4 
Output: 
1 
2 3 
4 5 6 
7 8 9 10*/

#include <stdio.h>

int main() {
    int N, i, j, num = 1;
    printf("Enter value of N: ");
    scanf("%d", &N);

    for (i = 1; i <= N; i++) {
        for (j = 1; j <= i; j++) {
            printf("%d ", num);
            num++;
        }
        printf("\n");
    }
    return 0;
}
