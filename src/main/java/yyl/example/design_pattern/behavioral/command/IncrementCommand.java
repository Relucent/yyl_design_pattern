package yyl.example.design_pattern.behavioral.command;

/**
 * 具体命令类(递增命令)。
 */
public class IncrementCommand implements Command {

	// 具体命令类包含有一个接收者，将这个接收者对象绑定于一个动作
	private Receiver receiver;

	public IncrementCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.increment();
	}

}
