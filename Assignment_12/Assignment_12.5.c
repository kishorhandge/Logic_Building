#include <stdio.h>
#include <stdbool.h>

bool is_divisible_by_five(int number)
{

    if (number < 0)
    {
        printf("Invalid Input");
    }

    if (number % 5 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    int number = 0;

    printf("Enter number:\n");
    scanf("%d", &number);

    printf("%s\n", is_divisible_by_five(number) ? "Yes" : "No");

    return 0;
}
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Time complexity:O(n)
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////
