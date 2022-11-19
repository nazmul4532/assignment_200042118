package assignment2.commonCoupling;

public class CommonCoupling {
    public static void main(String[] args){
        Balance balance = new Balance(3000);
        System.out.println(Balance.getBalance());
        Credit credit = new Credit(200);
        System.out.println(Balance.getBalance());
        Debit debit = new Debit(4000);
        System.out.println(Balance.getBalance());
    }
}

//Both Debit and Credit here are sharing a common data,balance, present in Balance class.
//This is common coupling
