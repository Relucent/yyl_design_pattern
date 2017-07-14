package yyl.example.design_pattern.behavioral.visitor;

public class VisitorA implements Visitor {

	public void accept(Element element) {
		System.out.println("A:?");
	}

	@Override
	public void accept(Element1 element) {
		System.out.println("A:" + element.method());
	}

	@Override
	public void accept(Element2 element) {
		System.out.println("A:" + element.method());
	}
}
