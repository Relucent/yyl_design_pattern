package yyl.example.design_pattern.creation.singleton;

public class Singleton5Test {

	public static void main(String[] args) {
		Singleton5 o1 = Singleton5.INSTANCE;
		Singleton5 o2 = TestUtil.streamClone(o1);

		System.out.println("o1==streamClone(o1) -> " + (o1 == o2));
	}

}
