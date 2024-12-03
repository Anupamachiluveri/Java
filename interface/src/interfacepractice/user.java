package interfacepractice;

public class user {
public static void main(String[] args) {
	Lenovo L = new Lenovo();
	L.copy();
	L.paste();
	L.camera();
	L.security();
	Laptop.audio();
	
	HP hp = new HP();
	hp.cut();
	hp.printing();
	Laptop.audio();
	
	//until java 7 is only indicates what to do but in java 8 it indicates how to do.
	
	// from java 9 java provides private modifier.
}
}
