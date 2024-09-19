import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String[] birthMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int userBirthMonth;

        System.out.println("What month is your birth month? Please input a valid number.");

       if (scan.hasNextInt()) {
           userBirthMonth = scan.nextInt();
           if (0 < userBirthMonth && userBirthMonth <= 12) {
               System.out.print ("Your birth month is " + userBirthMonth + " which is the month " + birthMonths[userBirthMonth-1] + ".");
           }
           else {
               System.out.println("You have not inputted a valid birth month.");
               System.exit(0);
           }
        }
        else {
            System.out.println("You have not inputted a valid birth month");
            System.exit(0);
        }


    }
}