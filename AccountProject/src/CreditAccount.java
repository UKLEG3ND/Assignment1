//The CreditAccount class extends the Account class, introduces a creditLimit, and overrides the deposit and withdraw methods to handle credit limits.


public class CreditAccount extends Account {
    private double creditLimit;  // Credit limit specific to CreditAccount

    // Default constructor with a default credit limit
    public CreditAccount() {
        super();
        this.creditLimit = 500; // Default credit limit
    }

    // Constructor with initial balance and credit limit
    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    // Getter for credit limit
    public double getCreditLimit() {
        return creditLimit;
    }

    // Setter for credit limit
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    // Override deposit method
    @Override
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Incorrect Amount. Value is less than or equal to 0.");
            return false;
        }
        setBalance(getBalance() + amount);
        return true;
    }

    // Override withdraw method with credit limit check
    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }

        // Check if withdrawing will exceed the credit limit
        if (getBalance() - amount < -creditLimit) {
            System.out.println("Withdrawal declined. Credit limit exceeded.");
            return false;
        }

        setBalance(getBalance() - amount);
        return true;
    }

    // Override toString method for displaying balance and credit limit
    @Override
    public String toString() {
        return "Current Balance = " + getBalance() + ", Credit Limit = " + creditLimit;
    }
}
