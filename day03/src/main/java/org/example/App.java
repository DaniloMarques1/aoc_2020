package org.example;

import java.io.File;
import java.util.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        File file = new File("input.txt");
        InputReader inputReader = new InputReader(file);
        List<InputLine> input = inputReader.readInput();
        List<Slope> slopes = Arrays.asList(new Slope(1, 1), new Slope(3, 1), new Slope(5, 1), new Slope(7, 1), new Slope(1, 2));
        long result = 1;
        for (Slope slope: slopes) {
            LineIterator iterator = new LineIterator(input, slope);
            int trees = countTrees(iterator);
            result *= trees;
        }

        System.out.println(result);
    }

    public static int countTrees(LineIterator lineIterator) {
        int count = 0;
        while (lineIterator.hasNextLine()) {
            if (lineIterator.move()) count++;
        }

        return count;
    }
}
