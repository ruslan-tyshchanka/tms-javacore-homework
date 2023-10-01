package HomeTask5.CreditCardOperations;

public class CreditCard {
    int accountNumber;
    float accountBalance;
    void makeDeposit(float amountToBeDeposited) {
        accountBalance=accountBalance+amountToBeDeposited;
    }
    void withdrawMoney(float amountToBeWithdrawn) {
        if (amountToBeWithdrawn<=accountBalance) {
            accountBalance=accountBalance-amountToBeWithdrawn;
        } else {
            System.out.println("There is not enough money on your account");
        }
    }
    void displayBalance() {
        System.out.println("Current balance for account "+accountNumber+" is $"+accountBalance);
    }
}
