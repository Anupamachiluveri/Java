package Polymorphism;

public class Calculations {
	
public int add(int a,int b) {
	return a+b;
	
}

public int add(int a,int b ,int c) {
	return a+b+c;
}


public static void main(String[] args) {
	
	Calculations calculations = new Calculations();
	

	
	System.out.println(calculations.add(10, 50));
	
	System.out.println(calculations.add(10, 50,80));
}

}
//Compile-time polymorphism