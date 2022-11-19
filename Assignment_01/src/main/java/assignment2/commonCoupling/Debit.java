package assignment2.commonCoupling;

public class Debit {

    public Debit(int debit) {
        int amount = Balance.getBalance() + debit;
        Balance.setBalance(amount);
    }
}
