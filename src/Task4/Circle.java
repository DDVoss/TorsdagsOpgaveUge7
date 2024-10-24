package Task4;

public class Circle implements Shapes{
    private double radius;

    Circle(double radius)  {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
}

