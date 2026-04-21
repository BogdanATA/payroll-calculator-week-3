package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PayrollCalculator {

    private static Employee[] person = new Employee[20];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileReader fileReader = new FileReader("employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
