import java.util.Random;

public class BankAccount {
    private String number;
    private double checkingBalance;
    private double savingsBalance;

    private static double numberOfAccounts = 0;
    private static double sumBalance = 0;

    public BankAccount(){
        this.number = generateNumber();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }

    private String generateNumber(){
        char[] number = new char[10];
        Random r = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = (char)(r.nextInt(10) + '0');
        }
        return new String(number);
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public void deposit(double amount, boolean toSavings){
        if(toSavings) {
            savingsBalance += amount;
        }
        else{
            checkingBalance += amount;
        }
        sumBalance += amount;
    }

    public void widthdraw(double amount, boolean fromSavings){
        if(fromSavings) {
            if(savingsBalance < amount){
                return;
            }
            savingsBalance -= amount;
        }
        else{
            if(checkingBalance < amount){
                return;
            }
            checkingBalance -= amount;
        }
        sumBalance -= amount;
    }

    public double getTotalBalance(){
        return sumBalance;
    }
}
