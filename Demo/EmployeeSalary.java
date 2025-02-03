import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {

        String[] employeeDetails = new String[3];
        double[] employeeSalary = new double[3];

        String[] taxedEmployee = new String[3];

        int count  = 0;

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Employee Name "+(i+1)+" : ");
            employeeDetails[i] = new Scanner(System.in).nextLine();

            System.out.print("Enter Employee Salary "+(i+1)+" : ");
            employeeSalary[i] = new Scanner(System.in).nextDouble();

            if(employeeSalary[i] > 175000){
                ++count;
                taxedEmployee[i] = employeeDetails[i];
            }
        }

        System.out.println("Employee Under The Tax : "+count);

        System.out.println("**Taxed Employee List**");

        for (int i = 0; i < 3; i++) {
            if(taxedEmployee[i] != null){
                System.out.println(taxedEmployee[i]);
            }
        }

    }
}
