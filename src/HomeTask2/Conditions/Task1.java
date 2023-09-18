package HomeTask2.Conditions;

public class Task1 {

    public static void main(String[] args) {

        byte monthNumber = 13;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("It's winter season");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(("It's spring season"));
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(("It's summer season"));
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(("It's fall season"));
                break;
            default:
                System.out.println("Invalid month number is used");
        }
    }
}
