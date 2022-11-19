package assignment2.commonCoupling;

public class Credit {

    public Credit(int credit) {
        int amount = Balance.getBalance() - credit;
        Balance.setBalance(amount);
    }
}
