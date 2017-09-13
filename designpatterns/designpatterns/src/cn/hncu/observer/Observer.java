package cn.hncu.observer;

public interface Observer {
	public void registStudent(Object obj);
	public void removeStudent(Object obj);
	public void notifyStudent();
}
