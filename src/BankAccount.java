public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double depositIn;

    BankAccount(){}

    public BankAccount(String accountNumber, String accountHolder, double balance, double depositIn){
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

    double getDeposit() {
        return depositIn;
    }

    void setBalance(double balance){
        this.balance=balance;
    }

    void setDeposit(double depositIn) {
        this.depositIn = depositIn;
    }

    void deposit(double deposit){
        if (deposit < 10){
            System.out.println("You cannot deposit less than R10.");
        } else {
            System.out.println("Deposit accepted!!");
            double total = deposit + getBalance();
            setBalance(total);
            System.out.println("Money deposited: " + getDeposit() +"\n");
            System.out.println("Current Balance: R" + (getBalance()) +"\n");
        }
    }

    void withdraw(double withdraw) {
        if (getBalance() < 0){
            System.out.println("Insufficient Funds!");
        } else {
            System.out.println("Withdrawal Successful!");
            double total = getBalance() - withdraw;
            setBalance(total);
        }
    }

    void viewDetails() {
        System.out.println(getAccountHolder());
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
    }
}
//The deposit method should allow deposits and balance