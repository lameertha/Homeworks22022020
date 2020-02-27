import java.util.Scanner;

public class Cities9 {
    public static void main(String[] args) {//main method
        alpha1();//calling static method to static area

    }

    static void alpha1() {//static method
        //String alpha;
        Scanner scanner = new Scanner(System.in);//scanner class
        System.out.println("Enter any alphabets start with A and F:");//printing statement
        String alpha = scanner.next();

        alpha = alpha.toUpperCase();//uppercase method
        alpha = alpha.toLowerCase();//lowercase method


        switch (alpha) {//sorting a and f alphabet
            case "a":
                System.out.println("City name is Aachen");
                break;

            case "b":
                System.out.println("City name is Bangalore");
                break;

            case "c":
                System.out.println("City name is Colombo");
                break;

            case "d":
                System.out.println("City name is Delhi");
                break;

            case "e":
                System.out.println("City name is Edinburgh");
                break;

            case "f":
                System.out.println("City name is Florence");
                break;

            default:
                System.out.println("Alphabet is not valid");


        }


    }
}
