/*
Step 1:Understand the problem statement
Step 2:Write the algorithm
Step 3:Decide the programming language
Step 4:Write the program
Step 5:Test the program
*/

/*
Algorithm:
START
    Accept the character from user
    Check wheather given charcter is vowel or  ot
    Perform the Operation
    return true if vowel otherwise return false

STOP
*/

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Header Files;
//
/////////////////////////////////////////////////////////////////////////////////////////////////

typedef int bool;

#define TRUE 1
#define FALSE 0


/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name:  CheckVowel
//  Description:    It is use to check the given charcter is vowel or not
//  Input:          char
//  Output:         char
//  Author:         Kishor Suryabhan Handge
//  Date:           19/10/2025
/////////////////////////////////////////////////////////////////////////////////////////////////

bool CheckVowel(char cValue)
{
    if (cValue == 'a' || cValue == 'e' || cValue == 'i' || cValue == 'o' || cValue == 'u')
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point Function for the application
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int cValue = '\0';
    bool bRet = FALSE;

    printf("Enter the Character\n");
    scanf("%c", &cValue);

    bRet = CheckVowel(cValue);
    if (bRet == TRUE)
    {
        printf("It is vowel\n");
    }
    else
    {
        printf("It is not vowel\n");
    }

    return 0;
}
