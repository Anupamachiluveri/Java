package FilterPractice;

public class Employee{
	
		String name;
		int id;
		double salary;
		int experience;
		
		public Employee(String name,int id,double salary,int experience) {
			this.name = name;
			this.id = id;
			this.salary = salary;
			this.experience = experience;
			
		}

		@Override
		public String toString() {
			return "[name=" + name + ", id=" + id + ", salary=" + salary + ", experience=" + experience + "]";
		}
		
		
	}


