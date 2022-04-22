package concepts;

class Pizza1{
	private int price;
	private String name;
	
	public Pizza1(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + ", name=" + name + "]";
	}
	
	public boolean equals(Object o) {
		if(o instanceof Pizza1 && this.getName()==((Pizza1) o).getName()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

public class TestEqualesMethod {

	public static void main(String[] args) {
		Pizza1 p1=new Pizza1(199,"Maegherita");
		Pizza1 p2=new Pizza1(199,"Maegherita");
		Pizza1 p3=new Pizza1(300,"Double Cheese");
		
		System.out.println(p1.equals(p2));

	}

}
