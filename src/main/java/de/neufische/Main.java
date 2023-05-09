package de.neufische;

import Repository.Functions;
import Service.CalculatorService;

public class Main {
    public static void main(String[] args) {


        CalculatorService calculatorService = new CalculatorService();

        System.out.println(calculatorService.multiply(12, 1));


    }
}