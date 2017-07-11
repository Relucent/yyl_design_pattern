package yyl.example.design_pattern.behavioral.state;

public class StateOff implements State {

	@Override
	public void pressSwich(Light context) {
		System.out.println("turn on the light.!");
		context.setState(new StateOn());
	}

	@Override
	public String toString() {
		return "Off";
	}
}
