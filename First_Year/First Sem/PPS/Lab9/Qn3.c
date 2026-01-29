/*3. Define a structure to store student details (e.g., name, roll number, marks in three 
subjects). Write a program to input data for five students, calculate their total and 
average marks, and display the results. */
#include <stdio.h>

struct student {
    char name[20];
    int roll;
    int m1, m2, m3;
    int total;
    float average;
};

int main() {
    struct student s[5];
    int i;

    for(i = 0; i < 5; i++) {
        printf("\nEnter details of student %d\n", i + 1);
        scanf("%s %d %d %d %d",
              s[i].name, &s[i].roll,
              &s[i].m1, &s[i].m2, &s[i].m3);

        s[i].total = s[i].m1 + s[i].m2 + s[i].m3;
        s[i].average = s[i].total / 3.0;
    }

    printf("\nStudent Details:\n");
    for(i = 0; i < 5; i++) {
        printf("%s %d Total=%d Avg=%.2f\n",
               s[i].name, s[i].roll,
               s[i].total, s[i].average);
    }

    return 0;
}
