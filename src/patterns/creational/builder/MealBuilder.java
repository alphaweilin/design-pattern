package patterns.creational.builder;

import patterns.creational.builder.entity.Meal;
import patterns.creational.builder.entity.item.ChickenBurger;
import patterns.creational.builder.entity.item.Coke;
import patterns.creational.builder.entity.item.Pepsi;
import patterns.creational.builder.entity.item.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}