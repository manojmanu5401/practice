package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class EducationLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
