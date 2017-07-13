package yyl.example.design_pattern.behavioral.command;

/**
 * 调度类，要求该命令执行这个请求
 */
public class Invoker {

	private Command command;

	/**
	 * 设置命令
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 执行命令
	 */
	public void executeCommand() {
		command.execute();
	}
}
