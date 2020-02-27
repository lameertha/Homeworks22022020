import java.util.Scanner;

public class AddSubMulDiv {
    public static void main(String[] args) {

        float a;
        float b;
        char c;
        float addition;
        float subtraction;
        float multiplication;
        float division;


        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Enter any first digits");//printing statement
        a = scan.nextInt();

        System.out.println("Enter any second digits");//printing statement
        b = scan.nextInt();

        System.out.println("Enter any symbol from addition, subtraction, multiplication and division");//printing statement
        c = scan.next().charAt(0);

        addition = a + b;
        subtraction = a - b;
        multiplication = a * b;
        division = a / b;

        if (c == '+') {// addition symbol
            System.out.println("Addition of first and second digits is: " + addition);//printing statement

        } else if (c == '-') {//addition symbol
            System.out.println("Subtraction of first and second digits is: " + subtraction);
        } else if (c == '*') {//addition symbol
            System.out.println("Multiplication of first and second digits is: " + multiplication);//printing statement
        } else if (c == '/') {//addition symbol
            System.out.println("Division of first and second digits is: " + division);//printing statement
        }


    }

}
