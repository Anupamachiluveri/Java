package MapPractice;
import java.util.*;
public class CityPincodes {

	public static void main(String[] args) {
		Map<Integer, String> pincodes = new HashMap<Integer,String>();

		pincodes.put(500081, "hitech city");
		pincodes.put(500075, "narsingh");

		pincodes.put(500032, "gachibowli");

		pincodes.put(500082, "hitech city");

		pincodes.put(500072, "kukatpally");
		pincodes.put(500087, "madhapur");
		pincodes.put(500049, "hafeezpet");
		pincodes.put(500038, "sr nagar");
		System.out.println(pincodes);


		Map<Integer, String> pincode = new HashMap<Integer,String>();

		pincode.put(67578,"karimnagar");
		pincode.put(500876,"siddipet");
		pincodes.putAll(pincode);

		System.out.println(pincodes);
		System.out.println();
		System.out.println(pincodes.size());
		System.out.println();

		//retrivel of keys

		Set <Integer>keys=pincodes.keySet();
		for(int pincodess : keys) {
			System.out.println(pincodess);
		}
		System.out.println();

		//Retrieval of values

		Collection<String> values = pincodes.values();
		for(String areas : values) {
			System.out.println(areas);
		}
		System.out.println();
		// retrivel of value from key
		System.out.println(pincodes.get(500081));
		//deletion of pincodes

		pincodes.remove(500072);
		System.out.println(pincodes);

		//verification of pincodes and areas

		System.out.println(pincodes.containsKey(500075));
		System.out.println(pincodes.containsValue("hitech city"));

		//updating

		pincodes.putIfAbsent(500076, "kokapet");
		pincodes.replace(500081, "suryapet");

		System.out.println(pincodes);
		System.out.println();
		for(Map.Entry m:pincodes.entrySet()){  
			System.out.println(m.getKey()+" ---"+m.getValue());  
		}  


	}



}


