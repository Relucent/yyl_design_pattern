package yyl.example.design_pattern.creation.singleton;

/**
 * 登记式/静态内部类<br>
 * 当 Singleton 类被装载时候，instance 不一定被初始化。<br>
 * 因为 SingletonHolder 类没有被主动使用，只有显示通过调用 getInstance 方法时，才会显示装载 SingletonHolder 类，从而实例化 instance<br>
 */
public class Singleton5 {

	private static class SingletonHolder {
		private static final Singleton5 INSTANCE = new Singleton5();
	}

	private Singleton5() {
	}

	public static final Singleton5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
