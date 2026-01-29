/*6. Add the following to Q No. 5. Define another 2D array called STUDENTS_MARKS 
of size 4XN to store the roll numbers of N students along with the marks scored by 
them in three subjects respectively and display the 2D array. 
(Note: Make use of the contents from the array STUDENTS_MARK in question no.5) 
Expected Output: 
1  2  3  4  5  6  ...N
23 79 68 93 37 89 ...M1
45 80 55 90 46 91 ...M2
39 88 65 89 50 70 ...M3 */
#include <stdio.h>

int main() {
    int n, i;
    int STUDENTS_MARKS[4][10];

    printf("Enter number of students: ");
    scanf("%d", &n);

    printf("Enter roll numbers:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &STUDENTS_MARKS[0][i]);

    printf("Enter marks of Subject 1:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &STUDENTS_MARKS[1][i]);

    printf("Enter marks of Subject 2:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &STUDENTS_MARKS[2][i]);

    printf("Enter marks of Subject 3:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &STUDENTS_MARKS[3][i]);

    printf("STUDENTS_MARKS Array:\n");
    for(i = 0; i < 4; i++) {
        for(int j = 0; j < n; j++)
            printf("%d ", STUDENTS_MARKS[i][j]);
        printf("\n");
    }

    return 0;
}
