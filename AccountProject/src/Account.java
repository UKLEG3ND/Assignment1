public abstract class Account {
    private double balance;
    // Default constructor initializes balance to zero
    public Account() {
        this.balance = 0;
    }
    public Account(double _balance){
        this.balance = _balance;
    }
    public Account(Account act){
        this.balance = act.balance;
    }
    // Getter method for balance (encapsulation)
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double _balance){
        this.balance = _balance;
    }
    // Abstract method for deposit to be implemented by subclasses
    public abstract boolean deposit(double _amount);
    // Abstract method for withdraw to be implemented by subclasses
    public abstract boolean withdraw(double _amount);
}
