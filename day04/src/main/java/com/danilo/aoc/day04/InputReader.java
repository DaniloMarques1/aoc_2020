package com.danilo.aoc.day04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class InputReader {
    private final File file;

    public InputReader(File file) {
        this.file = file;
    }

    public List<Passport> read() {
        List<Passport> input = new ArrayList<>();
        PassportBuilder builder = new PassportBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("")) {
                    input.add(builder.build());
                    builder = new PassportBuilder();
                } else {
                    parseLine(builder, line);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        input.add(builder.build());
        return input;
    }

    private void parseLine(PassportBuilder builder, String line) {
        String[] spaceSplit = line.split(" ");
        for (String split: spaceSplit) {
            List<String> colonSplit = Arrays.asList(split.split(":"));
            this.setPassportAttribute(colonSplit, builder);
        }
    }

    private void setPassportAttribute(List<String> keyAndValue, PassportBuilder builder) {
        String key = keyAndValue.get(0);
        String value = keyAndValue.get(1);
        switch (key) {
            case "byr":
                builder.birthYear(value);
                break;
            case "iyr":
                builder.issueYear(value);
                break;
            case "eyr":
                builder.expirationYear(value);
                break;
            case "hgt":
                builder.height(value);
                break;
            case "hcl":
                builder.hairColor(value);
                break;
            case "ecl":
                builder.eyeColor(value);
                break;
            case "pid":
                builder.passportId(value);
                break;
            case "cid":
                builder.countryId(value);
                break;
            default:
                break;
        }
    }

}
