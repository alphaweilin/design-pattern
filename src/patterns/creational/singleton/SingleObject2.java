package patterns.creational.singleton;

public class SingleObject2 {
	private volatile static SingleObject2 instance;

	private SingleObject2() {
	}

	public static SingleObject2 getInstance() {
		if (instance == null) {
			synchronized (SingleObject2.class) {
				if (instance == null) {
					instance = new SingleObject2();
				}
			}
		}
		return instance;
	}
}
