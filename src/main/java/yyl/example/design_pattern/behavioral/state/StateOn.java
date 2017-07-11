package yyl.example.design_pattern.behavioral.state;

public class StateOn implements State {

	@Override
	public void pressSwich(Light context) {
		System.out.println("turn off the light.!");
		context.setState(new StateOff());
	}

	@Override
	public String toString() {
		return "On";
	}
}
