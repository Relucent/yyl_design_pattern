package yyl.example.design_pattern.behavioral.visitor;

public class Element2 implements Element {

	public void accept(Visitor visitor) {
		visitor.accept(this);
	}

	public String method() {
		return "2";
	}
}
