package SetPractice;
import java.util.*;
public class LinkedHashSetPractice {

	public static void main(String[] args) {


		Set<String> sl = new LinkedHashSet<String>();

		sl.add("subha");
		sl.add("rohini");
		sl.add("umesh");
		sl.add("ragava");

		Set<String> s2 = new LinkedHashSet<String>();

		s2.add("subha");
		s2.add("rohith");
		s2.add("umeshwari");
		s2.add("ragava");
		s2.add(null);
		s2.addAll(sl);

		System.out.println(s2);


		System.out.println(s2.size());
		System.out.println(s2.isEmpty());
		s2.remove("subha");

		System.out.println(s2);
		s2.contains("rohini");

		for(String str: s2) {
			System.out.println(str);
		}
	}
}