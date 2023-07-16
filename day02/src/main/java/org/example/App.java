package org.example;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader("input.txt");
        List<PasswordInput> inputs = inputReader.readInput();
        int numberOfValidPassword = 0;
        for (PasswordInput passwordInput: inputs) {
            PasswordValidation validation = new PasswordValidation(passwordInput);
            if (validation.validate()) numberOfValidPassword++;
        }
        System.out.println(numberOfValidPassword);
    }
}
