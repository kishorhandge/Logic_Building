class Logic {

    void CalculatePower(int base,int exp) 
    {
        int iCnt=0;
        int iRes=1;

        for(iCnt=1;iCnt<=exp;iCnt++)
        {
            iRes=iRes*base;
        }

        System.out.println(iRes);

    }
}

class Assignment_19_5 {

    public static void main(String Arr[]) {
        Logic obj = new Logic();
        obj.CalculatePower(2,5);
    }

}
