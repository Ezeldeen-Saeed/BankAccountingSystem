import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        this.bankAccounts.add(account);
        System.out.println("Account Added.");
    }

    public void removeAccount(int accountNumber) {
        this.bankAccounts.removeIf(account -> account.getAccountNumber() == accountNumber);
        System.out.println("Account Removed.");
    }

    public BankAccount findAccount(int accountNumber) {
        for (BankAccount x : this.bankAccounts) {
            if (x.getAccountNumber() == accountNumber) {
                return x;
            }
        }

        return null;
    }

    public void listAccounts() {
        for (BankAccount x : this.bankAccounts) {
            x.displayDetails();
        }
    }

}