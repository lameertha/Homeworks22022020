import java.util.Scanner;

public class NumberElementArrays {
    public static void main(String[] args) {//main method
        arr();//calling static method

    }

    public static void arr() {//static method

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Enter the number of Elements you want in array:");//printing statement
        int n = scan.nextInt();


        int total = 0;//local variable
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {//for loop
            System.out.println("Enter here Elements" + "" + (i + 1) + "");//printing statement
            a[i] = scan.nextInt();

        }
        scan.close();
        for (int value : a) {
            total = total + value;
        }
        int avg = total / a.length;
        System.out.println("The average of array Elements is " + avg);//printing statement

    }

}
