package Task4;

import java.util.ArrayList;

public class ShapeBuilder  {
    ArrayList<Shapes> shapeArr = new ArrayList<>();

    public void addShape(Shapes s){
        this.shapeArr.add(s);

    }

    public void getTotalArea()  {
        double totalArea = 0;
        for (Shapes s:this.shapeArr) {
            totalArea += s.getArea();
        }
        System.out.println("The total area is: " + totalArea);
    }
}
