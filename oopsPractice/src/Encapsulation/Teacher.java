package Encapsulation;

public class Teacher {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Anupama");
		System.out.println("student name:" +student.getName());
		student.setId(20450213);
		System.out.println("student id:"+student.getId());
		student.setMarks(87);
		System.out.println("student marks:"+student.getMarks());
	}

}
