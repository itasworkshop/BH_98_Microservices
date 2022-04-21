package concepts;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestCollectionAPI6 {

	public static void main(String[] args) {
		User u1 = new User(101,"Rajesh");
		User u2 = new User(102,"Bajaj");
		User u3 = new User(103,"Adam");
		
		//TreeMap is sorted map based on key
		Map<User,Integer> mylist = new TreeMap<User,Integer>();
		mylist.put(u3,34);
		mylist.put(u1,67);
		mylist.put(u2,22);
		//mylist.put(null,22);
		
		System.out.println(mylist);
	}

}
