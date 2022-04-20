package concepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//Linked list --> faster into insertion and deletion why because all items are doubly linked with each other

public class TestCollectionAPI2 {

	public static void main(String[] args) {
		//List<Integer> mylist = new LinkedList<Integer>(); //object containing integers
		List<Integer> mylist = new Vector<Integer>();
		
		mylist.add(100);
		mylist.add(20);
		mylist.add(30);
		
		System.out.println(mylist);

	}

}
