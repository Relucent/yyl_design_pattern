package yyl.example.design_pattern.behavioral.command;

/**
 * 接收者类，知道如何实施与执行一个请求相关的操作，任何类都可能作为一个接收者。
 */
public class Receiver {

	private long value = 0;

	/**
	 * 命令实现 i--
	 */
	public void decrement() {
		value--;
		System.out.println("execute -- ");
	}

	/**
	 * 命令实现 i++
	 */
	public void increment() {
		value++;
		System.out.println("execute ++ ");
	}

	public long getValue() {
		return value;
	}
}
