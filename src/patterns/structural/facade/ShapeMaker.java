package patterns.structural.facade;

import patterns.structural.facade.entity.Circle;
import patterns.structural.facade.entity.Rectangle;
import patterns.structural.facade.entity.Shape;
import patterns.structural.facade.entity.Square;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}
