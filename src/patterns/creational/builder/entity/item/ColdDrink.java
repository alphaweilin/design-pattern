package patterns.creational.builder.entity.item;

import patterns.creational.builder.entity.pack.Bottle;
import patterns.creational.builder.entity.pack.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
