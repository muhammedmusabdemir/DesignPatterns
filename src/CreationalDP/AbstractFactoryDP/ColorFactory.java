package CreationalDP.AbstractFactoryDP;

public class ColorFactory implements AbstractFactory{

    public Color getColor(String color){
        if (color.equalsIgnoreCase("mavi")){
            return new Blue();
        } else if (color.equalsIgnoreCase("kirmizi")) {
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
