package yyl.example.design_pattern.behavioral.chainofresponsibility;

public class ChainOfResponsibilityTest {
	public static void main(String[] args) {
		Handler a = new HandlerImpl("A");
		Handler b = new HandlerImpl("B");
		Handler c = new HandlerImpl("C");

		a.setNext(b);
		b.setNext(c);
		c.setNext(null);

		a.invok("B");
	}
}
