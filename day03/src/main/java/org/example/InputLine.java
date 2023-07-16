package org.example;

public class InputLine {
    private final String line;

    public InputLine(String line) {
        this.line = line;
    }

    public boolean isTree(int position) {
        return this.line.charAt(position) == '#';
    }

    public char getLineChar(int position) {
        return this.line.charAt(position);
    }

    public int length() {
        return this.line.length();
    }

    public String toString() {
        return this.line;
    }
}

