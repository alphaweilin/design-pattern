package patterns.creational.singleton;

public class SingleObject3 {
	private static class SingletonHolder {
		private static final SingleObject3 INSTANCE = new SingleObject3();
	}

	private SingleObject3() {
	}

	public static final SingleObject3 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
