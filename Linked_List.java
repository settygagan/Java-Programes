package Interface;
import java.util.List;
import java.util.LinkedList;

public class Linked_List {
	
	public static void main(String[] args) {
		List<String> heros = new LinkedList<>();
		System.out.println("My Linked List:"+heros);
		heros.add("Appu");
		heros.add("Sudeep");
		heros.add("Yash");
		heros.add("Yuva");
		heros.add("Upendra");
		
//		String temp = heros.get(0);
//		System.out.println("My Linked list After adding:"+temp);
		
		System.out.println("My Linked List After adding:"+heros);
		
		heros.remove(3);
		System.out.println("My Linked List After removing:"+heros);
		
		String temp = heros.get(0);
		System.out.println("My Linked List After adding:"+temp);
		
		for(String hero : heros) {
			System.out.println("My Linked List using Iterator:"+hero);
		}
		heros.add("Shivanna");
		System.out.println("My Linked list After adding:"+heros);
		
		((LinkedList<String>)heros).addFirst("Shivanna");
		((LinkedList<String>)heros).addLast("Nanu");
		System.out.println("My Linked list After adding:"+heros);
	}

}
