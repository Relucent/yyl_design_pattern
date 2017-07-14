package yyl.example.design_pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Element> elements = new ArrayList<>();

	public void action(Visitor visitor) {
		for (Element element : elements) {
			element.accept(visitor);
		}
	}

	public void add(Element element) {
		elements.add(element);
	}
}
