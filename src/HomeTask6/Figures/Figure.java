package HomeTask6.Figures;

import java.util.Random;

public abstract class Figure {
    Random random = new Random();
    String name;
    double perimeter;
    public abstract double getPerimeter();
}
