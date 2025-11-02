class Logic {

    void PrintDigit(int num) 
    {
        int iDigit=0;
        int iOrignal=0;

        while(num!=0)
        {
            iDigit=num%10;
            System.out.println(iDigit);
            num=num/10;
        }

        while(iDigit!=0)
        {
            iOrignal=iDigit%10;
            System.out.println(iOrignal);
            iDigit=iDigit/10;
        }
         

    }
}

class Assignment_19_4 {

    public static void main(String Arr[]) {
        Logic obj = new Logic();
        obj.PrintDigit(9876);
    }

}
