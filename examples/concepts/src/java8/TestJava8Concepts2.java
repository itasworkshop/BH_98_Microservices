package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Many changes in CollectionAPI

public class TestJava8Concepts2 {

	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,67);
		
		System.out.println(mylist);
		
		//foreach loop
		for (Integer i : mylist) {
			System.out.println(i);
		}
		
		mylist.forEach(null);
		
		mylist.stream();

	}

}
