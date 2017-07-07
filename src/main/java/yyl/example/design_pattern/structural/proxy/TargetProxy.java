package yyl.example.design_pattern.structural.proxy;

/**
 * 代理类
 */
public class TargetProxy implements Target {

	private Target target;

	public TargetProxy() {
		target = new TargetImpl();
	}

	@Override
	public void execute() {
		System.out.println("::Before");
		target.execute();
		System.out.println("::After");
	}

}
