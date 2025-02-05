package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Step:1 Create an instance of the calculator
        Calculator calculator = new Calculator();

        int sum = calculator.add(5, 3);
        int subtract = calculator.subtract(5, 3);
        int multiply = calculator.multiply(5, 3);

        System.out.println("5+3 = " + sum);
    }
}