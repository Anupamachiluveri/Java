package MapPractice;
import java.util.*;
import java.util.Map.Entry;
public class Users {

	public static void main(String[] args) {
		//creation of userdetails
		Map<String, String> userdetails = new TreeMap<String,String>();

		// adding of userdetails

		userdetails.put("anupamachiluveri@gmail.com","anupama" );//username ,passward
		userdetails.put("swathitekumtla@gmail.com", "swathi");
		userdetails.put("rakesh234@gmail.com", null);
		userdetails.put("satish657@gmail.com", "resjdgdb");
		userdetails.put("subharedemi3@gmail.com", null);
		userdetails.put("swathitekumtla45@gmail.com", "swathi");
		userdetails.put("rameshtera@gmail.com", "utgfj");

		System.out.println(userdetails);

		System.out.println();
		//retrivel of keys(username)
		System.out.println(userdetails.keySet());//one method

		System.out.println();

		Set<String> entries =userdetails.keySet();//another method
		for(String  keys : entries) {
			System.out.println(keys);
		}

		System.out.println();

		//retrivel of values

		System.out.println(userdetails.values());

		System.out.println();

		Collection<String> values = userdetails.values();
		for(String value : values ) {
			System.out.println(value);
		}

		System.out.println();

		System.out.println(userdetails.get("anupamachiluveri@gmsail.com"));

		System.out.println();

		//entryset
		Set<Entry<String,String>> details = userdetails.entrySet();
		for(Entry<String,String> detail :details) {
			String key = detail.getKey();
			String value = detail.getValue();
			System.out.println(key+"---"+value);



		}

		System.out.println(userdetails.isEmpty());
		System.out.println(userdetails.size());


	}

}
