package yyl.example.design_pattern.creation.singleton;

/**
 * 饿汉式实现<br>
 * 线程安全、实现简单、执行效率高
 */
public class Singleton3 {

	private static Singleton3 instance = new Singleton3();

	//让构造函数为 private，这样该类就不会被实例化
	private Singleton3() {
	}

	//获取唯一可用的对象
	public static Singleton3 getInstance() {
		return instance;
	}

	public void method() {
		System.out.println("hello world!");
	}
}
