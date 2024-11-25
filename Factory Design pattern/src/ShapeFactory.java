public class ShapeFactory {

    Shape getShape(String shapeType) {
        switch(shapeType) {
            case "RECTANGLE":
                return new Rectangle();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }
}
