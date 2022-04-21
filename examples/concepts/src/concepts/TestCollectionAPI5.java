package concepts;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TestCollectionAPI5 {

	public static void main(String[] args) {
		User u1 = new User(101,"Rajesh");
		User u2 = new User(102,"Bajaj");
		User u3 = new User(103,"Adam");
		
		//Tree
		Set<User> mylist = new TreeSet<User>();
		mylist.add(u3);
		mylist.add(u2);
		mylist.add(u1);
		
		System.out.println(mylist);

	}

}
