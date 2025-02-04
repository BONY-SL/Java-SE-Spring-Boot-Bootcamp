package two;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        long sum = 0;
        int userValue;
        int count = 1;

        System.out.print("Enter User Value : ");
        userValue = new Scanner(System.in).nextInt();

        do{
            if(count % 2 == 0)
                sum = sum+count;
            count++;
        }while (count <= userValue);


        System.out.println("Sum of Even Numbers Between "+1+" and "+userValue+" : "+sum);
    }
}
