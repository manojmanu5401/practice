package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

abstract class Loan {
    double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoan(double amount, int years){
        double EMI;
        int n;
        n=years*12;
        rate=rate/1200;
        EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*amount;
        System.out.println("your monthly EMI is "+ EMI +" for the amount"+amount+" you have borrowed");
    }
}
