package patterns.behavioral.visitor;

import patterns.behavioral.visitor.entity.Computer;
import patterns.behavioral.visitor.entity.ComputerPart;

public class VisitorPatternDemo {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
