package codegym;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean checkPrime(int number) {
        for (int i = 2; i <= (int) number/2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            if (checkPrime(num)) System.out.printf("%d is prime number\n", num);
        }
    }
}
