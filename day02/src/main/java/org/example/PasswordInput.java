package org.example;

public class PasswordInput {
    private final int min;
    private final int max;
    private final String c;
    private final String password;

    public PasswordInput(int min, int max, String c, String password) {
        this.min = min;
        this.max = max;
        this.c = c;
        this.password = password;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public String getC() {
        return c;
    }

    public String getPassword() {
        return password;
    }
}
