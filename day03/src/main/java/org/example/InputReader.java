package org.example;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

import java.util.List;
import java.util.ArrayList;

public class InputReader {
    private final File file;

    public InputReader(File file) {
        this.file = file;
    }

    public List<InputLine> readInput() {
        List<InputLine> input = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                InputLine inputLine = new InputLine(line);
                input.add(inputLine);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return input;
    }
}
