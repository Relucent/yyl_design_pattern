package yyl.example.design_pattern.structural.adapter;

/**
 * 适配器类，适配器把源接口转换成目标接口。
 */
public class Adaper implements Target {

	private Adaptee adaptee;

	public Adaper(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void execute() {
		adaptee.call();
	}

}
