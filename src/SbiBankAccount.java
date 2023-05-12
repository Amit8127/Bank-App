import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class SbiBankAccount implements BankAccount{
    private final String accountNumber;
    private final int age;
    private int balance;
    private final int minBalance = 500;
    private final TreeMap<Integer, Integer> roiMap;
    {
        this.roiMap = new TreeMap<>();
        roiMap.put(3, 18);
        roiMap.put(4, 25);
        roiMap.put(5, 40);
        roiMap.put(6, 60);
    }
    private int roi;
    public SbiBankAccount(int balance, int age) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.age = age;

        if(age > 60) {
            roi = 7;
        } else {
            setRoiBasedOnAge();
        }
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

    private void setRoiBasedOnAge() {
        for(Map.Entry entry : roiMap.entrySet()) {
            int key = (int) entry.getKey();
            int value = (int) entry.getValue();
            if(age <= value) {
                roi = key;
            }
        }
    }
    @Override
    public Boolean withdrewMoney(int money) {
        if((this.balance - money) >= minBalance) {
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
