package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        if(bank.equalsIgnoreCase("sbi")){
            return new SBI();
        }
        else if(bank.equalsIgnoreCase("pnb")){
            return new PNB();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
