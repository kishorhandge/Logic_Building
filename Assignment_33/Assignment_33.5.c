#include<stdio.h>

void DisplaySchedule(char ch)
{
    if((ch == 'A'))
    {
        printf("Your Exam At 7 AM :\n");
    }
    else if((ch == 'B'))
    {
        printf("Your Exam At 8:30 AM :\n");
    }
    else if((ch == 'C'))
    {
        printf("Your Exam At 9:20 AM :\n");
    }
    else if((ch == 'D'))
    {
        printf("Your Exam At 10:30 AM :\n"); 
    }

}

int main()
{   
    char cValue = '\0';

    printf("Enter the character : \n");
    scanf("%c",&cValue);

    DisplaySchedule(cValue);

    return 0;
}
 

 

 
 
