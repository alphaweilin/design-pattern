package patterns.behavioral.strategy;

public class Context {
	private Strategy<Integer, Integer, Integer> strategy;
	
	public void setStrategy(Strategy<Integer, Integer, Integer> strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		return strategy.apply(num1, num2);
	}
}
