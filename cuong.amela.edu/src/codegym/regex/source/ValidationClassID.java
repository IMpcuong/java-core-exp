package codegym.regex.source;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationClassID {
    private static Pattern pattern;
    private static Matcher matcher;

    private static boolean isValidateClassID(String classID) {
        pattern = Pattern.compile("^[CAP]\\d{4}[GHIKLM]$");
        matcher = pattern.matcher(classID);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] classID = { "C0318G", "M0318G", "P0323A" };
        for(String id : classID) {
            boolean isValid = isValidateClassID(id);
            System.out.println("Class ID " + id + " is valid: " + isValid);
        }
    }
}
