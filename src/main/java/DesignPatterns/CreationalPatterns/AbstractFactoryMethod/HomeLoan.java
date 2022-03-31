package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class HomeLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        this.rate =rate;
    }
}
