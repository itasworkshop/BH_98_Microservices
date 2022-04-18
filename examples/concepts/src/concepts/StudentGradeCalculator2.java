package concepts;

//POJO class
class Student2{
	 int rollno;
	 String name;
	 int marks;
	
	Student2(int rollno,String name,int marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}	
	
}

public class StudentGradeCalculator2 {
	
	public static void gradeCalculator(Student2 st) {
		if(st.marks>= 90 && st.marks<=100) {
			System.out.println("Student "+st.name+" scored "+ "Grade-A");
		}else if(st.marks>= 80 && st.marks<=90) {
			System.out.println("Student "+st.name+" scored "+ "Grade-B");
		}else if(st.marks>= 70 && st.marks<=80) {
			System.out.println("Student "+st.name+" scored "+ "Grade-C");
		}else {
			System.out.println("Student "+st.name+" scored "+ "Failed!");
		}
	}

	public static void main(String[] args) {
		Student2 st = new Student2(101,"Rajesh",87);
		gradeCalculator(st);

	}

}
