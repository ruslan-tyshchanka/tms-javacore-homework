package HomeTask2.Conditions;

public class Task5 {

    public static void main(String[] args) {

        byte rainbowColorIndex = 7;

        String rainbowColor = "undefined";

        switch (rainbowColorIndex) {
            case 1:
                rainbowColor = "red";
                break;
            case 2:
                rainbowColor = "orange";
                break;
            case 3:
                rainbowColor = "yellow";
                break;
            case 4:
                rainbowColor = "green";
                break;
            case 5:
                rainbowColor = "blue";
                break;
            case 6:
                rainbowColor = "indigo";
                break;
            case 7:
                rainbowColor = "violet";
                break;
        }

        System.out.println("The rainbow color is " + rainbowColor);

    }

}
