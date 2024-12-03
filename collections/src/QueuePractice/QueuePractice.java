package QueuePractice;
import java.util.*;
public class QueuePractice {
	public static void main(String[] args) {
		PriorityQueue<String> qp = new PriorityQueue<String>(Comparator.reverseOrder());
		qp.offer("anu");
		qp.add("somu");

		qp.offer("mamatha");

		qp.offer("nishma");

		qp.add("ravali");

		System.out.println(qp);

		qp.peek();
		System.out.println(qp.peek());

		System.out.println(qp.poll());
		System.out.println(qp);

		while(!qp.isEmpty()) {
			System.out.println(qp.poll());


		}

	}



}


