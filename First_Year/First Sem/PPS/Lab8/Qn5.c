/*5. Append C code to define a function called Calculate_Average which takes the 
array STUDENTS_MARKS, the number of students N (both from Lab 6) and a 1D 
array called AVERAGE of size N as arguments and computes the average marks of 
each student and stores it in the corresponding index of the array AVERAGE. Call 
this function in the main() and print the average marks of each student. 
STUDENTS_MARK
1 2 3 4 5 6 ... N
23 79 68 93 37 89 … M1
45  80 55 90 46 91 … M2 
39 88 65 89 50 70 ...M3
AVERAGE
1 2 3 4 5 6 ... N
35 82 62 90 44 83 ... M*/
#include <stdio.h>

/* Function to calculate average marks */
void Calculate_Average(int STUDENTS_MARKS[3][10], int N, int AVERAGE[10]) {
    int i;
    for(i = 0; i < N; i++) {
        AVERAGE[i] = (STUDENTS_MARKS[0][i] +
                      STUDENTS_MARKS[1][i] +
                      STUDENTS_MARKS[2][i]) / 3;
    }
}

int main() {
    int STUDENTS_MARKS[3][10];
    int AVERAGE[10];
    int N, i;

    printf("Enter number of students: ");
    scanf("%d", &N);

    printf("Enter marks of Subject 1:\n");
    for(i = 0; i < N; i++)
        scanf("%d", &STUDENTS_MARKS[0][i]);

    printf("Enter marks of Subject 2:\n");
    for(i = 0; i < N; i++)
        scanf("%d", &STUDENTS_MARKS[1][i]);

    printf("Enter marks of Subject 3:\n");
    for(i = 0; i < N; i++)
        scanf("%d", &STUDENTS_MARKS[2][i]);

    Calculate_Average(STUDENTS_MARKS, N, AVERAGE);

    printf("\nAverage marks of students:\n");
    for(i = 0; i < N; i++)
        printf("Student %d : %d\n", i + 1, AVERAGE[i]);

    return 0;
}