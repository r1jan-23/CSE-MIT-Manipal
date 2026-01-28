/*5. Define a 1D array called STUDENTS of size N, which holds the roll numbers of N 
students, display the roll numbers, search for a given roll number and display appro
priate message. 
STUDENTS 
1 
2 
3 
4 
5 
6 
… N */
#include <stdio.h>

int main() {
    int N, i, key, found = 0;
    int STUDENTS[100];

    printf("Enter number of students: ");
    scanf("%d", &N);

    printf("Enter roll numbers:\n");
    for (i = 0; i < N; i++)
        scanf("%d", &STUDENTS[i]);

    printf("Roll numbers are:\n");
    for (i = 0; i < N; i++)
        printf("%d ", STUDENTS[i]);

    printf("\nEnter roll number to search: ");
    scanf("%d", &key);

    for (i = 0; i < N; i++) {
        if (STUDENTS[i] == key) {
            found = 1;
            break;
        }
    }

    if (found)
        printf("Roll number found");
    else
        printf("Roll number not found");

    return 0;
}
