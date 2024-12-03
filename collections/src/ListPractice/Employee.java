package ListPractice;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("sonu");
		al.add("kavya");
		al.add("ramana");

		List<String> ll = new LinkedList<String>();
		//	adding of elements
		ll.add("anu");
		ll.add("anuaha");
		ll.add("madhu");
		ll.add("raju");
		ll.add(1,"yy");
		ll.addAll(al);
		System.out.println(ll);
		//removing of elementsA
		ll.remove(3);
		System.out.println(ll);
		((LinkedList<String>) ll).removeFirst();
		System.out.println(ll);
		((LinkedList<String>) ll).removeLast();
		System.out.println(ll);
		System.out.println(ll.get(0));

		System.out.println(ll.contains("madhu"));

		ll.set(1, "shalini");
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		Collections.synchronizedList(ll);


	}

}
