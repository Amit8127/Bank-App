public interface BankAccount {
//    withdraw money
//    check balance
//    add money
//    get ROI
//    get totalInterest
    Boolean withdrewMoney(int money);
    Boolean addMoney(int money);
    int checkBalance();
    int getROI();
    int getTotalInterest(int amount, int time);

}
