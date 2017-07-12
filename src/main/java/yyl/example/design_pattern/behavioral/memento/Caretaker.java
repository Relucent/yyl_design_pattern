package yyl.example.design_pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	private List<Memento> mementos = new ArrayList<>();

	public void add(Memento state) {
		mementos.add(state);
	}

	public Memento get(int index) {
		return mementos.get(index);
	}

	public int size() {
		return mementos.size();
	}
}
