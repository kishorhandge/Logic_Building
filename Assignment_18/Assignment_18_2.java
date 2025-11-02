
class Logic {

    void CheckEven(int num) {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= num; iCnt++) {

            if (iCnt % 2 == 0) {
                System.out.print(iCnt +"\t");

            }
        }

    }
}

class Assignment_18_2 {

    public static void main(String Arr[]) {
        Logic obj = new Logic();
        obj.CheckEven(12);
    }

}
