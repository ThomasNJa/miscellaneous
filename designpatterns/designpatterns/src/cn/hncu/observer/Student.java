package cn.hncu.observer;


public class Student implements Subject{
	private String name;
	private String teacherPhone;
	
	public Student(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	@Override
	public void update(Object obj) {
		this.teacherPhone=(String) obj;
	}
	
	public String showTeachePhone(){
		return this.getTeacherPhone();
	}

}
