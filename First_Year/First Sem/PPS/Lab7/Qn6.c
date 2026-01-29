/*6. Append code to arrange the names of STUDENTS_NAMES (Refer Q. No.5) in al
phabetical order and store it into another array of same dimension named STU
DENTS_NAMES_SORTED and display sorted names. (Hint: use string handling 
function-strcpy()).  
STUDENTS_NAMES_SORTED
A b h a y \0
B h a g y a \0
N i t h i n \0
T a n v i \0
.
.
.
Y a s h \0*/

#include <stdio.h>
#include <string.h>

int main() {
    char STUDENTS_NAMES[10][20], STUDENTS_NAMES_SORTED[10][20];
    char temp[20];
    int n, i, j;

    printf("Enter number of students: ");
    scanf("%d", &n);

    printf("Enter student names:\n");
    for(i = 0; i < n; i++) {
        scanf("%s", STUDENTS_NAMES[i]);
        strcpy(STUDENTS_NAMES_SORTED[i], STUDENTS_NAMES[i]);
    }

    // Sorting using Bubble Sort logic
    for(i = 0; i < n - 1; i++) {
        for(j = i + 1; j < n; j++) {
            if(strcmp(STUDENTS_NAMES_SORTED[i], STUDENTS_NAMES_SORTED[j]) > 0) {
                strcpy(temp, STUDENTS_NAMES_SORTED[i]);
                strcpy(STUDENTS_NAMES_SORTED[i], STUDENTS_NAMES_SORTED[j]);
                strcpy(STUDENTS_NAMES_SORTED[j], temp);
            }
        }
    }

    printf("\nSTUDENTS_NAMES_SORTED:\n");
    for(i = 0; i < n; i++) {
        printf("%s\n", STUDENTS_NAMES_SORTED[i]);
    }

    return 0;
}
