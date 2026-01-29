/*5. Write a C program to create a 2D array called STUDENTS_MARK of size 2xN to 
store the roll numbers of N students and corresponding marks scored by them and 
display STUDENTS_MARK.                                                                                      
(Note: Create two 1D arrays STUDENTS and MARKS and assign roll numbers and 
marks respectively like the ones created in Lab 5, assign the contents of the two 1D 
arrays into the 2D array STUDENTS_MARK) 
Expected Output: 
1  2  3  4  5  6  ... N
23 79 68 93 37 89 ... M1 */
#include <stdio.h>

int main() {
    int n, i;
    int STUDENTS[10], MARKS[10];
    int STUDENTS_MARK[2][10];

    printf("Enter number of students: ");
    scanf("%d", &n);

    printf("Enter roll numbers:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &STUDENTS[i]);

    printf("Enter marks:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &MARKS[i]);

    for(i = 0; i < n; i++) {
        STUDENTS_MARK[0][i] = STUDENTS[i];
        STUDENTS_MARK[1][i] = MARKS[i];
    }

    printf("STUDENTS_MARK Array:\n");
    for(i = 0; i < n; i++)
        printf("%d\n%d\n", STUDENTS_MARK[0][i], STUDENTS_MARK[1][i]);

    return 0;
}
