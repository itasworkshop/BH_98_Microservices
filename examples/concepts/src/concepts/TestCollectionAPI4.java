package concepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Map --> key-value pair

public class TestCollectionAPI4 {

	public static void main(String[] args) {
		Laptop l1 = new Laptop(101,"HP",35000);
		Laptop l2 = new Laptop(102,"Dell",45000);
		Laptop l3 = new Laptop(103,"Lenovo",25000);
		Laptop l4 = new Laptop(104,"Apple",55000);
		
		//Map<Integer,Laptop> mymap = new HashMap<Integer,Laptop>();
		Map<Integer,Laptop> mymap = new LinkedHashMap<Integer,Laptop>();
		//TreeMap
		
		mymap.put(111, l4);
		mymap.put(222, l3);
		mymap.put(333, l2);
		mymap.put(444, l1);
		
		//can i have empty key --> yes, how many --> only one latest one
		//mymap.put(null, l4);
		//mymap.put(null, l3);
		
		//can i have duplicate key in map --> No because keys are set
		//mymap.put(444, l4);
		
		//HashMap --> no ordering
		System.out.println(mymap);
		
		System.out.println(mymap.get(333));
		
		
		for(Integer x:mymap.keySet()) {
			System.out.println(mymap.get(x));
		}

	}

}
