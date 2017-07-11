package yyl.example.design_pattern.behavioral.template;

/**
 * 抽象类 (模板)
 */
public abstract class AbstractClass {

	// 一些抽象行为，放到子类去实现
	public abstract void operation1();

	// 一些抽象行为，放到子类去实现
	public abstract void operation2();

	/**
	 * 模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，它们推迟到子类去实现。
	 */
	public void method() {
		operation1();
		operation2();
		System.out.println("Done the method.");
	}
}
