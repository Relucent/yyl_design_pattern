package yyl.example.design_pattern.creation.singleton;

public class Singleton6Test {

	public static void main(String[] args) {
		Singleton6 o1 = Singleton6.INSTANCE;
		Singleton6 o2 = TestUtil.streamClone(o1);
		System.out.println("o1==streamClone(o1) -> " + (o1 == o2));
	}

}
