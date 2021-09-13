package patterns.behavioral.visitor;

import patterns.behavioral.visitor.entity.Computer;
import patterns.behavioral.visitor.entity.Keyboard;
import patterns.behavioral.visitor.entity.Monitor;
import patterns.behavioral.visitor.entity.Mouse;

public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}
