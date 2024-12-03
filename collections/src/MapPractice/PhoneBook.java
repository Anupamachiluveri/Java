package MapPractice;
import java.util.*;
import java.util.Map.Entry;
public class PhoneBook {

	public static void main(String[] args) {
		Map<Double,String> phonebook = new LinkedHashMap<Double,String>();

		phonebook.put(0.9789654367, "anupama");
		phonebook.put(0.8976544566, "aparna");
		phonebook.put(0.9780987544, "mamatha");
		phonebook.put(0.7865344556, "supraja");
		phonebook.put(0.9789654360, "null");
		phonebook.put(0.9789676569, "harika");

		System.out.println(phonebook);

		Set<Entry<Double,String>> entries =phonebook.entrySet();
		for(Entry <Double, String> entry : entries ) {
			Double key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +"   "+ value);


		}
		System.out.println(phonebook.keySet());

		System.out.println(phonebook.values());

		phonebook.remove(0.9789676569, "harika");
		System.out.println(phonebook);

		//		phonebook.clear();
		//		System.out.println(phonebook);
		System.out.println(phonebook.containsValue("swarupa"));

		System.out.println(phonebook.containsKey(99754567));

		phonebook.put(0.9780987544, "swapna");
		phonebook.putIfAbsent(0.98875456,"teja");
		phonebook.replace(0.9780987544, "nandu");
		System.out.println(phonebook);
	}




}


