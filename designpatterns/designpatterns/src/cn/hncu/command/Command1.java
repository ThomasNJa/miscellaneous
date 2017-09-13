package cn.hncu.command;

public class Command1 implements Command {
	private Reciever reciever = new  Reciever();
	@Override
	public void execute() {
		reciever.setCurrentChannel(1);
	}

}
