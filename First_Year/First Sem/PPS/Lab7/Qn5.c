/*5. Add the following to Lab 6 program:  
Define a string array called STUDENTS_NAMES to store the names of N students 
and display them. 
STUDENTS_NAMES 
T a n v i \0   
B h a g y a \0
 Y a s h \0    
 A b h a y \0
. 
. 
. 
N  i t h i n \0  
Refer the below expected output (>>>) samples for understanding: 
STUDENTS_NAMES[0]       
>>> “Tanvi”  
STUDENTS_NAMES[0][3]  >>> ‘v’ */
#include <stdio.h>

int main() {
    char STUDENTS_NAMES[10][20];
    int n, i;

    printf("Enter number of students: ");
    scanf("%d", &n);

    printf("Enter student names:\n");
    for(i = 0; i < n; i++) {
        scanf("%s", STUDENTS_NAMES[i]);
    }

    printf("\nDisplaying STUDENTS_NAMES:\n");
    for(i = 0; i < n; i++) {
        printf("STUDENTS_NAMES[%d] >>> \"%s\"\n", i, STUDENTS_NAMES[i]);
    }

    printf("\nCharacter access example:\n");
    printf("STUDENTS_NAMES[0][3] >>> '%c'\n", STUDENTS_NAMES[0][3]);

    return 0;
}
