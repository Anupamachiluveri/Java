package Polymorphism;

 class Bike {
   public void Driving() {
	   System.out.println("This vehicles are conventional vehicles Uses ICE");
   }

   }

class Scooty extends Bike{
	public void Driving() {
		 System.out.println("This car is electical car uses electical power");
		 
	}
}
public class vehicle{
	public static void main(String[] args) {
		Bike bike = new Bike();
		Scooty  scooty = new Scooty ();
		bike.Driving();
		scooty.Driving();
	}
}
// Runtime polymorphism