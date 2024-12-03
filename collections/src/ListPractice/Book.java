package ListPractice;
import java.util.*;
public class Book{
	public static void main(String[] args) {
		Stack<String> book = new Stack<String>();
		//adding

		book.push("red");
		book.push("white");
		book.push("green");
		book.push("black");

		System.out.println(book.peek());
		System.out.println(book);

		System.out.println(book.pop());
		System.out.println(book);

		System.out.println(book.search("white"));
		System.out.println(book);
		System.out.println(book.indexOf("white"));

		System.out.println(book.empty());

		//update
		book.set(1, null);

		//Retrieval
		book.get(3); 
		System.out.println(book);

		//stack provide special methods they are push,pop,peek,search.

	}
}
