package CreationalDP.FactoryDP;

public class Runner {

    public static void main(String[] args) {

        Shape triangle = new Triangle("ucgen",60,3);
        triangle.draw();

        Shape square = new Square("kare",90,4);
        square.draw();

        Shape pentagon =new Pentagon("besgen",108,5);
        pentagon.draw();

        //---------------------------------------------------------------

        System.out.println("---------------------------------------------");

        Shape shape1 = ShapeFactory.getShape("ucgen");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("kare");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("besgen");
        shape3.draw();



    }
}
