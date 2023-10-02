package HomeTask6.Figures;

public class Circle extends Figure{
    int radius;
    Circle(int radius)
    {
        this.radius=radius;
    }
    Circle()
    {
        this.radius=random.nextInt(5,20);
    }
    public double getPerimeter() {
        perimeter = 2*3.14*radius;
        return perimeter;
    }
}