package codegym.regex.source;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailLiteral {

    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[a-zA-Z_0-9]+[a-zA-Z_0-9]*@[a-zA-Z]+(\\.[a-zA-Z]+)$";

    public EmailLiteral() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validateEmail(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

