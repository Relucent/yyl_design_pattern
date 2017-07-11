package yyl.example.design_pattern.behavioral.observer;

/**
 * 抽象观察者角色类
 * @see java.util.Observer
 */
public interface Observer {
	/**
	 * 更新接口
	 * @param state 更新的状态
	 */
	public void update(String state);
}
