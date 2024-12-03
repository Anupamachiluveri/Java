package ListPractice;
import java.util.*;
public class StudentDetails {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		System.out.println(v1);
		// adding of elements
		v1.add("Raju");
		v1.add("Somu");
		v1.add("Ramesh");
		v1.add(0,"jeevan");  //shifting
		System.out.println(v1);

		System.out.println(v1.size());
		System.out.println(v1.capacity());

		Vector v2 = new Vector();
		v2.add("swathi");
		v2.add("anu");
		v2.add("soumya");
		v2.add("jeevan");
		v1.addAll(0,v2);
		System.out.println(v1);

		//retrive of elements
		System.out.println(v1.get(1));

		//Deletion of elements

		v1.remove(0);
		v1.remove("anu");
		System.out.println(v1);

		v1.removeAll(v2);
		//to clear entire list 
		v1.clear();

		//verification of elements

		System.out.println(v1.contains("Ramesh"));
		System.out.println(v1.containsAll(v2));		
		//updation of elements

		v1.set(2, "harika");
		System.out.println(v1);

		System.out.println(v1.indexOf("harika"));
		System.out.println(v1.lastIndexOf("jeevan")); 

		System.out.println(v1.isEmpty());
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		Object[] arr= v1.toArray();
		System.out.println(Arrays.toString(arr));

		// generics: from 1.5 - you can specify data type. only specify wrapper classes
		// 1.0 - vector
		// 1.2 - collections


	}

}
