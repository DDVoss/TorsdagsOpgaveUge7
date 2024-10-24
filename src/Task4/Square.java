package Task4;

public class Square implements Shapes{
    private double width;
    private double length;
    Square(double width, double length)    {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
