#include <stdio.h>

void DisplaySchedule(char ch)
{
    switch (ch)
    {
    case 'A':
        printf("Your Exam At 7 AM :\n");
        break;
    case 'B':

        printf("Your Exam At 8:30 AM :\n");
        break;
    case 'C':

        printf("Your Exam At 9:20 AM :\n");
        break;
    case 'D':

        printf("Your Exam At 10:30 AM :\n");
        break;

    default:

        printf("Invalid Division:\n");
        break;
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter the character : \n");
    scanf("%c", &cValue);

    DisplaySchedule(cValue);

    return 0;
}
