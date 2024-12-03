package ListPractice;
import java.util.*;
public class Fruits {

	public static void main(String[] args) {
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("mango");
		al2.add("apple");
		al2.add("banana");
		al2.add("grapes");
		Iterator itr = al2. iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		for(String fruit:al2) {
			System.out.println(fruit);

		}

		System.out.println(al2.get(0));
		al2.set(0, "orange");
		System.out.println(al2);
		for(String fruit:al2) {
			System.out.println(fruit);
		}
		Collections.sort(al2);
		System.out.println(al2);
	}

}
