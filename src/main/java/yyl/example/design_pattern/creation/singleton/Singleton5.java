package yyl.example.design_pattern.creation.singleton;

/**
 * 枚举<br>
 * 使用JVM机制，不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。<br>
 * 需要 JDK1.5 及以上版本支持 ( ENUM 特性 是JDK1.5 之后才加入 )
 */
public enum Singleton5 {

	INSTANCE;

	public void method() {
		System.out.println("hello world!");
	}
}
