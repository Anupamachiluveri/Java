package Encapsulation;

public class Custumer {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setAccountNumber(1098365673);
		bank.setName("rajaiah");
		bank.setAmount(5000);

		System.out.println(bank.getAccountNumber()+" -"+bank.getName()+":"+bank.getAmount());
	}

}
