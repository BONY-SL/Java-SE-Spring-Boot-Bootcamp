package two;

import java.util.Scanner;

public class CheckNumberPalindrome {
    public static void main(String[] args) {

        int numberInput;

        System.out.print("Enter Your Number :");
        numberInput = new Scanner(System.in).nextInt();

        int reversNumber = 0;

        int temp = numberInput;

        while (numberInput > 0){

            reversNumber = reversNumber * 10 + numberInput % 10;

            numberInput = numberInput/10;

        }
        System.out.println("Reverse Value is : "+reversNumber);
        if(temp == reversNumber){
            System.out.println(temp + " is Palindrome Number");
        }else {
            System.out.println(temp + " is not Palindrome Number");
        }
    }
}
