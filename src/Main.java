// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        HDFCBankAccount h1 = new HDFCBankAccount(150,55);
        int ans = h1.getRoi();
        System.out.println(ans);
        h1.addMoney(1000);
        System.out.println(h1.getBalance());
        System.out.println(h1.withdrewMoney(1000));
        System.out.println(h1.getBalance());

        SbiBankAccount s1 = new SbiBankAccount(500,58);
        int ans1 = s1.getRoi();
        System.out.println(ans1);
        s1.addMoney(1000);
        System.out.println(s1.getBalance());
        System.out.println(s1.withdrewMoney(1001));
        System.out.println(s1.getBalance());
    }
}