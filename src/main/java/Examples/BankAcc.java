package Examples;

public class BankAcc {

    private int acc_number = 0;
    private String acc_name="xyz";
    private float balance =0;

    public BankAcc(int acc_number, String acc_name, float balance) {
        this.acc_number = acc_number;
        this.acc_name = acc_name;
        this.balance = balance;
    }

    public int getAcc_number() {
        return acc_number;
    }

    public void setAcc_number(int acc_number) {
        this.acc_number = acc_number;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
