import java.util.Scanner;

public class WeatherCheckLeapOrNot {
    public static void main(String[] args) {

        WeatherCheckLeapOrNot obj = new WeatherCheckLeapOrNot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Year" );
        int Year = sc.nextInt();
        if (obj.checkRange(Year) == 1) {
            System.out.println("Given Year is in Range" );
            if (obj.isLeap(Year) == 1) {
                System.out.println("Given Year is Leap" );
                System.out.println("Please enter no of Month to get days of Month" );
                int month = sc.nextInt();
                if (month < 1 && month > 12) {
                    System.out.println("Given month is invalid" );
                } else {
                    int day = obj.getDaysInMonth(month, Year);

                    System.out.println("days in month is= " + day);
                }
            } else {
                System.out.println("Given Year is Not Leap" );
            }
        } else {
            System.out.println("Entered Year is Not in the range" );
        }
    }

    int checkRange(int year) {
        if (year < 1 && year < 9999)
            return -1;
        else return 1;
    }

    int isLeap(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return 1;
        } else return 0;
    }

    int getDaysInMonth(int month, int year) {
        if (month < 1 && month > 12) {
            return -1;
        } else {
            if (month == 1) {
                return 31;
            } else if (month == 2) {
                return 29;
            } else {
                return -1;
            }
        }
    }
}
