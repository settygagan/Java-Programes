// collections in java: list,set,map,array, and linked list
package Interface;

import java.util.List;
import java.util.ArrayList;

public class Collections {
	public static void main(String[]args) {
		List<Integer> numbers = new ArrayList<>();
		System.out.println("My numbers List before Adding Elements:"+numbers);
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		System.out.println("My numbers List After Adding Elements:"+numbers);
		numbers.remove(2);
		System.out.println("My numbers List After Remove Adding Elements:"+numbers);
		
		for(int num:numbers) {
			System.out.println("My numbers List Using Iterator:"+num);
		}
	}
}
