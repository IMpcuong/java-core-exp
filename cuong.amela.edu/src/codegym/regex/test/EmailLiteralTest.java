package codegym.regex.test;

import codegym.regex.source.EmailLiteral;

public class EmailLiteralTest {
    private static EmailLiteral literal;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        literal = new EmailLiteral();
        for (String email : validEmail) {
            boolean isValid = literal.validateEmail(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }

        for (String email : invalidEmail) {
            boolean isValid = literal.validateEmail(email);
            System.out.println("Email " + email + " is valid: " + isValid);
        }
    }
}
