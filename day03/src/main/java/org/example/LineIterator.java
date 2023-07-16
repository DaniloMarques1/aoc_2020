package org.example;

import java.util.List;

public class LineIterator {
    private final List<InputLine> input;

    private final Slope slope;
    private int currentLinePosition;
    private int currentLine;

    public LineIterator(List<InputLine> input, Slope slope) {
        this.input = input;
        this.currentLinePosition = 0;
        this.currentLine = 0;
        this.slope = slope;
    }

    public boolean hasNextLine() {
        return this.currentLine < this.input.size() - 1;
    }

    // returns true if the move encounter a tree
    public boolean move() {
        InputLine line = this.input.get(this.currentLine);
        int rightMove = this.currentLinePosition + slope.getRight();
        if (rightMove >= line.length()) {
            rightMove = rightMove - line.length();
        }
        this.currentLine += slope.getDown();
        this.currentLinePosition = rightMove;

        InputLine nextLine = this.input.get(this.currentLine);
        return nextLine.isTree(this.currentLinePosition);
    }
}
