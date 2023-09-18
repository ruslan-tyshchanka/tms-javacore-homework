package HomeTask2.Extra;

public class Task3 {
    public static void main(String[] args) {

        for (int firstMultiplier = 1; firstMultiplier <= 10; firstMultiplier++) {
            for (int secondMultiplier = 1; secondMultiplier <=10; secondMultiplier++) {
                int result = firstMultiplier * secondMultiplier;
                System.out.println(firstMultiplier + "x" + secondMultiplier + "=" + result);
            }
        }
    }
}
