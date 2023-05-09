public class SbiBankAccount implements BankAccount{
    private int balance;

    public SbiBankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public Boolean withdrewMoney(int money) {
        if(this.balance >= money) {
            this.balance = this.balance - money;
            return true;
        }
        return false;
    }
}
