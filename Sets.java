package Interface;
import java.util.Set;
import java.util.HashSet;
public class Sets {
	public static void main(String[]args) {
		Set<String> gods = new HashSet<>();
		System.out.println("My Empty List:"+gods);
		gods.add("Ganesha");
		gods.add("Rama");
		gods.add("Krishna");
		gods.add("Laxman");
		gods.add("Bharath");
		gods.add("Bharath");
		gods.add(null);
		gods.add(null);
		
		System.out.println("My Empty set After adding:"+gods);
		
//		gods.remove(1);
//		System.out.println("My Empty set After removing:"+gods);
		
		for(String new1: gods) {
			System.out.println("My Empty Using for Loop:"+new1);
		}
	}
}
