public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private int depositIn;

    BankAccount(){}

    public BankAccount(String accountNumber, String accountHolder, double balance, int depositIn){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.depositIn = depositIn;
    }

    String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    double getBalance() {
        return this.balance;
    }

    int getDeposit() {
        return depositIn;
    }

    void setBalance(double balance){
        this.balance=balance;
    }

    void setDeposit(int depositIn) {
        this.depositIn = depositIn;
    }

    static void deposit(){

    }

    static void withdraw() {

    }

    static void viewDetails() {

    }
}
//The deposit method should allow deposits and balance