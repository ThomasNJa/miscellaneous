package cn.hncu.observer;

public class Main {

	public static void main(String[] args) {
		Teacher t = new Teacher("��ʦ");
		
		Student s1 = new Student("С��");
		Student s2 = new Student("С��");
		Student s3 = new Student("С��");		
		
		t.registStudent(s1);
		t.registStudent(s2);
		t.registStudent(s3);
		
		t.setPhone("123456789");
		
		System.out.println(s1.getTeacherPhone());
		System.out.println(s2.getTeacherPhone());
		System.out.println(s3.getTeacherPhone());
	}

}
