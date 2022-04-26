package java8;

import java.util.Arrays;
import java.util.List;

//Stream API

public class TestStreamAPI {

	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,67);
		
		List<String> mylist1 = Arrays.asList("rajesh","suraj","Tom");
		
		System.out.println(mylist);
		//mylist.stream().forEach(x -> System.out.println(x));
		
		//Map,Reduce and Filter
		//Map -> mapping input to respective output after applying function on each items
		//mylist.stream().map(x -> x*x).forEach(y -> System.out.println(y));
		
		Integer result = mylist.stream().reduce((x,y) -> x+y).get();
		//System.out.println(result);
		
		mylist.stream().filter(x -> x%2==0).forEach(i -> System.out.println(i));

	}

}
