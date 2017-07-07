package yyl.example.design_pattern.structural.proxy;

/**
 * 实现接口的实体类
 */
public class TargetImpl implements Target {

	@Override
	public void execute() {
		System.out.println("TargetImpl::execute");
	}

}
