package patterns.structural.facade.entity;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}
