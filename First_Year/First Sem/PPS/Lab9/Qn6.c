/*6. Define a structure for a cricket player with members for player name, team name, and 
batting average. Write a program to input data for multiple players and sort them by 
batting average. (Use the concept of array and structures) */
#include <stdio.h>

struct player {
    char name[20];
    char team[20];
    float avg;
};

int main() {
    struct player p[5], temp;
    int i, j;

    printf("Enter player details:\n");
    for(i = 0; i < 5; i++)
        scanf("%s %s %f", p[i].name, p[i].team, &p[i].avg);

    for(i = 0; i < 4; i++) {
        for(j = i + 1; j < 5; j++) {
            if(p[i].avg < p[j].avg) {
                temp = p[i];
                p[i] = p[j];
                p[j] = temp;
            }
        }
    }

    printf("\nPlayers sorted by batting average:\n");
    for(i = 0; i < 5; i++)
        printf("%s %s %.2f\n", p[i].name, p[i].team, p[i].avg);

    return 0;
}
