package yyl.example.design_pattern.behavioral.observer;

public class ObserverTest {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.addObserver(new ConcreteObserver("Observer-1"));
		subject.addObserver(new ConcreteObserver("Observer-2"));
		subject.change("state1");
		subject.change("state2");
		subject.change("state3");
	}
}
