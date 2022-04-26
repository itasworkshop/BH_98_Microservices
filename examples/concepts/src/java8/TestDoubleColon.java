package java8;

import java.util.Arrays;
import java.util.List;

class MyPrinter{
	
	public static String printMe(String s) {
		System.out.println(s);
		return s;
	}
}

public class TestDoubleColon {

	public static void main(String[] args) {
		List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,67);
		List<String> names = Arrays.asList("Rajesh","Raj","Suraj");
		
		System.out.println(mylist);
		
		//mylist.stream().filter(x -> x%2==0).forEach(System.out::println);
		names.stream().forEach(MyPrinter::printMe);
	}

}
