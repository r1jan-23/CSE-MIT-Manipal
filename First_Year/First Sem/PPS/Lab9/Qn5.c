/*5. Define a structure for a product with members for product ID, name, and price. Write 
a program to create array of products using pointers, input their details, and display 
them. (Use the concept of pointers and structures) */
#include <stdio.h>

struct product {
    int id;
    char name[20];
    float price;
};

int main() {
    struct product p[5];
    struct product *ptr = p;
    int i;

    for(i = 0; i < 5; i++) {
        printf("\nEnter product %d details:\n", i + 1);
        scanf("%d %s %f",
              &(ptr + i)->id,
              (ptr + i)->name,
              &(ptr + i)->price);
    }

    printf("\nProduct Details:\n");
    for(i = 0; i < 5; i++) {
        printf("ID:%d Name:%s Price:%.2f\n",
               (ptr + i)->id,
               (ptr + i)->name,
               (ptr + i)->price);
    }

    return 0;
}
