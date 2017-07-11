package yyl.example.design_pattern.behavioral.state;

/**
 * 电灯类 (Context类)
 */
public class Light {

	private State state;

	public Light() {
		state = new StateOff();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	/**
	 * 按下电灯开关
	 */
	public void pressSwich() {
		state.pressSwich(this);
	}

}
