package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.entity.color.Color;
import patterns.creational.abstractfactory.entity.shape.Circle;
import patterns.creational.abstractfactory.entity.shape.Rectangle;
import patterns.creational.abstractfactory.entity.shape.Shape;
import patterns.creational.abstractfactory.entity.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
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

	@Override
	public Color getColor(String color) {
		return null;
	}
}