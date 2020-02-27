public class DividedByThreeOrFive {
    public static void main(String[] args) {//main method



        System.out.println("\nDivided By 3: ");//printing statement
        for (int i = 1; i<100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");//printing statement
        }

        System.out.println("\nDivided By 5: ");//printing statement
        for (int i = 1; i<100; i++){
            if(i%5 ==0)
                System.out.print(i + ",");//printing statement
        }
    }
}
