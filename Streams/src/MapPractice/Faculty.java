package MapPractice;

import java.util.*;
import java.util.stream.Collectors;
public class Faculty {

	public static void main(String args[]) 
	{

		ArrayList<Student> studentList1 = new ArrayList<>();

		studentList1.add(new Student("swapna",100,98));
		studentList1.add(new Student("surendhar",101,98));
		studentList1.add(new Student("karna",102,85));


		ArrayList<Student> studentList2 = new ArrayList<>();

		studentList2.add(new Student("ahalya",103,55));
		studentList2.add(new Student("sahithi",104,45));
		studentList2.add(new Student("john",105,58));
		List<List<Student>> studentFinalList = Arrays.asList(studentList1,studentList2);


		Map<Integer,Integer> studentdetails=studentFinalList.stream().flatMap(n->n.stream()).filter(m->m.getStudentMarks()<60).collect(Collectors.toMap(m->m.getStudentId(),m->m.getStudentMarks()+5));
		System.out.println(studentdetails);

		//by using count()
		long count=	studentFinalList.stream().count();
		System.out.println(count);

		//By using distinct()

		studentFinalList.stream().distinct().forEach(m->System.out.println(m));

		//By using sorted()
		List<Student> sortedList=studentList1.stream().sorted((v1,v2)->v1.getStudentName().compareTo(v2.getStudentName())).collect(Collectors.toList());

		System.out.println(sortedList);

		//By using Parallal stream()

		studentList2.parallelStream().limit(2).forEach(s->System.out.println(s));
	}


}



