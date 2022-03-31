package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan.equalsIgnoreCase("homeloan")){
            return new HomeLoan();
        }
        else if(loan.equalsIgnoreCase("educationloan")){
            return new EducationLoan();
        }
        return null;
    }
}
