package cn.hncu.command;

public class Command2 implements Command {
	private Reciever reciever = new  Reciever();
	@Override
	public void execute() {
		reciever.setCurrentChannel(2);
	}

}
