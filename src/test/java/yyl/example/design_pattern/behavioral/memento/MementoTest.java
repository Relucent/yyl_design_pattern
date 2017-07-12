package yyl.example.design_pattern.behavioral.memento;

public class MementoTest {
	public static void main(String[] args) {

		Originator originator = new Originator();
		Caretaker careTaker = new Caretaker();

		careTaker.add(originator.createMemento());
		originator.setState("#1");
		careTaker.add(originator.createMemento());
		originator.setState("#2");
		careTaker.add(originator.createMemento());
		originator.setState("#3");
		careTaker.add(originator.createMemento());
		originator.setState("#4");
		careTaker.add(originator.createMemento());
		originator.setState("#5");

		System.out.println("Current State: " + originator.getState());

		for (int i = careTaker.size() - 1; i >= 0; i--) {
			originator.restoreMemento(careTaker.get(i));
			System.out.println(i + ".th saved State: " + originator.getState());
		}

		System.out.println("Current State: " + originator.getState());
	}
}
