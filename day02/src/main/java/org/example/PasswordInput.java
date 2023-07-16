package org.example;

public class PasswordInput {
    private final int firstPosition;
    private final int secondPosition;
    private final String c;
    private final String password;

    public PasswordInput(int firstPosition, int secondPosition, String c, String password) {
        this.firstPosition = firstPosition;
        this.secondPosition = secondPosition;
        this.c = c;
        this.password = password;
    }

    public int getFirstPosition() {
        return firstPosition;
    }

    public int getSecondPosition() {
        return secondPosition;
    }

    public String getC() {
        return c;
    }

    public String getPassword() {
        return password;
    }
}
