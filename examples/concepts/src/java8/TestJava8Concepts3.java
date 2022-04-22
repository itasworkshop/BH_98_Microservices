package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Lambda --> implentation of Functional Interface
//Functional Interface --> exact one method to implement

class Computer{
	private int price;
	private String cname;
	
	public Computer(int price, String cname) {
		super();
		this.price = price;
		this.cname = cname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Computer [cname=" + cname + "]";
	}

	/*
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getCname().compareTo(((Computer) o).getCname());
	}
	*/
}

public class TestJava8Concepts3 {

	public static void main(String[] args) {
		//List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,67);
		
		Computer cmp1 = new Computer(10000,"Dell");
		Computer cmp2 = new Computer(40000,"Lenovo");
		Computer cmp3 = new Computer(20000,"Apple");
		Computer cmp4 = new Computer(70000,"HP");
		
		ArrayList<Computer> mylist = new ArrayList<Computer>();
		
		mylist.add(cmp4);
		mylist.add(cmp2);
		mylist.add(cmp1);
		mylist.add(cmp3);
		
		System.out.println(mylist);
		
		// () -> {}
		
		/*
		Collections.sort(mylist,
				(Computer o1,Computer o2) -> { return o1.getCname().compareTo(o2.getCname());});
				*/
		Collections.sort(mylist,
				(Computer o1,Computer o2) -> o1.getCname().compareTo(o2.getCname()));
		
		System.out.println(mylist);
	}
}
