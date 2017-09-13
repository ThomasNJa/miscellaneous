package cn.hncu.thread;

public class Test {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable, "A");
		Thread t2 = new Thread(myRunnable, "B");
		t1.start();
		t2.start();
	}

}
