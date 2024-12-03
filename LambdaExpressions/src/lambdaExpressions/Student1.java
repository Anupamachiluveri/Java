package lambdaExpressions;

public class Student1 implements Student {

	@Override
	public String Details(int studentId, int studentMarks) {
		System.out.println("please give the student details"+ " -"+studentId+ " ,"+ studentMarks);
		return ("Naresh");
	}

}
