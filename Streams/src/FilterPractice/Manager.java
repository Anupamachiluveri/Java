package FilterPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

	public static void main(String[] args) {

		List<Employee> empData = new ArrayList<Employee>();


		empData.add(new Employee("Anupama",201,50000,2));

		empData.add(new Employee("nagesh",206,30000,1));

		empData.add(new Employee("uma",209,70000,4));

		empData.add(new Employee("ravali",205,80000,5));

		empData.add(new Employee("Anupama",202,60000,5));


	empData.stream().filter(employe->employe.salary>50000&&employe.experience>2).forEach(e->System.out.println(e));
	
	
		
	}

}


