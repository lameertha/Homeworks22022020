import java.util.Scanner;

public class Excercise20 {


    public static void main(String[] args) {//main method
        array();//calling static method
    }


    public static void array() {//static method

        //local variables
        int a;
        int b;
        int c;

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Please Enter the no. of Elements you want in array :" );//printing statement
        a = scan.nextInt();

        int[] a1 = new int[a];//int array

        System.out.println("Enter all the Elements" );//printing statement

        for (c = 0; c < a; c++) {// for loop
            a1[c] = scan.nextInt();
        }

        System.out.println("Enter the Elements you want to find : " );//printing statement
        b = scan.nextInt();

        for (c = 0; c < a; c++) {//for loop
            if (a1[c] == b) {
                System.out.println("Elements found at position :" + (c + 1));//printing statement

            } else {
                System.out.println("element is not available" );//printing statement

            }

        }
    }
}
