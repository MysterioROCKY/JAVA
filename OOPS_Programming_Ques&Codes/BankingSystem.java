import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    double calculateInterest();

    double viewBalance();
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void displayAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account Balance: " + account.viewBalance());
        }
    }
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; 
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500.0, 100.0);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        bank.displayAccountBalances();

        savingsAccount.deposit(200.0);
        currentAccount.withdraw(700.0);

        bank.displayAccountBalances();
    }
}
