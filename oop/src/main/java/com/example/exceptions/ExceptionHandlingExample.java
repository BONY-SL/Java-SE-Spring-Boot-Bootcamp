package com.example.exceptions;

import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {


        System.out.println("Start.....");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Number 2 : ");
        int num2 = scanner.nextInt();

        try {
            int result = num1/num2;
            System.out.println("Result : "+result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("End.....");

    }
}
