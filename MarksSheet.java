import java.util.Scanner;

public class MarksSheet {
    public static void main(String[] args) {//main method
        student();//calling static method
    }

    public static void student() {//static method
        // declare variables in side static method
        String studentName;
        int rollNo;
        int maths;
        int science;
        int english;
        double total;
        double percentage;
        String grade = "";
        String result;

        Scanner scan = new Scanner(System.in);//scan class
        System.out.println("Enter any student name here:");//printing statement
        studentName = scan.nextLine();

        System.out.println("Enter students role number here:");//printing statement
        rollNo = scan.nextInt();

        System.out.println("Enter marks for maths subject:");//printing statement
        maths = scan.nextInt();
        if (maths < 0 || maths > 100) {//comparing marks
            System.out.println("“Invalid data, Marks\n" +
                    "between 0 to 100”");//printing statement
        }

        System.out.println("Enter marks for Science marks:");//printing statement
        science = scan.nextInt();
        if (science < 0 || science > 100) {//comparing marks
            System.out.println("“Invalid data, Marks\n" +
                    "between 0 to 100”");//printing statement
        }
        System.out.println("Enter marks for English subject :");//printing statement
        english = scan.nextInt();
        if (english < 0 || english > 100) {//comparing marks
            System.out.println("“Invalid data, Marks\n" +
                    "between 0 to 100”");//printing statement
        }
        total = (maths + science + english);//declared 3 subject here

        percentage = (total / 300) * 100;//formula to calculate 3 subject
        if (percentage >= 80) {//comparing marks
            grade = "A+";
        } else if (percentage >= 60 && percentage < 80) {//comparing marks
            grade = "A";

        } else if (percentage >= 50 && percentage < 60) {//comparing marks
            grade = "B";

        } else if (percentage >= 35 && percentage < 50) {//comparing marks
            grade = "C";
        }
        if (percentage >= 35) {//comparing marks
            result = "Pass";
            System.out.println("Grade is :" + grade);
        } else {
            result = "Fail";
        }
        System.out.println("Your result is:" + result);//printing statement

        // all printing statements below to print sheet
        System.out.println("____________________________________");
        System.out.println("|                                  |");
        System.out.println("|           Mark Sheet             |");
        System.out.println("|__________________________________|");
        System.out.println("|    Name    :     " + studentName + "          |");
        System.out.println("|    Roll No.:     " + rollNo + "               |");
        System.out.println("|__________________________________|");
        System.out.println("|    Subject :      Marks          |");
        System.out.println("|__________________________________|");
        System.out.println("|    Maths      :     " + maths + "           |");
        System.out.println("|    Science    :     " + science + "           |");
        System.out.println("|    English    :     " + english + "           |");
        System.out.println("|__________________________________|");
        System.out.println("|    Total      :     " + total + "        |");
        System.out.println("|__________________________________|");
        System.out.println("|    Percentage :     " + percentage + "         |");
        System.out.println("|    Result     :     " + result + "         |");
        System.out.println("|    Grade      :      " + grade + "           |");
        System.out.println("|__________________________________|");


    }

}
