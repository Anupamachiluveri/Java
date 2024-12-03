package inheritance;

 public class TwoGsim {

	public  void Calling (){

		System.out.println("This feature is used for calling");
	}
	public void message() {
		System.out.println("This feature is used for messaging");

	}
}
class ThreeGsim extends TwoGsim{
	
	public void Internet(){
		System.out.println("This feature is used for internet access");
	}

}
class FourGsim extends ThreeGsim{
	public void volte() {
		System.out.println("This feature is used for hide speed and quality communication");
	}
}

