package patterns.creational.builder.entity.item;

import patterns.creational.builder.entity.pack.Packing;

public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
