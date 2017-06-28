package yyl.example.design_pattern.creation.singleton;

/**
 * 懒汉式1<br>
 * 线程不安全、实现简单
 */
public class Singleton1 {

	private static Singleton1 instance;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}

	public void method() {
		System.out.println("hello world!");
	}
}
