package com.danilo.aoc.day04;

import java.io.File;
import java.util.List;

public class App  {
    public static void main( String[] args ) {
        File file = new File("input.txt");
        InputReader inputReader = new InputReader(file);
        List<Passport> input = inputReader.read();
        System.out.println(input.size());
        int count = 0;
        for (Passport passport: input) {
            if (passport.isValid()) count++;
        }
        System.out.println(count);
    }
}
