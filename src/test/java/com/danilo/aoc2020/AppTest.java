package com.danilo.aoc2020;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @DisplayName("Deve retornar os indices 0 e 3")
    @Test
    public void testExpenseReportCalculate1() {
        List<Integer> input = Arrays.asList(1721, 979, 366, 299, 675, 1456);
        ExpenseReportCalculate exr = new ExpenseReportCalculate(input);
        List<Integer> result = exr.searchTwoIndices();
        assertEquals(result.get(0), 0);
        assertEquals(result.get(1), 3);
    }

    @DisplayName("Deve retornar os indices 1, 2 e 4")
    @Test
    public void testExpenseReportCalculate2() {
        List<Integer> input = Arrays.asList(1721, 979, 366, 299, 675, 1456);
        ExpenseReportCalculate exr = new ExpenseReportCalculate(input);
        List<Integer> result = exr.searchThreeIndices();
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(4, result.get(2));
    }

    @DisplayName("Deve retornar 889779")
    @Test
    public void testCalculate1() {
        List<Integer> input = Arrays.asList(1721, 979, 366, 299, 675, 1456);
        List<Integer> indices = new ArrayList<>(Arrays.asList(0, 3));
        ExpenseReportCalculate expenseReportCalculate = new ExpenseReportCalculate(input);
        assertEquals(514579, expenseReportCalculate.calculate(indices));
    }
}
