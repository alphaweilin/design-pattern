package patterns.behavioral.visitor.entity;

import patterns.behavioral.visitor.ComputerPartVisitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
