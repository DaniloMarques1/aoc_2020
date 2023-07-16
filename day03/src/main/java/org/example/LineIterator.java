package org.example;

import java.util.List;

public class LineIterator {
    private final List<InputLine> input;

    private final int RIGHT = 3;
    private final int DOWN = 1;
    private int currentLinePosition;
    private int currentLine;

    public LineIterator(List<InputLine> input) {
        this.input = input;
        this.currentLinePosition = 0;
        this.currentLine = 0;
    }

    public boolean hasNextLine() {
        return this.currentLine < this.input.size() - 1;
    }

    // returns true if the move encounter a tree
    public boolean move() {
        InputLine line = this.input.get(this.currentLine);
        int rightMove = this.currentLinePosition + RIGHT;
        if (rightMove >= line.length()) {
            rightMove = rightMove - line.length();
        }
        this.currentLine += 1;
        this.currentLinePosition = rightMove;

        InputLine nextLine = this.input.get(this.currentLine);
        return nextLine.isTree(this.currentLinePosition);
    }
}
