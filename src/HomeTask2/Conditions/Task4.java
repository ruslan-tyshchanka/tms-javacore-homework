package HomeTask2.Conditions;

public class Task4 {

    public static void main(String[] args) {

        byte temperature = 10;

        if (temperature <= -20) {
            System.out.println("It's cold outside");
        } else if (temperature > -20 && temperature < -5) {
            System.out.println("It's normal outside");
        } else {
            System.out.println("It's warm outside");
        }
    }
}
