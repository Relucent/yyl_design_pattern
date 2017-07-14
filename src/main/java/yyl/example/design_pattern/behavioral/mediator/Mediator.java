package yyl.example.design_pattern.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class Mediator {

	//中介者肯定需要保持有若干同事的联系方式  
	private Map<String, Colleague> colleagues = new HashMap<>();

	//增加一个同事
	public void addColleague(Colleague colleague) {
		colleague.setMediator(this); //建立起同事与中介者的联系  
		colleagues.put(colleague.getName(), colleague);
	}

	public void notice(String name, String message) {
		Colleague colleague = colleagues.get(name);
		if (colleague != null) {
			colleague.receive(message);
		}
	}

}
