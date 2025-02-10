package three.slaes;
import java.util.Scanner;

public class WeekSalesDemo {
    public static void main(String[] args) {


        WeekSalesAn[][] weekSalesAns = new WeekSalesAn[4][7];

        for (int i = 0; i < weekSalesAns.length; i++) {
            for (int j = 0; j < 7; j++) {

                System.out.println("Enter Week "+(i+1)+" Day "+(j+1)+" Sale Details");

                WeekSalesAn weekSale = new WeekSalesAn();

                System.out.print("Enter Sale Name : ");
                weekSale.setSaleName(new Scanner(System.in).nextLine());

                System.out.print("Enter Sales Rs : ");
                weekSale.setAmout(new Scanner(System.in).nextDouble());
                weekSale.setWeekNumber((i+1));

                weekSalesAns[i][j] =weekSale;

            }
        }

        WeekSalesAn weekSale = new WeekSalesAn();

        double totalAverageSales = weekSale.averageSale(weekSalesAns);

        System.out.println("Total Average Sale : "+totalAverageSales);

        weekSale.highestSaleForWeek(weekSalesAns);
        weekSale.lowestSaleForWeek(weekSalesAns);
    }
}
