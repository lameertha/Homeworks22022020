import java.util.Scanner;

public class GridLine {
    public static void main(String[] args) {//main method
        GridLine ex = new GridLine();//object creation
        ex.grid();//calling instance method
    }
    public void grid(){//instance method

        int i = 0;//local variable
        String b;// local variable

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Please enter any character to print the grid line :");//printing statement
        b = scan.nextLine();

        do{
            System.out.println(b+b+b+b+b+b+b+b+b+b);
            i++;
        }while (i<10);
    }
}
