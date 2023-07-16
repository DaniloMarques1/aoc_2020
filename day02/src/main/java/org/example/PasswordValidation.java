package org.example;

public class PasswordValidation {
    private final PasswordInput passwordInput;

    public PasswordValidation(PasswordInput passwordInput) {
        this.passwordInput = passwordInput;
    }

    public boolean validate() {
        int firstPosition = this.passwordInput.getMin() - 1;
        int secondPosition = this.passwordInput.getMax() - 1;
        char firstChar = this.passwordInput.getPassword().charAt(firstPosition);
        char secondChar = this.passwordInput.getPassword().charAt(secondPosition);
        char charToCompare = this.passwordInput.getC().charAt(0);

        if (firstChar == charToCompare) {
            return secondChar != charToCompare;
        }

        return secondChar == charToCompare;
    }
}
