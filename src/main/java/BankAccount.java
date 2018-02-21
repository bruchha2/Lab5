import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Word.
         */
        CHECKINGS,
        /**
         * Word.
         */
        SAVINGS,
        /**
         * Word.
         */
        STUDENT,
        /**
         * Word.
         */
        WORKPLACE
    }

    /**
     * Word.
     */
    private int accountNumber;

    /**
     * Word.
     */
    private BankAccountType accountType;


    /**
     * Word.
     */
    private double accountBalance;

    /**
     * Word.
     */
    private String ownerName;

    /**
     * Word.
     */
    private double interestRate;

    /**
     * Word.
     */
    private double interestEarned;

    /**
     * Word.
     * @param name word
     * @param accountCategory word
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * Word.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Word.
     * @param accountNumber word
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Word.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Word.
     * @param accountType word.
     */
    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Word.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Word.
     * @param accountBalance word
     */
    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * Word.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Word.
     * @param ownerName word
     */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Word.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Wrod.
     * @param interestRate word.
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Word.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Word.
     * @param interestEarned word
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }
}