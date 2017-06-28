package yyl.example.design_pattern.creation.singleton;

/**
 * 饿汉式实现<br>
 * 线程安全、实现简单、加锁会影响效率
 */
public class Singleton2 {

	private static Singleton2 instance;

	private Singleton2() {
	}

	public static synchronized Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

	public void method() {
		System.out.println("hello world!");
	}
}
