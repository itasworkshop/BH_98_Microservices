package concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Pizza{
	private int price;
	private String name;
	
	public Pizza(int price, String name) {
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
	
	
}

public class PizzaApplication {
	
	public static void calculateTotal(Pizza p,int quanityt) {
		
	}

	public static void main(String[] args) {
		Pizza p1=new Pizza(199,"Maegherita");
		Pizza p2=new Pizza(250,"Pepper");
		Pizza p3=new Pizza(300,"Double Cheese");
		
		/*
		Map<Integer,Pizza> pizzas = new HashMap<Integer,Pizza>();
		pizzas.put(11, p1);
		pizzas.put(12,p2);
		pizzas.put(13, p3);
			
		System.out.println("******Welcome to Pizza Application*****");
		System.out.println("***Please select your favourite pizza out of below menu!");
		
		System.out.println(pizzas);
		
		Scanner in = new Scanner(System.in);
		int srnu = in.nextInt();
		
		Pizza selectedPizza =  pizzas.get(srnu);
			
		System.out.println("You selected "+ selectedPizza.getName() +" which is of INR "+selectedPizza.getPrice());

		System.out.println("How many pizza do you want? ");
		
		int quantity = in.nextInt();
		
		int total = selectedPizza.getPrice()*quantity;
		
		System.out.println("You selected "+quantity +" of "+ selectedPizza.getName() +" which is of INR "+total);

		System.out.println("Yout total bill is of "+total);
		
		System.out.println("Thanks for ordering your favorite Pizza, please visit again!");
		*/
	}

}
