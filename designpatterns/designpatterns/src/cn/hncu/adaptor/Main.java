package cn.hncu.adaptor;

public class Main {

	public static void main(String[] args) {
		//��������
		ClassAdaptor classAdaptor = new ClassAdaptor();
		classAdaptor.run();
		classAdaptor.fly();
		
		//����������
		ObjectAdaptor objectAdaptor = new ObjectAdaptor();
		objectAdaptor.run();
		objectAdaptor.fly();
	}

}
