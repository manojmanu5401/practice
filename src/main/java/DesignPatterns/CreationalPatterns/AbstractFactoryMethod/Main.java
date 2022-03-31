package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Bank from where you want to take loan amount: \n");
        String bank= scanner.nextLine();
        System.out.print(bank+"\n");
        System.out.print("Enter the type of loan e.g. home loan or education loan : \n");
        String loan = scanner.nextLine();
        System.out.print(loan+"\n");
        String bankName = FactoryCreator.getFactory("Bank").getBank("sbi").getBankName();
        System.out.print("Enter the interest rate for "+ bankName +": ");
        double rate = scanner.nextDouble();
        System.out.print(rate+"\n");
        System.out.print("Enter the loan amount you want to take: ");
        double amount = scanner.nextDouble();
        System.out.print(amount+"\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = scanner.nextInt();
        Loan l = FactoryCreator.getFactory("Loan").getLoan(loan);
        l.getInterestRate(rate);
        l.calculateLoan(amount,years);

    }
}
