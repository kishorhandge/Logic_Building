
class Logic {

    void CheckDivisible(int num) 
    {
        if (num % 5 == 0 && num % 11 == 0) 
        {
            System.out.println("Number is divisible by both  5 and 11");
        } else
        {
            System.out.println("Number is not divisible by 5 and 11 ");
        }

    }
}

class Assignment_19_3 {

    public static void main(String Arr[]) {
        Logic obj = new Logic();
        obj.CheckDivisible(65);
    }

}
