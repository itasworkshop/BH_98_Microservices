package java8;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyEvenOddFilter<Integer>{
	
	public boolean evenOdd(Integer i);
}

public class TestJava8Concepts4 {

	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,67);
		
		System.out.println(mylist);
		
		mylist.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
		
		//System.out.println(mylist);

	}

}
