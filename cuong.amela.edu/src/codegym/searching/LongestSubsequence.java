package codegym.searching;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestSubsequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your string: ");
        String string = input.nextLine();

        LinkedList<Character> maxChars = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if ((int) string.charAt(j) > (int) list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > maxChars.size()) {
                maxChars.clear();
                maxChars.addAll(list);
            }
            list.clear();
        }
        for (Character c : maxChars) {
            System.out.println(c);
        }
        System.out.println();
    }
}
