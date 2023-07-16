package org.example;

public class PasswordValidation {
    private final PasswordInput passwordInput;

    public PasswordValidation(PasswordInput passwordInput) {
        this.passwordInput = passwordInput;
    }

    public boolean validate() {
        int count = this.count(this.passwordInput.getPassword(), this.passwordInput.getC().charAt(0));
        return count >= this.passwordInput.getMin() && count <= this.passwordInput.getMax();
    }

    private int count(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) count++;
        }

        return count;
    }
}
