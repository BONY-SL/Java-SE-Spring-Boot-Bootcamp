package two;

import java.util.Scanner;

public class CountNumbersGraterThanHundrad {

    public static void main(String[] args) {

        int number;
        int isNumberGraterThan100 = 0;
        int count = 1;

        do{
            System.out.print("Enter Your Number "+count+" : ");
            number = new Scanner(System.in).nextInt();

            if(number > 100){
                isNumberGraterThan100 = isNumberGraterThan100 + 1;
            }
            count++;
        }while (count <= 5);

        System.out.println("Have "+isNumberGraterThan100+" Integers Grater Than 100");
    }
}
