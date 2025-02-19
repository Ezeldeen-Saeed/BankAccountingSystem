import java.util.Random;

abstract class BankAccount {
    protected int accountNumber;
    protected String holderName;
    protected double balance;


    BankAccount(String holderName, double balance) {
        if (holderName == null) {
            System.out.println("Type holder name please....");
            return;
        }

        if (!holderName.matches("^[A-Za-z ]+$")) {
            System.out.printf("The holder name %s contains numbers or symbols\n", holderName);
            return;
        }

        this.accountNumber = generateAccountNumber();
        this.holderName = holderName;
        this.balance = balance;
    }


    private int generateAccountNumber() {
        long timestamp = System.currentTimeMillis() % 1000000;
        int rand = new Random().nextInt(900) + 100;

        return (int)timestamp + rand;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double setBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    abstract void withdraw(double amount);

    public void displayDetails() {
        System.out.printf("Holder Name: %s\nBalance: %.2f\n", this.holderName, this.balance);
    }

}