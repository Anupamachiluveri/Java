package SetPractice;
import java.util.*;
public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet<Integer>  st = new TreeSet<Integer>();

		st.add(20);

		st.add(22);
		st.add(6);
		st.add(45);
		st.add(65);
		st.add(6);

		System.out.println(st);

		System.out.println(st.pollFirst());

		System.out.println(st.pollLast());

		System.out.println(st.first());

		System.out.println(st.last());

		System.out.println(st.subSet(20,60));

	}

}
