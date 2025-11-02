class Logic {

    void SumOfEvenOddDigit(int num) {
        
        if(num==0)
        {
            System.out.println("Number is zero");
        }
        if(num<0)
        {
            System.out.println("Number is a Negative number");
        }
        if(num>0)
        {
            System.out.println("Number is a Positive number");
        }

    }
}

class Assignment_18_5 {

    public static void main(String Arr[]) {
        Logic obj = new Logic();
        obj.SumOfEvenOddDigit(4);
    }

}
