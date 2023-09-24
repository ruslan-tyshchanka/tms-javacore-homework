package HomeTask2.Extra;

import java.text.DecimalFormat;

public class Task2 {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        float depositAmount = 100.00f;
        int monthDuration = 10;

        while (monthDuration>0) {
            float interest = depositAmount/100*7;
            depositAmount = depositAmount + interest;
            monthDuration--;
        }

        System.out.println(df.format(depositAmount));
    }
}
