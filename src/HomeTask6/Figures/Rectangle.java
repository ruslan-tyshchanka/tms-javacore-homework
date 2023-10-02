package HomeTask6.Figures;

public class Rectangle extends Figure{
    int side1;
    int side2;
    Rectangle(int side1, int side2)
    {
        this.side1=side1;
        this.side2=side2;
    }
    Rectangle()
    {
        this.side1=random.nextInt(5,20);
        this.side2=random.nextInt(5,20);
    }

    public double getPerimeter() {
        perimeter = (side1+side2)*2;
        return perimeter;
    }
}