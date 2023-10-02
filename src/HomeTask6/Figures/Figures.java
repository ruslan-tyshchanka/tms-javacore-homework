package HomeTask6.Figures;

import java.util.Random;

public class Figures {
    public static void main(String[] args) {

        double sumOfPerimeters = 0.0;

        Figure[] figuresArray = {new Triangle(), new Rectangle(), new Circle(), new Triangle(3,4,5), new Rectangle(15,25)};

        for (int i = 0; i<figuresArray.length; i++) {
            figuresArray[i].getPerimeter();
            System.out.println("Perimeter of figure "+i+" is "+figuresArray[i].perimeter);
            sumOfPerimeters=sumOfPerimeters+figuresArray[i].perimeter;
        }

        System.out.println("Sum of all perimeters is "+sumOfPerimeters);
    }
}
