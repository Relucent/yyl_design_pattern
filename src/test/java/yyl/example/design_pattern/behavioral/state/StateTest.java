package yyl.example.design_pattern.behavioral.state;

public class StateTest {
	public static void main(String[] args) {
		Light light = new Light();

		System.out.println(light.getState());

		light.pressSwich();
		System.out.println(light.getState());

		light.pressSwich();
		System.out.println(light.getState());

		light.pressSwich();
		System.out.println(light.getState());
	}
}
