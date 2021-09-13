package patterns.creational.factory;

import patterns.creational.factory.entity.Circle;
import patterns.creational.factory.entity.Rectangle;
import patterns.creational.factory.entity.Shape;
import patterns.creational.factory.entity.Square;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
