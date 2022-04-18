package concepts;

//oops --> abstraction, encapsulation, polymorphism and inheritance
//POJO class
class Student3{
	 private int rollno;
	 private String name;
	 private int marks;
	
	Student3(int rollno,String name,int marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}	
	
}

public class StudentGradeCalculator3 {
	
	public static void gradeCalculator(Student3 st) {
		if(st.getMarks()>= 90 && st.getMarks()<=100) {
			System.out.println("Student "+st.getName()+" scored "+ "Grade-A");
		}else if(st.getMarks()>= 80 && st.getMarks()<=90) {
			System.out.println("Student "+st.getName()+" scored "+ "Grade-B");
		}else if(st.getMarks()>= 70 && st.getMarks()<=80) {
			System.out.println("Student "+st.getName()+" scored "+ "Grade-C");
		}else {
			System.out.println("Student "+st.getName()+" scored "+ "Failed!");
		}
	}

	public static void main(String[] args) {
		Student3 st = new Student3(101,"Rajesh",87);
		gradeCalculator(st);

	}

}
