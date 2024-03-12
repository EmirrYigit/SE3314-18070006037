public class Account {
    private Customer customer;
    private double balance;

    /**
     * @param customer the customer related with the account.
     * @param balance the initial balance of the account.
     */

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    /**
     * @param amount the amount to deposit.
     */

    public void deposit(double amount){
        balance += amount;
    }

    /**
     * @param amount the amount to withdraw.
     */
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
    }

    /**
     * checks the current balance of account.
     * @return current balance.
     */

    public double checkbalance(){
        return balance;
    }
}
