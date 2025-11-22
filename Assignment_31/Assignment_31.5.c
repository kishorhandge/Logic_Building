/*
    iRow : 6
    iCol : 6

    1   2   3       4       5       6
        2   3       4       5       6
            3       4       5       6
                    4       5       6
                            5       6
                                    6

    
*/
#include <stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;

    for (i = 1; i <= iRow; i++)
    {

        for (j = 1; j <= iCol; j++)
        {
            if(i <= j)
                {
                    printf("%d\t",j); 
                  
                }
                else
                {
                    printf(" \t");  
                }  
             
        }

        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter the number of rows :\n");
    scanf("%d", &iValue1);

    printf("Enter the number of columns :\n");
    scanf("%d", &iValue2);

    Pattern(iValue1, iValue2);
    return 0;
}