package two;

import java.util.Scanner;

public class CalculateCoffeeBill {

    public static void main(String[] args) {

        int countOfCoffeeCups;

        System.out.print("Enter Want Coffee Cups : ");
        countOfCoffeeCups = new Scanner(System.in).nextInt();

        if(1 <= countOfCoffeeCups && countOfCoffeeCups <= 4){
            System.out.println("Total Price Rs."+countOfCoffeeCups*150);
            System.out.println("Price per Coffee Cup : Rs.150.00");
        } else if (5 <= countOfCoffeeCups && countOfCoffeeCups <= 9) {
            System.out.println("Total Price Rs."+countOfCoffeeCups*140);
            System.out.println("Price per Coffee Cup : Rs.140.00");
        }else if (10 <= countOfCoffeeCups && countOfCoffeeCups <= 19) {
            System.out.println("Total Price Rs."+countOfCoffeeCups*130);
            System.out.println("Price per Coffee Cup : Rs.130.00");
        }else if (20 <= countOfCoffeeCups && countOfCoffeeCups <= 49) {
            System.out.println("Total Price Rs."+countOfCoffeeCups*120);
            System.out.println("Price per Coffee Cup : Rs.120.00");
        }else if (50 <= countOfCoffeeCups) {
            System.out.println("Total Price Rs."+countOfCoffeeCups*110);
            System.out.println("Price per Coffee Cup : Rs.110.00");
        }
    }
}
