package HomeTask2.Conditions;

public class Task2 {
    public static void main(String[] args) {

        byte monthNumber = 13;

        if(monthNumber >= 1 && monthNumber <= 2 || monthNumber == 12) {
            System.out.println("It's winter season");
        } else if(monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("It's spring season");
        } else if(monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("It's summer season");
        } else if(monthNumber >= 9 && monthNumber <= 11) {
            System.out.println("It's fall season");
        } else {
            System.out.println("Invalid month number is used");
        }
    }
}
