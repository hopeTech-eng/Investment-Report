/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package investmentapp;

/**
 *
 * @author HOPEWELL
 */
public class Investment {
        private String customerName;
    private double amount;
    private String type;
    private int term;
    // Constructor to set up the object
    public Investment(String name, double amt, String type, int term) {
        this.customerName = name;
        this.amount = amt;
        this.type = type;
        this.term = term;
        
    }
    // Method to calculate compound interest
    public double calculateFinalAmount() {
        double interestRate = 0;
        // Determine rate based on type
        if (type.equalsIgnoreCase("Moderate")) {
            interestRate = 0.10; // 10%
        } else if (type.equalsIgnoreCase("Aggressive")) {
            interestRate = 0.15; // 15%
        }
        // Compound Interest Formula: A = P(1 + r)^t
        double finalAmount = amount * Math.pow((1 + interestRate), term);
        return finalAmount;
    }
    // Method to generate the report string
    public String getReport() {
        // Round the final amount to 2 decimal places for display
        double finalAmt = calculateFinalAmount();
        String formattedAmount = String.format("%.2f", finalAmt);
        
        String report = "INVESTMENT REPORT\n\n";
        report += "CUSTOMER NAME: " + customerName + "\n";
        report += "ORIGINAL AMOUNT: $ " + amount + "\n";
        report += "YEARS INVESTED: " + term + "\n";
        report += "FINAL AMOUNT: $ " + formattedAmount;  
        return report;
}
}
