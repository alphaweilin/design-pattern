package patterns.behavioral.strategy;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		
		context.setStrategy((item1, item2) -> item1 + item2);
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context.setStrategy((item1, item2) -> item1 - item2);
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context.setStrategy((item1, item2) -> item1 * item2);
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
