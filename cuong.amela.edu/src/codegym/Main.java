package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Which month you wanna choice: ");
         int month = scan.nextInt();

         String daysInMonth;

         switch (month) {
             case 2:
                 System.out.println("Days in month is 28 or 29");
                 daysInMonth = "28 or 29";
                 break;
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 System.out.println("Days in month is 31");
                 daysInMonth = "31";
                 break;
             case 4:
             case 6:
             case 9:
             case 11:
                 System.out.println("Days in month is 30");
                 daysInMonth = "30";
                 break;
             default:
                 daysInMonth = "";
         }

         if (!daysInMonth.equals("")) System.out.printf("The month %d has %s days", month, daysInMonth);
         else System.out.println("Invalid syntax!");
    }
}
