package patterns.creational.abstractfactory.entity.shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");	
	}

}
