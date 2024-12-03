package Abstraction;

public class User {
	public static void main(String[] args) {
		Laptop lenovo = new Lenovo();
		lenovo.paste();
		lenovo.copy();
		lenovo.keyboard();

		Laptop hp =new Hp();
		hp.copy();
		hp.paste();
	
		Asus asus = new Asus();
		asus.keyboard();
		asus.capture();
	}
}
