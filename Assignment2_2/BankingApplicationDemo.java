package Assignment2_2;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    private int accountNo;
    private double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(double amt) throws InsufficientFundsException {
        if (amt > balance) {
            throw new InsufficientFundsException("Insufficient funds: Current balance is " + balance);
        }
        balance -= amt;
        System.out.println("Withdrew: " + amt);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingApplicationDemo {
    public static void main(String[] args) {
        Account acc = new Account(123456, 1000.00);

        try {
            acc.deposit(500.00);
            acc.withdraw(200.00);
            acc.withdraw(1500.00); // This will cause InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Final balance: " + acc.getBalance());
    }
}
