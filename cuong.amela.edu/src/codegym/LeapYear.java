package codegym;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input year you want: ");
        int yearInput = scan.nextInt();

        if (yearInput % 4 == 0)  {
            if (yearInput % 100 == 0) {
                if (yearInput % 400 == 0) {
                    System.out.printf("%d is a leap year", yearInput);
                } else {
                    System.out.printf("%d is not a leap year", yearInput);
                }
            } else {
                System.out.printf("%d is a leap year", yearInput);
            }
        } else {
            System.out.printf("%d is not a leap year", yearInput);
        }
    }
}
