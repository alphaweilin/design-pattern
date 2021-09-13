package patterns.structural.flyweight;

import java.util.HashMap;

import patterns.structural.flyweight.entity.Circle;
import patterns.structural.flyweight.entity.Shape;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		System.out.println("size of circleMap:"+circleMap.size());
		return circle;
	}
}
