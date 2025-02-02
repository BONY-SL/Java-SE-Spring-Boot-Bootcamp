package two;

import java.util.Scanner;

public class CountNumberDigits {
    public static void main(String[] args) {

        int numberInput;

        System.out.print("Enter Your Number :");
        numberInput = new Scanner(System.in).nextInt();

        int count = 0;


        while (numberInput > 0){
            count++;
            numberInput = numberInput / 10;
        }
        System.out.println("Number of Digits: "+count);

    }
}
