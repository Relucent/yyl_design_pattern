package yyl.example.design_pattern.creation.singleton;

/**
 * 双检锁/双重校验锁<br>
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。<br>
 * 注意：需要JDK1.5及以上版本支持，因为JDK1.5以前缺少volatile关键字，因代码重排序等问题会导致双重校验无效。<br>
 */
public class Singleton4 {

	private static volatile Singleton4 instance = new Singleton4();

	//让构造函数为 private，这样该类就不会被实例化
	private Singleton4() {
	}

	//获取唯一可用的对象
	public static Singleton4 getInstance() {
		if (instance == null) {
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}

	public void method() {
		System.out.println("hello world!");
	}
}
