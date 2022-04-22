package java8;

//static and default methods were introduced from java 8 onwards

interface RBIBank1{
	
	default void calculateEMIOld(int basic) {
		System.out.println("Hello from deafult interface method.");
	}
	
	public void calculateEMI(int basic); //abstract
	
	static int takeLoan() {
		return 10;
	}
}

class HDFCBank1 implements RBIBank1{

	@Override
	public void calculateEMI(int basic) {
		System.out.println("EMI from HDFC bank.");
		
	}
	
	/*
	public void calculateEMIOld(int basic) {
		System.out.println("Hello from deafult's new specific interface method.");
	}*/
	
}

public class TestJava8Concepts1 {

	public static void main(String[] args) {
		HDFCBank1 obj1 = new HDFCBank1();
		obj1.calculateEMI(20);
		obj1.calculateEMIOld(20);
		System.out.println(RBIBank1.takeLoan());

	}

}
