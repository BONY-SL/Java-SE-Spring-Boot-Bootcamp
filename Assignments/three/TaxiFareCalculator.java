package three;

import java.util.Scanner;

public class TaxiFareCalculator {

    public static void main(String[] args) {


        System.out.print("distance traveled in kilometers : ");
        double x = new Scanner(System.in).nextDouble();

        System.out.print("time spent in traffic in minutes :" );
        double y = new Scanner(System.in).nextDouble();

        TaxiFareCalculator taxiFareCalculator = new TaxiFareCalculator();
        double totalFare = taxiFareCalculator.calculateFare(x,y);

        System.out.println("Total fare : Rs."+totalFare);

    }


    public double calculateFare(double distance,double minutes){
        return ((distance*60)+(minutes*3));
    }


}
