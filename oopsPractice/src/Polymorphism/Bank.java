package Polymorphism;

class Bank {
	public int getIntrestRate(){
		return 0;

	}
}
class SBI extends Bank{
	public int getIntrestRate() {
		return 8;

	}
}
class AXIS extends Bank{
	public int getIntrestRate() {
		return 4;
	}
}
class UNION extends Bank{
	public int getIntrestRate() {
		return 9;
	}
}