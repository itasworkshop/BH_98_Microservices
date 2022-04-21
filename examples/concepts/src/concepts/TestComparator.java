package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

//Comparator --> sorting when we can not change User class

class User1 {
	private int id;
	private String name;
	
	public User1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User1 other = (User1) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}

class MyUserComparator implements Comparator{

	@Override
	/*
	public int compare(Object o1, Object o2) {
		return ((User1) o1).getName().compareTo(((User1) o2).getName());
	}*/
	
	public int compare(Object o1, Object o2) {
		if(((User1) o1).getId() > ((User1) o2).getId()){
			return 2;
		}else if (((User1) o1).getId() < ((User1) o2).getId()) {
			return -2;
		}else {
			return 0;
		}
	}
}
public class TestComparator {

	public static void main(String[] args) {
		User1 u1 = new User1(121,"Rajesh");
		User1 u2 = new User1(92,"Suraj");
		User1 u3 = new User1(103,"Adam");
		
		
		ArrayList<User1> mylist = new ArrayList<User1>();
		mylist.add(u3);
		mylist.add(u2);
		mylist.add(u1);
		
		System.out.println(mylist);
		
		Collections.sort(mylist,new MyUserComparator());
		
		System.out.println(mylist);
	}

}
