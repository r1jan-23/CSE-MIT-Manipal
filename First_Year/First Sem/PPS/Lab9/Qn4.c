/*4. Define a structure for a student with a nested structure for the address (including 
street, city, and zip code). Write a program to input and display student details along 
with their address (Use nested structure concept)*/
#include <stdio.h>

struct address {
    char street[20];
    char city[20];
    int zip;
};

struct student {
    char name[20];
    int roll;
    struct address addr;
};

int main() {
    struct student s;

    printf("Enter name and roll number:\n");
    scanf("%s %d", s.name, &s.roll);

    printf("Enter street, city and zip:\n");
    scanf("%s %s %d", s.addr.street, s.addr.city, &s.addr.zip);

    printf("\nStudent Details:\n");
    printf("Name: %s\nRoll: %d\n", s.name, s.roll);
    printf("Address: %s, %s - %d\n",
           s.addr.street, s.addr.city, s.addr.zip);

    return 0;
}
