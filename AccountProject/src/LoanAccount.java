//The LoanAccount class extends the Account class and adds properties for managing loans. It includes methods to calculate interest and apply payments to the loan balance.


public class LoanAccount extends Account {
    private double loanBalance;  // Outstanding loan balance
    private double interestRate;  // Interest rate for the loan
    private double interestPaid;  // Total interest paid so far
    private double principalPaid;  // Total principal paid so far

    // Constructor with initial loan amount and interest rate
    public LoanAccount(double initialLoan, double interestRate) {
        super(0); // Loan account starts with zero balance as it's not a savings account
        this.loanBalance = initialLoan;
        this.interestRate = interestRate;
        this.interestPaid = 0;
        this.principalPaid = 0;
    }

    // Getter for loan balance
    public double getLoanBalance() {
        return loanBalance;
    }

    // Getter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Getter for interest paid
    public double getInterestPaid() {
        return interestPaid;
    }

    // Getter for principal paid
    public double getPrincipalPaid() {
        return principalPaid;
    }

    // Method to calculate interest on the loan balance
    public void calculateInterest() {
        double interest = loanBalance * (interestRate / 100);
        loanBalance += interest;
    }

    // Method to make a payment towards the loan
    public boolean makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Payment amount must be positive.");
            return false;
        }

        // Calculate interest and principal portions of the payment
        double interest = loanBalance * (interestRate / 100);
        double principalPayment = amount - interest;

        if (principalPayment > 0) {
            interestPaid += interest;
            principalPaid += principalPayment;
            loanBalance -= principalPayment;
        } else {
            interestPaid += amount;
            loanBalance += (interest - amount); // if payment is less than interest, increase the loan balance
        }

        return true;
    }

    // Override deposit method (not applicable for Loan Account)
    @Override
    public boolean deposit(double amount) {
        System.out.println("Deposit not applicable for Loan Account.");
        return false;
    }

    // Override withdraw method (not applicable for Loan Account)
    @Override
    public boolean withdraw(double amount) {
        System.out.println("Withdrawal not applicable for Loan Account.");
        return false;
    }

    // Override toString method for displaying loan details
    @Override
    public String toString() {
        return "Loan Balance = " + loanBalance + ", Interest Rate = " + interestRate +
                ", Interest Paid = " + interestPaid + ", Principal Paid = " + principalPaid;
    }
}
