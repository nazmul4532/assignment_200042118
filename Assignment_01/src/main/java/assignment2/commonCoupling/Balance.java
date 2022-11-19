package assignment2.commonCoupling;

public class Balance {
    private static int balance;
    public Balance(int balance)
    {
        Balance.balance = balance;
    }
    public static int getBalance(){
        return balance;
    }
    public static void setBalance(int balance)
    {
        Balance.balance = balance;
    }
}
