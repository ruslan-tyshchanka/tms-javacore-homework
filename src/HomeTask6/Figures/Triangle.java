package HomeTask6.Figures;

public class Triangle extends Figure{
    int side1;
    int side2;
    int side3;
    Triangle(int side1, int side2, int side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    Triangle()
    {
        side1=random.nextInt(5,20);
        side2=random.nextInt(5,20);
        side3=random.nextInt(5,20);
    }

    public double getPerimeter() {
        perimeter = side1+side2+side3;
        return perimeter;
    }
}
