import java.util.UUID;

public class HDFCBankAccount implements BankAccount{
    private final String accountNumber;
    private int balance;
    private final int roi; // 5% -> 5
    public HDFCBankAccount(int balance) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5; // By default
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getRoi() {
        return roi;
    }

    public HDFCBankAccount(int balance, int roi) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = roi;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public Boolean withdrewMoney(int money) {
        if(this.balance >= money) {
            this.balance = this.balance - money;
            return true;
        }
        return false;
    }

    @Override
    public Boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int timeInYears) {
        return amount * timeInYears * roi / 100;
    }
}
