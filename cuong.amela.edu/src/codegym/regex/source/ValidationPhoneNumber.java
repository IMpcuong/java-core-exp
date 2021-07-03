package codegym.regex.source;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationPhoneNumber {
    private static Pattern pattern;
    private static Matcher matcher;

    private static boolean isValidPhoneNumber(String phoneNumber) {
        pattern = Pattern.compile("^\\(\\d{2}\\)-\\((0\\d{9})\\)$");
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNumber = { "(84)-(0978489648)", "(a8)-(22222222)", "(88)-(0888888888)" };
        for (String number : phoneNumber) {
            boolean isValidPhoneNumber = isValidPhoneNumber(number);
            System.out.println("Phone number " + number + " is valid: " + isValidPhoneNumber);
        }
    }
}
