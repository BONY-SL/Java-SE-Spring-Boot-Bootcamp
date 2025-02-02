package two;

import java.util.Arrays;
import java.util.Scanner;

public class FindGCD {

    public static void main(String[] args) {

        int[] numberOneGCDArray;
        int[] numberTwoGCDArray;

        int finalGCD = 0;

        int arrayOneSize = 0;
        int arrayTwoSize = 0;

        int number1,number2;

        System.out.print("Enter Number One : ");
        number1 = new Scanner(System.in).nextInt();

        System.out.print("Enter Number Two : ");
        number2 = new Scanner(System.in).nextInt();

        // Set Array Sizes Dynamically
        int count = 1;
        while (count <= number1){

            if(number1%count == 0){
                arrayOneSize = arrayOneSize + 1;
            }
            count++;
        }
        count = 1;
        while (count <= number2){

            if(number2%count == 0){
                arrayTwoSize = arrayTwoSize + 1;
            }
            count++;
        }

        numberOneGCDArray = new int[arrayOneSize];
        numberTwoGCDArray = new int[arrayTwoSize];

        // save Common divisors for Each number
        count = 1;
        int index = 0;
        while (count <= number1){

            if(number1%count == 0){
                numberOneGCDArray[index++] = count;
            }
            count++;
        }

        count = 1;
        index = 0;
        while (count <= number2){

            if(number2%count == 0){
                numberTwoGCDArray[index++] = count;
            }
            count++;
        }

        System.out.println(Arrays.toString(numberOneGCDArray));
        System.out.println(Arrays.toString(numberTwoGCDArray));

        int i, j;
        if(arrayOneSize > arrayTwoSize){
            for (i = 0 ; i < arrayTwoSize ; i++){
                for (j = 0; j < arrayOneSize; j++) {

                    if(numberOneGCDArray[j] == numberTwoGCDArray[i]){
                        finalGCD = numberOneGCDArray[j];
                    }
                }
            }
        }else{
            for (i = 0 ; i < arrayOneSize ; i++){
                for (j = 0; j < arrayTwoSize; j++) {

                    if(numberOneGCDArray[i] == numberTwoGCDArray[j]){
                        finalGCD = numberTwoGCDArray[j];
                    }
                }
            }
        }

        System.out.println("GCD of "+number1+" and "+number2+" is : "+finalGCD);
    }
}

//import java.util.Scanner;
//
//public class FindGCD {
//
//    public static void main(String[] args) {
//
//        // Create a Scanner object for input
//        Scanner scanner = new Scanner(System.in);
//
//        // Input two numbers
//        System.out.print("Enter Number One: ");
//        int number1 = scanner.nextInt();
//
//        System.out.print("Enter Number Two: ");
//        int number2 = scanner.nextInt();
//
//        // Apply the Euclidean algorithm to find the GCD
//        int gcd = findGCD(number1, number2);
//
//        // Output the result
//        System.out.println("GCD of " + number1 + " and " + number2 + " is: " + gcd);
//
//        scanner.close();
//    }
//
//    // Euclidean algorithm for GCD
//    public static int findGCD(int a, int b) {
//
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
//}

