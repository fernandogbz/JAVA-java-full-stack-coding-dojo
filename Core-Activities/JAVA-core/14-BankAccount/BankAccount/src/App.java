public class App {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount();
        account.deposit(100, false);
        account.deposit(100, true);
        account.widthdraw(1000, false);
        account.widthdraw(10, false);
        System.out.println(account.getTotalBalance());
    }
}
