package MapPractice;
import java.util.*;
import java.util.Map.Entry;
public class Employees {

	public static void main(String[] args) {
		Map<Integer,String> employeedetails = new Hashtable<Integer,String>();

		//adding employee deatils

		employeedetails  .put(101567 , "anupama");

		employeedetails .put(102765,"swathi");
		employeedetails .put(10487665, "subha");
		employeedetails .put(1027654,"swathi");

		employeedetails.put(1124545, "mahesh");

		employeedetails.put(118756, "mahesh");
		employeedetails.put(1170966, "naresh");

		System.out.println(employeedetails);

		//retrievel of employee keys

		System.out.println(	employeedetails.keySet());


		//retrievel  of values

		System.out.println(employeedetails.values());

		//retrivel of values from key 

		System.out.println(employeedetails.get(1170966));

		//deletion 
		employeedetails.remove(1170966);

		System.out.println(employeedetails);

		//verification

		System.out.println(employeedetails.containsKey(106767));
		System.out.println(employeedetails.containsValue("swathi"));

		//updation
		employeedetails.putIfAbsent(106767, "somesh");
		employeedetails.replace(102765, "mamatha");

		System.out.println(employeedetails);

		System.out.println(employeedetails.size());


		Set<Entry<Integer,String>> entries = employeedetails.entrySet();

		for(Entry<Integer,String> entry: entries) {
			Integer key =entry.getKey();

			String value = entry.getValue();
			System.out.println(key+ "---"+ value);


		}

	}

}
