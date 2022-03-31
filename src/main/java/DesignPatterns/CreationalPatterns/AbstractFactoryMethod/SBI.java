package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class SBI implements Bank{
    private final String name = "SBI BANK";
    private final String IFCCode = "SBI125";
    @Override
    public String getBankName() {
        return name;
    }
    @Override
    public String getBankIFCCode() {
        return IFCCode;
    }
}
