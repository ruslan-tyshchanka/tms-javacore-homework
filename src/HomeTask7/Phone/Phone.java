package HomeTask7.Phone;

public class Phone {
    String number;
    String model;
    double weight;
    Phone(String number, String model, double weight)
    {
        this(number, model);
        this.weight=weight;
    }
    Phone(String number, String model)
    {
        this.number=number;
        this.model=model;
    }
    Phone()
    {
        this.number="Undefined";
        this.model="Undefined";
    }
    void receiveCall(String callerName) {
        System.out.println();
        System.out.println(callerName+" is calling");
    }
    void receiveCall(String callerName, String callerNumber){
        System.out.println();
        System.out.println(callerNumber);
        System.out.println(callerName+" is calling");
    }
    String getNumber() {
        System.out.println();
        System.out.println(number);
        return number;
    }
    void sendMessage (String... recipientNumber){
        for(int i = 0; i < recipientNumber.length; i++){
            if(i!=recipientNumber.length-1){
                System.out.print(recipientNumber[i]+", ");
            } else {
                System.out.print(recipientNumber[i]);
            }
        }
    }
}
