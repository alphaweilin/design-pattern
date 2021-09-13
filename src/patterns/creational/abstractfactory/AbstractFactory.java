package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.entity.color.Color;
import patterns.creational.abstractfactory.entity.shape.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
