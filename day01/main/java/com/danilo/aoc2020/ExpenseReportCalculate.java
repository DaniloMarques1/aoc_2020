package com.danilo.aoc2020;

import java.util.ArrayList;
import java.util.List;

public class ExpenseReportCalculate {
    List<Integer> input;

    public ExpenseReportCalculate(List<Integer> input) {
        this.input = input;
    }

    public Integer calculate(List<Integer> indices) {
        int result = 1;
        for (Integer index: indices) {
            Integer value = this.input.get(index);
            result = result * value;
        }

        return result;
    }

    // search for two indices where the result is 2020
    public List<Integer> searchTwoIndices() {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < this.input.size(); i++) {
            int n1 = this.input.get(i);
            for (int j = i; j < this.input.size(); j++) {
                int n2 = this.input.get(j);
                int sum = n1 + n2;
                if (sum == 2020) {
                    indices.add(i);
                    indices.add(j);
                    return indices;
                }
            }
        }

        return indices;
    }

    public List<Integer> searchThreeIndices() {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < this.input.size(); i++) {
            int n1 = this.input.get(i);
            for (int j = i; j < this.input.size(); j++) {
                int n2 = this.input.get(j);
                for (int x = j; x < this.input.size(); x++) {
                    int n3 = this.input.get(x);
                    int sum = n1 + n2 + n3;
                    if (sum == 2020) {
                        indices.add(i);
                        indices.add(j);
                        indices.add(x);
                        return indices;
                    }
                }
            }
        }

        return indices;
    }
}
