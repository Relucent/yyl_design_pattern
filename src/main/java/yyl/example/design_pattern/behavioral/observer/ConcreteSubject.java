package yyl.example.design_pattern.behavioral.observer;

/**
 * 具体主题角色类
 */
public class ConcreteSubject extends Subject {

	private volatile String state;

	public String getState() {
		return state;
	}

	public void change(String newState) {
		state = newState;
		System.out.println("Subject change state -> " + state);
		this.nodifyObservers(state); //状态发生改变，通知各个观察者
	}
}
