package two;

import java.util.Scanner;

public class CoinsToChange {
    public static void main(String[] args) {


        System.out.print("Input Total Purchase Amount:");
        int totalPrice = new Scanner(System.in).nextInt();

        System.out.print("Input Amount Paid by Customer:");
        int customerPaidAmount = new Scanner(System.in).nextInt();

        int change = customerPaidAmount-totalPrice;

        int fiveHundred = 0,twoHundred = 0,fifty = 0,ten = 0,five = 0,one = 0;

        System.out.println("Change: "+change);


        while (change != 0){

            if(change >= 500){
                change = change-500;
                ++fiveHundred;
            } else if (change >= 200) {
                change = change-200;
                ++twoHundred;
            } else if (change >= 50) {
                change = change-50;
                ++fifty;
            } else if (change >= 10) {
                change = change-10;
                ++ten;
            } else if (change >= 5) {
                change = change-5;
                ++five;
            } else if (change >= 1) {
                change = change-1;
                ++one;
            }
        }

        System.out.println("R500 notes :"+fiveHundred);
        System.out.println("R200 notes :"+twoHundred);
        System.out.println("R50 notes :"+fifty);
        System.out.println("R10 coins :"+ten);
        System.out.println("R5 coins :"+five);
        System.out.println("R1 coins :"+one);
    }
}
