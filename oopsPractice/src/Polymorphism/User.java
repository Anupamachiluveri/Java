package Polymorphism;

public class User {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		AXIS axis = new AXIS();
		UNION union = new UNION();
		
		 System.out.println("sbi bank giving intrestrate is:"+sbi.getIntrestRate());
		 
		 System.out.println("axis bank giving intrestrate is:"+axis.getIntrestRate());
		 
		 System.out.println("union bank giving intrestrate is:"+union.getIntrestRate());
	}

}
