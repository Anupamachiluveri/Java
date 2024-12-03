package predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Manager {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee("john", 50000,5));

		empList.add(new Employee("swathi", 70000,5));

		empList.add(new Employee("harika", 30000,3));

		empList.add(new Employee("padma", 20000,2));

		empList.add(new Employee("smita", 60000,4));

		Predicate<Employee> pr = e->e.salary>40000 && e.experience>3;

		for(Employee emp:empList) {

			if(pr.test(emp)) {

				System.out.println("employee name is: "+ emp.name+" and "+"employee salary is :"+ emp.salary);

			}
		}


	}

}
