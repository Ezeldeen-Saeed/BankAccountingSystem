public class CurrentAccount extends BankAccount {
    private double overdraftLimit;


    CurrentAccount(String holderName, double balance, double overdraftLimit) {
        super(holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double limit) {
        overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.overdraftLimit) {
            System.out.println("The amount required to be withdrawn is beyond the limit.");
            return;
        }

        this.balance -= amount;
    }
}
