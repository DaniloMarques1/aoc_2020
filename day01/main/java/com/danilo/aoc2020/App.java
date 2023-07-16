package com.danilo.aoc2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args )
    {
        List<Integer> input = readInput();

        ExpenseReportCalculate expenseReportCalculate = new ExpenseReportCalculate(input);
        List<Integer> firstAnswer = expenseReportCalculate.searchTwoIndices();
        Integer result = expenseReportCalculate.calculate(firstAnswer);
        System.out.println(result);

        List<Integer> secondAnswer = expenseReportCalculate.searchThreeIndices();
        result = expenseReportCalculate.calculate(secondAnswer);
        System.out.println(result);
    }

    public static List<Integer> readInput() {
        List<Integer> input = new ArrayList<>();
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                input.add(Integer.parseInt(line));
            }

            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return input;
    }
}
