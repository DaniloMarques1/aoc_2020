package org.example;

import java.io.File;
import java.util.List;

public class App {
    public static void main(String[] args) {
        File file = new File("input.txt");
        InputReader inputReader = new InputReader(file);
        List<InputLine> input = inputReader.readInput();
        LineIterator iterator = new LineIterator(input);

        int count = 0;
        while (iterator.hasNextLine()) {
            if (iterator.move()) count++;
        }
        System.out.println(count);
    }
}
