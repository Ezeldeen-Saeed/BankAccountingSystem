

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount("Alice", 5000, 2.5);
        CurrentAccount ca = new CurrentAccount("Bob", 3000, 1000);

        bank.addAccount(sa);
        bank.addAccount(ca);

        System.out.println("\n=== List of Accounts ===");
        bank.listAccounts();

        System.out.println("\n=== Performing Transactions ===");
        sa.deposit(1000);
        sa.withdraw(200);
        sa.addInterest(2.5);

        ca.withdraw(3500); // Should be within overdraft limit

        System.out.println("\n=== Updated Account Details ===");
        bank.listAccounts();
    }
}