package yyl.example.design_pattern.behavioral.visitor;

public class VisitorB implements Visitor {

	@Override
	public void accept(Element1 element) {
		System.out.println("B:" + element.method());
	}

	@Override
	public void accept(Element2 element) {
		System.out.println("B:" + element.method());
	}
}
