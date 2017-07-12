package yyl.example.design_pattern.behavioral.chainofresponsibility;

public class HandlerImpl extends Handler {

	private String name;

	public HandlerImpl(String name) {
		this.name = name;
	}

	@Override
	public void invok(String target) {

		System.out.println("enter the " + name);

		if (name.equals(target)) {
			System.out.println("hit the target -> " + name);
		}

		if (next != null) {
			next.invok(target);
		} else {
			System.out.println("the chain ends");
		}
	}
}
