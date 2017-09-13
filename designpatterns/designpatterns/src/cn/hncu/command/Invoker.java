package cn.hncu.command;

public class Invoker {
	private Command command1 , command2 , command3;
	
	public Invoker(Command command1 , Command command2 , Command command3){
		this.command1 = command1;
		this.command2 = command2;
		this.command3 = command3;
	}
	
	public void command1(){
		command1.execute();
	}
	
	public void command2(){
		command2.execute();
	}
	
	public void command3(){
		command3.execute();
	}
}
