package lambdaExpressions;

public class Teacher {

	public static void main(String[] args) {

		Student1 student1 = new Student1();
		student1.Details(12, 34);

		Student student = (studentId,studentMarks) -> 	{
			System.out.println("please give the student details"+"-"+studentId+","+studentMarks);
			return ("Naresh");
		};
		System.out.println(student.Details(12, 34));

	}

}
