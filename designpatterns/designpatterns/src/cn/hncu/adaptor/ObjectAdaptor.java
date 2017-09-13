package cn.hncu.adaptor;

public class ObjectAdaptor implements ITarget{
	
	Adaptee adaptee = new Adaptee();
	
	@Override
	public void fly() {
		System.out.println("I can fly...");
	}

	@Override
	public void run() {
		adaptee.run();
	}
	
}
