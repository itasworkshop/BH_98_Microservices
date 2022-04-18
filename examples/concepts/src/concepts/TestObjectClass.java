package concepts;

//class --> blueprint for creating objects
//enquiry form -- template -- class

//object --> two terms --> 1) properties -- state
							//2) Functionality -- behaviour

class Student{
	
	int rollno;
	String name;
	
	Student(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	public void giveIntro() {
		System.out.println("Hi this is "+this.name);
	}
}

public class TestObjectClass {

	public static void main(String[] args) {
		Student st = new Student(101,"Rajesh");
		Student st2 = new Student(102,"Suraj");
		
		st.giveIntro();
		st2.giveIntro();

	}

}
