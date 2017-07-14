package yyl.example.design_pattern.behavioral.visitor;

public class AssignTest {
	public static void main(String[] args) {

		Element elementA = new Element1();
		Element elementB = new Element2();
		VisitorA visitor = new VisitorA();

		visitor.accept(elementA);//静态分派
		visitor.accept(elementB);//静态分派
		visitor.accept((Element1) elementA);//静态分派
		visitor.accept((Element2) elementB);//静态分派
		elementA.accept(visitor);//双重分派
	}
}
