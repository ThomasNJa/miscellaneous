package cn.hncu.singleton;

/**
 * µ¥Àý
 * @author u0125
 *
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}
