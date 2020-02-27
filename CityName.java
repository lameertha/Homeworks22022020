import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {

        chara();//calling static method
    }

    public static void chara() {//static method

        Scanner sca = new Scanner(System.in);//scanner class
        System.out.println("Enter The City Name:" );//printing statement
        char ch = sca.next().charAt(0);

        if ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F')) {//formula to find character
            System.out.println(ch + " is a VALID City" );
        }

            else{

                System.out.println(ch + "is  a INVALID City" );


            }
        }
    }
