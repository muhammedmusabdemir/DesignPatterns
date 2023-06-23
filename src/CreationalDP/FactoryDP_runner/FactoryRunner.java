package CreationalDP.FactoryDP_runner;

import CreationalDP.FactoryDP.Shape;
import CreationalDP.FactoryDP.ShapeFactory;
//import CreationalDP.FactoryDP.Square;

public class FactoryRunner {

    public static void main(String[] args) {

        //Shape shape = new Square();

        Shape shape = ShapeFactory.getShape("kare");
        shape.draw();
    }
}
