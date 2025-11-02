
class Logic {

    void CheckOdd(int num) {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= num; iCnt++) {

            if (iCnt % 2 != 0) {

                System.out.print(iCnt +"\t");
            }
        }

    }
}

class Assignment_18_3 {

    public static void main(String Arr[]) {
        Logic obj = new Logic();
        obj.CheckOdd(12);
    }

}
