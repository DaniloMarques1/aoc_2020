package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {
    private final String fileName;

    public InputReader(String fileName) {
        this.fileName = fileName;
    }

    public List<PasswordInput> readInput() {
        List<PasswordInput> inputs = new ArrayList<>();

        try {
            File file = new File(this.fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                PasswordInput passwordInput = this.parseLine(line);
                inputs.add(passwordInput);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return inputs;
    }

    public PasswordInput parseLine(String line) {
        line = line.replace("-", " ");
        line = line.replace(":", "");
        String[] parsed = line.split(" ");
        int firstPosition = Integer.parseInt(parsed[0]);
        int secondPosition = Integer.parseInt(parsed[1]);
        String c = parsed[2];
        String password = parsed[3];

        return new PasswordInput(firstPosition, secondPosition, c, password);
    }

}
