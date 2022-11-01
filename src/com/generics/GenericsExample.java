package com.generics;

public class GenericsExample {
    public static void main(String[] args) {

       Printer<Integer> integerPrinter = new Printer<>(23);
        integerPrinter.print();
        Printer<Double> doublePrinter = new Printer<>(22.5);
        doublePrinter.print();
    }
}
