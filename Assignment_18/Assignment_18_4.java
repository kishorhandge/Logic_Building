
class Logic {

    void SumOfEvenOddDigit(int num) {

        int iDigit = 0;

        int EvenSum = 0;
        int OddSum = 0;

        while (num != 0) 
        {
            iDigit = num % 10;

            if (iDigit % 2 == 0) 
            {

                EvenSum = EvenSum + iDigit;
            } 
            else 
            {
                OddSum = OddSum + iDigit;
            }

            num = num / 10;
        }

        System.out.println("Even Sum is :" + EvenSum);

        System.out.println("Odd Sum is :" + OddSum);

    }
}

class Assignment_18_4 {

    public static void main(String Arr[]) {
        Logic obj = new Logic();
        obj.SumOfEvenOddDigit(123456);
    }

}
