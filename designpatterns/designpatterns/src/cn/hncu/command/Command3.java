package cn.hncu.command;

public class Command3 implements Command {
	private Reciever reciever = new  Reciever();
	@Override
	public void execute() {
		reciever.setCurrentChannel(3);
	}
}
