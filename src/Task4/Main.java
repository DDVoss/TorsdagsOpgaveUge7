package Task4;

public class Main {
    public static void main(String[]args)   {
        Shapes myCircle = new Circle(10);
        System.out.println(myCircle.getArea());

        Shapes mySquare = new Square(5,6);
        System.out.println(mySquare.getArea());

        ShapeBuilder s = new ShapeBuilder();
        s.addShape(myCircle);
        s.addShape(mySquare);
        s.getTotalArea();

    }
}
