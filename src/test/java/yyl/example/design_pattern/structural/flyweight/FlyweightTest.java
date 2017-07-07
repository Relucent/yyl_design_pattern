package yyl.example.design_pattern.structural.flyweight;

public class FlyweightTest {
	public static void main(String[] args) {
		FlyweightBean a1 = FlyweightBean.valueOf("A");
		FlyweightBean a2 = FlyweightBean.valueOf("A");
		System.out.println("a1 == a2 -> " + (a1 == a2));
	}
}
