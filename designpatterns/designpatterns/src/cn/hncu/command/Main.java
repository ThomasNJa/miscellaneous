package cn.hncu.command;

public class Main {
	public static void main(String[] args) {
		Command command1 = new Command1();
		Command command2 = new Command2();
		Command command3 = new Command3();
		Invoker invoker = new Invoker(command1, command2, command3);
		invoker.command1();
		invoker.command2();
		invoker.command3();
	}
}
