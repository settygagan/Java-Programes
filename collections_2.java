package Interface;
import java.util.List;
import java.util.ArrayList;

public class collections_2 {
	public static void main(String[]args) {
		List<String> fruits = new ArrayList<>();
		System.out.println("My fruits List Before Adding Elements:"+fruits);
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Watermelon");
		fruits.add("Pineapple");
		fruits.add("Kiwi");
		fruits.add("Muskmelon");
		fruits.add("Gauva");
		fruits.add("Papaya");
		fruits.add("Grapes");
		System.out.println("My fruits List After Adding Elements:"+fruits);
		fruits.remove(4);
		System.out.println("My fruits List After Removing Elements:"+fruits);
	}
}
