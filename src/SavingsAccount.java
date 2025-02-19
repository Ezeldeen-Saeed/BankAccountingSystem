public class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(String holderName, double balance, double interestRate) {
        super(holderName, balance);
        this.interestRate = interestRate;
    }


    public void addInterest(double amount) {
        this.interestRate += amount;
        this.balance += (balance / interestRate);
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }
}