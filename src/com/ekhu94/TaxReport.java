package com.ekhu94;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(double taxableIncome) {
        this.calculator = new TaxCalculator(taxableIncome);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
