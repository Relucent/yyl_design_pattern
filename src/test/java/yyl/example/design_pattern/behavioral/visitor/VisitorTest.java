package yyl.example.design_pattern.behavioral.visitor;

public class VisitorTest {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();

		Element elementA = new Element1();
		Element elementB = new Element2();
		Visitor visitorA = new VisitorA();
		Visitor visitorB = new VisitorB();

		objectStructure.add(elementA);
		objectStructure.add(elementB);
		objectStructure.action(visitorA);
		objectStructure.action(visitorB);
	}
}
