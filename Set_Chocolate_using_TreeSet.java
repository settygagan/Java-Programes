package Interface;
import java.util.Set;
import java.util.TreeSet;
public class Set_Chocolate_using_TreeSet {
	public static void main(String[]args) {
		TreeSet<String> chocolate = new TreeSet<>();
		System.out.println("My Empty List:"+chocolate);
		chocolate.add("Dairy Milk");
		chocolate.add("5 Star");
		chocolate.add("Kit Kat");
		chocolate.add("Silk");
		chocolate.add("Perk");
		chocolate.add("Temptation");
		
		
		System.out.println("My Empty set After adding:"+chocolate);
		

		
		for(String new1: chocolate) {
			System.out.println("My Empty Using for Loop:"+new1);
		}
	}
}
