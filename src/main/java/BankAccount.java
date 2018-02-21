//import java.util.Random;

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
        accountType = accountCategory;
        ownerName = name;

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
     * @param aN word
     */
    public void setAccountNumber(final int aN) {
        this.accountNumber = aN;
    }

    /**
     * Word.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Word.
     * @param aT word.
     */
    public void setAccountType(final BankAccountType aT) {
        this.accountType = aT;
    }

    /**
     * Word.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Word.
     * @param aB word
     */
    public void setAccountBalance(final double aB) {
        this.accountBalance = aB;
    }

    /**
     * Word.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Word.
     * @param oN word
     */
    public void setOwnerName(final String oN) {
        this.ownerName = oN;
    }

    /**
     * Word.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Wrod.
     * @param iR word.
     */
    public void setInterestRate(final double iR) {
        this.interestRate = iR;
    }

    /**
     * Word.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Word.
     * @param iE word
     */
    public void setInterestEarned(final double iE) {
        this.interestEarned = iE;
    }
}
