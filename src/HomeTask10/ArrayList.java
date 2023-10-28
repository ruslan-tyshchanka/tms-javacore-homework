package HomeTask10;

import java.util.Arrays;

public class ArrayList<E> {
    Object[] array;
    ArrayList ()
    {
        array = new Object[2];
    }

    ArrayList (int arraySize)
    {
        array = new Object[arraySize];
    }

    void addToArray (E elementToAdd) {
        boolean isElementAdded = false;
        for (int i = 0; i< array.length; i++) {
            if (array[i]==null&&isElementAdded==false) {
                array[i]=elementToAdd;
                isElementAdded=true;
            }
        }
        if (isElementAdded==false) {
            int newArrayLength = array.length+1;
            Object[] newArray = new Object[newArrayLength];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[newArrayLength-1]=elementToAdd;
            array=newArray;
        }
    }

    void get(int index) {
        System.out.println(array[index]);
    }

    void displayArray () {
        System.out.println(Arrays.toString(array));
    }

    void isElementPresent (E elementToSearchInArray) {
        boolean isElementInArray;
        for (int i = 0; i<array.length; i++) {
            if (array[i]==elementToSearchInArray) {
                isElementInArray=true;
            }
        }
        if (isElementInArray=true) {
            System.out.println("Element '"+elementToSearchInArray+"' is present in array");
        } else {
            System.out.println("Element '"+elementToSearchInArray+"' is not present in array");
        }
    }

    void removeElementByIndex (int index) {
        int newArrayLength = array.length-1;
        Object[] newArray = new Object[newArrayLength];
        if (index==0) {
            System.arraycopy(array, 1, newArray, 0, newArray.length);
            array=newArray;
        } else if (index==array.length-1) {
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array=newArray;
        } else {
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index+1, newArray, index, newArray.length-index);
            array=newArray;
        }
    }

    void clearArray () {
        Object[] newArray = new Object[1];
        array=newArray;

    }
}
