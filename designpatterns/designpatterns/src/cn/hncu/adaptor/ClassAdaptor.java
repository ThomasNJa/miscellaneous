package cn.hncu.adaptor;

public class ClassAdaptor extends Adaptee implements ITarget{

	@Override
	public void fly() {
		System.out.println("I can fly...");
	}
	
}
