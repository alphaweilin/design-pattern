package patterns.creational.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {

//		for (int i = 0; i < 20; i++) {
//			new Thread(() -> {
//				System.out.println(SingleObject3.getInstance());
//			}, "t" + i).start();
//		}
		
		for (int i = 0; i < 20; i++) {
			new Thread(() -> {
				System.out.println(SingleObject4.INSTANCE);
			}, "t" + i).start();
		}
	}

}
