package cn.hncu.objsync;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
		}
	}

}
