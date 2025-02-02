package two;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int numberInput;
        System.out.print("Enter Your Number :");
        numberInput = new Scanner(System.in).nextInt();

        long factorial = 1;

        while (numberInput >= 1){

            if (numberInput != 1) {
                System.out.print(numberInput + "*");
            } else {
                System.out.print(numberInput);
            }
            factorial = factorial * numberInput--;
        }
        System.out.println();
        System.out.println("Answer :"+factorial);

    }
}
