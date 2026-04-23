/**
 * Represents a simple bank account with a name and balance.
 */
public class BankAccount {

    private String accountName;
    private double balance;

    /**
     * Constructs a BankAccount object.
     *
     * @param accountName name of the account holder
     * @param balance     initial balance
     */
    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    /** @return account holder name */
    public String getAccountName() {
        return accountName;
    }

    /** @return current balance */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns a readable string representation of the account.
     */
    @Override
    public String toString() {
        return "Account Holder   : " + accountName + "\n" +
                String.format("Current Balance  : %.2f", balance);
    }
}