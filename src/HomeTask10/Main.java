package HomeTask10;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(2);

        array.addToArray(3);
        array.addToArray(6);
        array.displayArray();

        array.addToArray(7);
        array.addToArray(3);
        array.addToArray(6);
        array.addToArray(5);
        array.addToArray(732);
        array.addToArray(433);
        array.displayArray();

        array.get(0);

        array.isElementPresent(3);
        array.isElementPresent(33);

        array.removeElementByIndex(7);
        array.displayArray();

        array.removeElementByIndex(0);
        array.displayArray();

        array.removeElementByIndex(3);
        array.displayArray();

        array.clearArray();
        array.displayArray();



    }
}
