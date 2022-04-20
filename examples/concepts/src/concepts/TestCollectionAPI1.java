package concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Collection --> List,Set,Map and queue

//List --> just list of item, indexing, duplicates are allowed

public class TestCollectionAPI1 {
	int a = 10;
	Integer b = 20; //Integer wrapper classes

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>(); //object containing integers
		
		mylist.add(100);
		mylist.add(20);
		mylist.add(30);
		
		//System.out.println(mylist);
		
		//Collections.sort(mylist);
		
		//System.out.println(mylist);
		
		Iterator itr = mylist.iterator();
		
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
		//}
		
		for(Integer x:mylist) {
			System.out.println(x);
		}

	}

}
