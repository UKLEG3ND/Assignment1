public class Main {
    public static void main(String[] args) {
        // Testing DepitAccount
        DepitAccount dpt1 = new DepitAccount();
        DepitAccount dpt2 = new DepitAccount(25);

        dpt1.deposit(100);
        dpt1.withdraw(25);
        System.out.println(dpt1.toString());

        dpt2.deposit(100);
        dpt2.withdraw(25);
        System.out.println(dpt2.toString());

        // Testing CreditAccount
        CreditAccount creditAcc = new CreditAccount(100, 300);
        creditAcc.deposit(200);
        creditAcc.withdraw(350);
        System.out.println(creditAcc.toString());

        // Testing LoanAccount
        LoanAccount loanAcc = new LoanAccount(1000, 5);
        loanAcc.calculateInterest();
        loanAcc.makePayment(200);
        System.out.println(loanAcc.toString());
    }
}
