package yyl.example.design_pattern.creation.singleton;

public class Singleton4Test {

	public static void main(String[] args) {
		Singleton4 o1 = Singleton4.getInstance();
		Singleton4 o2 = Singleton4.getInstance();
		System.out.println("o1==o2 -> " + (o1 == o2));

		System.out.println("o1==streamClone(o1) -> " + (o1 == TestUtil.streamClone(o1)));

	}
}
