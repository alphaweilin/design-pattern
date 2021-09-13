package patterns.creational.builder.entity;

import java.util.ArrayList;
import java.util.List;

import patterns.creational.builder.entity.item.Item;

public class Meal {
	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		cost = items.stream().map(Item::price).reduce(Float::sum).get();
		return cost;
	}

	public void showItems() {
		items.forEach(item -> {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		});
	}
}
