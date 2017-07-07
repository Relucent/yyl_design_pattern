package yyl.example.design_pattern.structural.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Target target = new TargetProxy();
		target.execute();
	}
}
