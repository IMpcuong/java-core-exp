package codegym.regex.source;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AccountLiteral {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountLiteral() {
    }

    public boolean validateID(String accountId) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(accountId);
        return matcher.matches();
    }
}
