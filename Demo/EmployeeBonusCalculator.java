import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {

        String[] employeeNames = {
                "Nimal",
                "Kamal",
                "Sunimal",
                "Kithsiri",
                "Sumedha"
        };

        double[] employeeSalaries = {
                27000.00,
                23600.00,
                35000.00,
                18500.00,
                43050.00
        };

        double[] bonus = new double[5];

        String performance;
        for (int i = 0; i < employeeSalaries.length; i++) {

            System.out.print("Enter Employee "+(i+1)+" Performance : ");
            performance = new Scanner(System.in).nextLine();
            bonus[i] =calculateBonus(performance,employeeSalaries[i]);

        }

        for (int i = 0; i < bonus.length; i++) {
            System.out.println("Employee Name : "+employeeNames[i]);
            System.out.println("Employee Salary : "+employeeSalaries[i]);
            System.out.println("Employee Bonus : "+bonus[i]);
            System.out.println("Employee Salary add Bonus : "+(bonus[i]+employeeSalaries[i]));
        }


    }

    public static double calculateBonus(String p,double salary){

        double b = 0;
        if(p.equalsIgnoreCase("excellent")){
            b = (salary*20/100);
        } else if (p.equalsIgnoreCase("good")){
            b = (salary*10/100);
        }
        return b;

//        return p.equalsIgnoreCase("excellent") ? salary * 0.2 :
//                p.equalsIgnoreCase("good") ? salary * 0.1: 0;
    }
}
