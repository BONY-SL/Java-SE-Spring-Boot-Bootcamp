package two;

import java.util.Scanner;

public class PowerOfGivenNumbers {
    public static void main(String[] args) {
        long base,exponent;


        System.out.print("Enter Base Value : ");
        base = new Scanner(System.in).nextLong();

        System.out.print("Enter Exponent Value : ");
        exponent = new Scanner(System.in).nextLong();

        long power = 1;

        for (int i = 1; i <= exponent ; i++) {

            power = power * base;

        }
    }
}
