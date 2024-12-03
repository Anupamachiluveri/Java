package inheritance;

public class User {

	public static void main(String[] args) {
		TwoGsim two = new TwoGsim();
			
		two.Calling();
		two.message();
		System.out.println();
		ThreeGsim three = new ThreeGsim();
		three.Calling();
		three.message();
		three.Internet();
		System.out.println();
		FourGsim four = new FourGsim();
		four.Calling();
		four.message();
		four.Internet();
		four.volte();

	}

}
