package codegym.regex.test;

import codegym.regex.source.AccountLiteral;

public class AccountLiteralTest {
    private static AccountLiteral accountLiteral;
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde", "asf;", "*!%^#&" };

    public static void main(String[] args) {
        accountLiteral = new AccountLiteral();
        for (String account : validAccount) {
            boolean isValid = accountLiteral.validateID(account);
            System.out.println("Account is " + account +" is valid: " + isValid);
        }

        for (String account : invalidAccount) {
            boolean isValid = accountLiteral.validateID(account);
            System.out.println("Account is " + account +" is valid: " + isValid);
        }
    }
}
