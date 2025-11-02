
class Logic {

    void FindFactorial(int num) {
        int iDigit = 0;
        int iCount = 0;

        if (num < 0) 
        {

            num = -num;
        }

        while (num != 0) 
        {
            iDigit = num % 10;
            iCount++;
            num = num / 10;
        }
        System.out.println("Frequency of given number is:"+iCount);
    }
}

class Assignment_16_5 {

    public static void main(String Arr[]) {
        Logic obj = new Logic();
        obj.FindFactorial(7865);
    }

}
