package patterns.creational.builder.entity.item;

import patterns.creational.builder.entity.pack.Packing;
import patterns.creational.builder.entity.pack.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
