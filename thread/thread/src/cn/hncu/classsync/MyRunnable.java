package cn.hncu.classsync;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		synchronized (MyRunnable.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		}
	}

}
