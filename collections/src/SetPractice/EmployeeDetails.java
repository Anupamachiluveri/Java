package SetPractice;
import java.util.*;
public class EmployeeDetails {

	public static void main(String[] args) {
		// employee data
		// creation of set

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("subha");
		ar.add("anu");

		HashSet<String> hs = new HashSet<String>(ar);

		//adding of elements


		hs.add("suresh");
		hs.add("ramesh");
		hs.add("naresh");
		hs.add("pavani");
		hs.add("suresh");
		hs.add("swathi");

		hs.add(null);
		System.out.println(hs);


		//removoing of elements

		hs.remove("swathi");

		System.out.println(hs);

		for(String str: hs) {
			System.out.println(str);
		}



	}

}
