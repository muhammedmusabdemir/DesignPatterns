package CreationalDP.FactoryDP;

public class ShapeFactory {

    public static Shape getShape(String shapeType){ //enumType kullanmak gerekirdi

        if (shapeType.equalsIgnoreCase("ucgen")){
            return new Triangle("ucgen",60,3);
        }else if(shapeType.equalsIgnoreCase("kare")){
            return new Square("kare",90,4);
        }else if (shapeType.equalsIgnoreCase("besgen")){
            return new Pentagon("besgen",108,5);
        }
        return null;
    }
}
