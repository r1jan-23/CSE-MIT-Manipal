/*6. Append ‘C’ code to define a function called Find_Topper which takes the array AV
ERAGE, the number of students N along with the array STUDENTS_NAMES (from 
Lab 7) as arguments and finds the student who has the maximum marks and prints the 
name of that student. Call this function in main(). 
Ex:  
… 
printf(“The topper is : ”); 
Find_Topper(AVERAGE, N, STUDENTS_NAMES); 
… 
Expected Sample Output: The topper is : Abhay */
#include <stdio.h>

/* Function to find topper */
void Find_Topper(int AVERAGE[10], int N, char STUDENTS_NAMES[10][20]) {
    int i, maxIndex = 0;

    for(i = 1; i < N; i++) {
        if(AVERAGE[i] > AVERAGE[maxIndex])
            maxIndex = i;
    }

    printf("%s\n", STUDENTS_NAMES[maxIndex]);
}

int main() {
    int AVERAGE[10];
    char STUDENTS_NAMES[10][20];
    int N, i;

    printf("Enter number of students: ");
    scanf("%d", &N);

    printf("Enter student names:\n");
    for(i = 0; i < N; i++)
        scanf("%s", STUDENTS_NAMES[i]);

    printf("Enter average marks:\n");
    for(i = 0; i < N; i++)
        scanf("%d", &AVERAGE[i]);

    printf("\nThe topper is : ");
    Find_Topper(AVERAGE, N, STUDENTS_NAMES);

    return 0;
}
