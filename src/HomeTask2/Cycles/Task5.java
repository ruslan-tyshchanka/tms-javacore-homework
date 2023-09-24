package HomeTask2.Cycles;

public class Task5 {
    public static void main(String[] args) {

        int outputNumber = 0;

        for (int iteration=0; iteration < 10; iteration++) {
            switch(iteration) {
                case 0:
                    System.out.println(outputNumber);
                    break;
                default:
                    outputNumber = outputNumber - 5;
                    System.out.println(outputNumber);
                    break;
            }
        }
    }
}
