/*6. Define a 1D array called MARKS of size N, that holds the marks of N students, sort 
the marks in descending order and display the resultant array. 
MARKS 
23 
79 
68 
93 
37 
89 
Additional Exercise 
Write C programs to do the following: 
… N*/

#include <stdio.h>

int main() {
    int N, i, j, temp;
    int MARKS[100];

    printf("Enter number of students: ");
    scanf("%d", &N);

    printf("Enter marks:\n");
    for (i = 0; i < N; i++)
        scanf("%d", &MARKS[i]);

    for (i = 0; i < N - 1; i++) {
        for (j = 0; j < N - 1 - i; j++) {
            if (MARKS[j] < MARKS[j + 1]) {
                temp = MARKS[j];
                MARKS[j] = MARKS[j + 1];
                MARKS[j + 1] = temp;
            }
        }
    }

    printf("Marks in descending order:\n");
    for (i = 0; i < N; i++)
        printf("%d ", MARKS[i]);

    return 0;
}
