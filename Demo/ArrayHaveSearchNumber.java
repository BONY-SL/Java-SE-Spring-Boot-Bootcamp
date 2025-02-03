import java.util.Scanner;

public class ArrayHaveSearchNumber {
    public static void main(String[] args) {

        int [] array = {10,25,30,40,53,64};

        System.out.print("Enter Your Number : ");
        int num = new Scanner(System.in).nextInt();

        boolean isNumberHave = ArrayHaveSearchNumber.searchArray(array,num);

        if(isNumberHave){
            System.out.println(num + " is have in the Array");
        }else {
            System.out.println(num + " is not have in the Array");

        }

    }

    private static boolean searchArray(int[] array, int num) {

        boolean isHave = false;

        for (int j : array) {

            if (j == num) {
                isHave = true;
                break;
            }
        }
        return isHave;
    }
}
