package java8;

//Major Changes in Java 8
//1) Lambda Function
//2) StreamAPI
//3) DateTimeAPI
//4) Existing Interface and collectionAPI

//Interface --> Functional Interface

interface RBIBank{
	
	public void calculateEMI(int basic); //abstract
}

class HDFCBank implements RBIBank{

	@Override
	public void calculateEMI(int basic) {
		System.out.println("EMI from HDFC bank.");
		
	}
	
}

class ICICIBank implements RBIBank{

	@Override
	public void calculateEMI(int basic) {
		System.out.println("EMI from ICICI bank.");
		
	}
	
}

public class TestJava8 {

	public static void main(String[] args) {
		HDFCBank obj1 = new HDFCBank();
		obj1.calculateEMI(20);

	}

}
