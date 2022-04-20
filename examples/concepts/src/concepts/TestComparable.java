package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

//Comparable Interface --> for sorting purpose

class User implements Comparable{
	private int id;
	private String name;
	
	public User(int id, String name) {
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
		User other = (User) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Object o) {
		return this.getName().compareTo(((User) o).getName());
	}
	
	
	
}

public class TestComparable {

	public static void main(String[] args) {
		User u1 = new User(101,"Rajesh");
		User u2 = new User(102,"Suraj");
		User u3 = new User(103,"Adam");
		
		
		ArrayList<User> mylist = new ArrayList<User>();
		mylist.add(u3);
		mylist.add(u2);
		mylist.add(u1);
		
		ArrayList<Integer> mylist2 = new ArrayList<Integer>();
		
		mylist2.add(20);
		mylist2.add(30);
		mylist2.add(7);
		mylist2.add(3);
		
		System.out.println(mylist);
		
		Collections.sort(mylist);
		
		System.out.println(mylist);
		
		
	}

}
