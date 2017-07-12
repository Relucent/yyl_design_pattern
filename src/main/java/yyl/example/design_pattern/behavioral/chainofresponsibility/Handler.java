package yyl.example.design_pattern.behavioral.chainofresponsibility;

/**
 * 抽象处理者角色类
 */
public abstract class Handler {

	/**
	 * 持有下一个处理请求的对象
	 */
	protected Handler next = null;

	public void setNext(Handler next) {
		this.next = next;
	}

	/**
	 * 执行操作
	 */
	public abstract void invok(String target);
}
