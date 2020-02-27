import java.util.Scanner;

public class AlphabetOrNumOrSymbol {
    public static void main(String[] args) {//main method
        chara();//calling static method
    }

    public static void chara() {//static method

        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("input any value here number or an alphabet or symbol");//printing statement
        char ch = sca.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {//formula to find character
            System.out.println(ch + " is a Alphabet");//printing statement

        } else if (ch >= '0' && ch <= '9') {//formula to find numbers
            System.out.println(ch + " is a number");//printing statement

        } else {//if condition doesn't meet
            System.out.println(ch + "  is a symbol");//printing statement
        }


    }
}
