package cn.hncu.observer;

import java.util.ArrayList;

public class Teacher implements Observer{
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private String name;
	private String phone;
	
	public Teacher(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		this.notifyStudent();
	}

	@Override
	public void registStudent(Object obj) {
		studentList.add((Student) obj);
	}

	@Override
	public void removeStudent(Object obj) {
		studentList.remove(obj);
	}

	@Override
	public void notifyStudent() {
		for (Student student : studentList) {
			student.update(this.phone);
		}
	}

}
