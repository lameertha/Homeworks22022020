import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        mySalary();
    }

    public static void mySalary() { // static instance method

        Scanner scan = new Scanner(System.in); // Scanner class
        System.out.println("Employee ID : ");//printing statement
        int ID = scan.nextInt();

        System.out.println("Employee Name : ");//printing statement
        String name = scan.next();

        System.out.println("Enter the Basic Salary : ");//printing statement
        double Sal = scan.nextInt();

        double Hra = 10 * Sal / 100;     // defined HRA = 10% of Basic Salary / double for decimal
        double Ta = 8 * Sal / 100;      // defined TA = 8% of Basic Salary as double
        double Da = 9 * Sal / 100;      // defined DA = 9% of Basic Salary as double
        double Pf = 20 * Sal / 100;     // defined PF = 20% of Basic Salary as double

        double result = Sal + Hra + Ta + Da - Pf; // Gross Salary defined as result as double for use of decimal places.

        // Printing the Salary Slip as a format
        System.out.println(" _____________________________");   //  print in string
        System.out.println("|       SALARY SLIP           |");
        System.out.println("|_____________________________|");
        System.out.println("|Employee Id     : " + ID + "       |"); //input ID will reflect here.
        System.out.println("|Employee Name   : " + name + "        |");//input name will reflect here.
        System.out.println("|_____________________________|");
        System.out.println("|Basic Salary    : " + Sal + "    |");  // input Salary will reflect here
        System.out.println("|HRA 10%         :  " + Hra + "    |"); // calculated HRA will reflect
        System.out.println("|TA 8%           :  " + Ta + "    |");  // Calculated TA will reflect
        System.out.println("|DA 9%           :  " + Da + "    |");  // Calculated DA will reflected
        System.out.println("|PF(-)20%        :  " + Pf + "    |");  // Calculated PF will reflect here.
        System.out.println("|_____________________________|");
        System.out.println("|Gross Salary    : " + result + "   |"); // Gross calculated salary will reflect here.
        System.out.println("|=============================|");


    }
}
