package Function;

import java.util.ArrayList;
import java.util.function.Function;

public class Manager{

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<>();

		empList.add(new Employee("john",4000));
		empList.add(new Employee("pavan",9000));
		empList.add(new Employee("rakesh",10000));
		empList.add(new Employee("swathi",15000));

		//based on the salary bonus is given

		Function<Employee,Integer> f = e-> {
			int Salary = e.salary;
			if(Salary>=1000&&Salary<2000)
				return (Salary*10/100);
			else if(Salary>=3000&&Salary<5000)
				return (Salary*20/100);
			else if(Salary>=8000&&Salary<16000)
				return (Salary*30/100);
			return Salary;
		};
		for(Employee em :empList) {
			int bonus =	f.apply(em);

			System.out.println(em.name+" "+em.salary);

			System.out.println("bonus is"+bonus);
		}
	}

}


