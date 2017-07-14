package yyl.example.design_pattern.behavioral.mediator;

public class Colleague {

	private String name;
	private Mediator mediator;

	public Colleague(String name) {
		this.name = name;
	}

	// 在抽象同事类中添加用于与中介者取得联系（即注册）的方法  
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void notice(String name, String message) {
		if (mediator != null) {
			mediator.notice(name, message);
		}
	}

	public void receive(String message) {
		System.out.println(name + " <- " + message);
	}

	public String getName() {
		return name;
	}
}
