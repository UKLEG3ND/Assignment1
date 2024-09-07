//The class inherits from the Account base class and implements the abstract methods deposit() and withdraw().
//It performs checks to ensure only valid amounts are deposited or withdrawn.
//Uses method overriding to provide specific implementations for deposit() and withdraw().


public class DepitAccount extends Account {

    // Default constructor calls the parent constructor
    public DepitAccount() {
        super();
    }

    // Constructor that sets an initial promotional balance
    public DepitAccount(double promo) {
        setBalance(promo);
    }

    // Override the deposit method
    @Override
    public boolean deposit(double _amount) {
        if (_amount <= 0) {
            System.out.println("Incorrect Amount. Value is less than or equal to 0.");
            return false;
        }
        setBalance(getBalance() + _amount);
        return true;
    }

    // Override the withdraw method
    @Override
    public boolean withdraw(double _amount) {
        if (_amount > getBalance()) {
            System.out.println(":) you have no money my friend!!!!!");
            return false;
        }
        if (_amount <= 0) {
            System.out.println("Really");
            return false;
        }
        setBalance(getBalance() - _amount);
        return true;
    }

    // Override toString method for displaying balance
    @Override
    public String toString() {
        return "The current Balance = " + getBalance() + "\n";
    }
}
