package yyl.example.design_pattern.behavioral.observer;

/**
 * 观察者
 */
public class ConcreteObserver implements Observer {

	private final String name;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(String state) {
		System.out.println(name + " update state -> " + state);
	}

}