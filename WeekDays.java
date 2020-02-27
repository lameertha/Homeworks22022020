import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {//main method
        WeekDays obj = new WeekDays();//object creation
        obj.weekdays();
    }

    public void weekdays(){//instance method

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Please Enter Number of the Day : ");//printing statement
        int day = scan.nextInt();

        switch (day){
            case 1:
                System.out.println(" it's Monday");
                break;
            case 2:
                System.out.println("it's Tuesday");
                break;
            case 3:
                System.out.println("it's Wednesday");
                break;
            case 4:
                System.out.println("it's Thursday");
                break;
            case 5:
                System.out.println("it's Friday");
                break;
            case 6:
                System.out.println("it's Saturday");
                break;
            case 7:
                System.out.println("it's Sunday");
                break;
            default:
                System.out.println("Week Contains only 1 to 7 Days");


        }

    }

}
