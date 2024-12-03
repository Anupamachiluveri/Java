package numbers;

public class Evennumer {

	public static void main(String[] args) {
		int number = 10;
		even(number);

	}

	public static void even(int number) {
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}

}
