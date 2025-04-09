package Interface;
import java.util.Map;
import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		
		Map<String,Integer> colors = new HashMap<>();
		
		System.out.println("My Empty Map:"+colors);
		
		colors.put("Red", 1);
		colors.put("Black", 2);
		colors.put("Blue", 3);
		colors.put("Grey", 4);
		colors.put("White", 5);
		
		System.out.println("My Empty Map After Adding:"+colors);
		
		colors.remove("Grey");
		System.out.println("My Empty Map After Removing:"+colors);
		
		for(Map.Entry<String,Integer>entry : colors.entrySet()) {
			System.out.println("Keys:=>"+entry.getKey()+"Values:"+entry.getValue());
		}
		
	}

}
