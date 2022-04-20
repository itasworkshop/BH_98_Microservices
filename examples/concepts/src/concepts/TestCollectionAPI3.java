package concepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

class Laptop{
	private int sno;
	private String cname;
	private int price;
	
	public Laptop(int sno, String cname, int price) {
		super();
		this.sno = sno;
		this.cname = cname;
		this.price = price;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [sno=" + sno + ", cname=" + cname + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cname, price, sno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(cname, other.cname) && price == other.price && sno == other.sno;
	}
}

public class TestCollectionAPI3 {

	public static void main(String[] args) {
		Laptop l1 = new Laptop(101,"HP",35000);
		Laptop l2 = new Laptop(102,"Dell",45000);
		Laptop l3 = new Laptop(103,"Lenovo",25000);
		Laptop l4 = new Laptop(104,"Apple",55000);
		
		//Laptop l4 = new Laptop(103,"Lenovo",25000);
		
		//Set<Laptop> myset = new HashSet<Laptop>();
		Set<Laptop> myset = new LinkedHashSet<Laptop>();
		//TreeSet
		
		myset.add(l4);
		myset.add(l1);
		myset.add(l2);
		myset.add(l3);
		
		//HashSet items are unordered and unique
		//LinkedHashSet --> Oredered version of set
		System.out.println(myset);

	}

}
