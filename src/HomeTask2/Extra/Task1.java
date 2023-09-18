package HomeTask2.Extra;

public class Task1 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;

        for (int iteration = 1; iteration <= 11; iteration++) {
            switch (iteration) {
                case 1:
                    System.out.println(firstNumber);
                    break;
                case 2:
                    System.out.println(secondNumber);
                    break;
                default:
                    int outputNumber = firstNumber + secondNumber;
                    System.out.println(outputNumber);
                    firstNumber = secondNumber;
                    secondNumber = outputNumber;
            }
        }
    }
}
