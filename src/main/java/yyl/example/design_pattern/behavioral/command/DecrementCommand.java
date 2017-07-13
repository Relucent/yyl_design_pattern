package yyl.example.design_pattern.behavioral.command;

/**
 * 具体命令类 (递减命令)
 */
public class DecrementCommand implements Command {

	// 具体命令类包含有一个接收者，将这个接收者对象绑定于一个动作
	private Receiver receiver;

	public DecrementCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.decrement();
	}

}
