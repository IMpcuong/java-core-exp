package codegym;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = scan.nextInt();

        for (int i = 1; i < (int) Math.sqrt(number); i++) {
            if (number % i == 0 && i != 1) System.out.println("Not a prime number!");
        }
        System.out.println();
        System.out.printf("%d is a prime number", number);
    }
}
