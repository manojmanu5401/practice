package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

public class PNB implements Bank{
    private final String name = "PNB BANK";
    private final String IFCCode = "PNB001";
    @Override
    public String getBankName() {
        return name;
    }
    @Override
    public String getBankIFCCode() {
        return IFCCode;
    }
}
