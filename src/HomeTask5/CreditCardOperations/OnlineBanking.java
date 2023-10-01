package HomeTask5.CreditCardOperations;

public class OnlineBanking {
    public static void main(String[] args) {

        CreditCard personalAccount = new CreditCard();
        personalAccount.accountNumber = 1001;
        personalAccount.accountBalance = 100.00f;

        CreditCard businessAccount = new CreditCard();
        businessAccount.accountNumber = 1002;
        businessAccount.accountBalance = 15000.00f;

        CreditCard familyAccount = new CreditCard();
        familyAccount.accountNumber = 1003;
        familyAccount.accountBalance = 300000.00f;

        personalAccount.displayBalance();
        businessAccount.displayBalance();
        familyAccount.displayBalance();

        personalAccount.makeDeposit(200.00f);
        businessAccount.makeDeposit(150.00f);
        familyAccount.withdrawMoney(350.00f);

        personalAccount.displayBalance();
        businessAccount.displayBalance();
        familyAccount.displayBalance();
    }

}
