package HomeTask5.ATM;

public class ATM {
    int numberOfTwenties;
    int numberOfFifties;
    int numberOfHundreds;
    protected int amountOfAtmMoney;
    boolean isMoneyWithdrawn;

    ATM(int numberOfTwenties, int numberOfFifties, int numberOfHundreds) {
        this.numberOfTwenties = numberOfTwenties;
        this.numberOfFifties = numberOfFifties;
        this.numberOfHundreds = numberOfHundreds;
    }

    void countAtmMoney() {
        amountOfAtmMoney = (numberOfTwenties * 20) + (numberOfFifties * 50) + (numberOfHundreds * 100);
    }
    void depositMoney(int numberOfBanknotes, int nominal) {
        countAtmMoney();
        int depositSum = numberOfBanknotes * nominal;
        amountOfAtmMoney = amountOfAtmMoney + depositSum;
        switch (nominal) {
            case 20:
                numberOfTwenties = numberOfTwenties + numberOfBanknotes;
                break;
            case 50:
                numberOfFifties = numberOfFifties + numberOfBanknotes;
                break;
            case 100:
                numberOfHundreds = numberOfHundreds + numberOfBanknotes;
                break;
            default:
                System.out.println("ATM cannot accept your banknote");
        }
    }
    boolean withdrawMoney (int withdrawalSum){
        countAtmMoney();

        int hundredsToBeWithdrawn=0;
        int fiftiesToBeWithdrawn=0;
        int twentiesToBeWithdrawn=0;

        int remainder = withdrawalSum%100;
        int numberOfRequiredHundreds = (withdrawalSum-remainder)/100;
        if(numberOfRequiredHundreds<=numberOfHundreds){
            hundredsToBeWithdrawn=numberOfRequiredHundreds;
            withdrawalSum=remainder;
        }
        if(numberOfRequiredHundreds>numberOfHundreds&&numberOfHundreds!=0){
            hundredsToBeWithdrawn=numberOfHundreds;
            withdrawalSum=withdrawalSum-(hundredsToBeWithdrawn*100);
        }

        remainder=withdrawalSum%50;
        int numberOfRequiredFifties = (withdrawalSum-remainder)/50;
        if(numberOfRequiredFifties<=numberOfFifties){
            fiftiesToBeWithdrawn=numberOfRequiredFifties;
            withdrawalSum=remainder;
        }if(numberOfRequiredFifties>numberOfFifties&&numberOfFifties!=0){
            fiftiesToBeWithdrawn=numberOfFifties;
            withdrawalSum=withdrawalSum-(fiftiesToBeWithdrawn*50);
        }

        remainder=withdrawalSum%20;
        int numberOfRequiredTwenties = (withdrawalSum-remainder)/20;
        if(numberOfRequiredTwenties<=numberOfTwenties&&remainder==0) {
            twentiesToBeWithdrawn = numberOfRequiredTwenties;
            isMoneyWithdrawn = true;
        }
        if (isMoneyWithdrawn==true){
            System.out.println("Money will be withdrawn in following nominals:");
                if(hundredsToBeWithdrawn!=0){
                    System.out.println(hundredsToBeWithdrawn+"x$100");
                };
                if(fiftiesToBeWithdrawn!=0){
                    System.out.println(fiftiesToBeWithdrawn+"x$50");
                }
                if(twentiesToBeWithdrawn!=0){
                    System.out.println(twentiesToBeWithdrawn+"x$20");
                }
                System.out.println("Operation Status: "+isMoneyWithdrawn);

                numberOfHundreds=numberOfHundreds-hundredsToBeWithdrawn;
                numberOfFifties=numberOfFifties-fiftiesToBeWithdrawn;
                numberOfTwenties=numberOfRequiredTwenties-twentiesToBeWithdrawn;
        } else {
            System.out.println("Your sum cannot be withdrawn");
            System.out.println("Operation Status: "+isMoneyWithdrawn);
        }

        return isMoneyWithdrawn;
    }
}
