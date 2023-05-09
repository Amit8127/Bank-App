import java.util.UUID;

public class SbiBankAccount implements BankAccount{
    private String accountNumber;
    private int age;
    private int balance;
    private int roi;
    public SbiBankAccount(int balance, int age) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.age = age;
        setRoiBasedOnAge();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void setRoiBasedOnAge() {
        if(age <= 18) {
            roi = 3;
        } else if(age <= 25){
            roi = 4;
        } else if(age <= 40){
            roi = 5;
        } else roi = 6;
    }
    @Override
    public Boolean withdrewMoney(int money) {
        if((this.balance - 500) >= money) {
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
