package practice;
class Modi{
	public int a = 100;
	protected int b = 200;
	int c = 300;//default
	private String name; // private
	
	public String getName() { //getter method
		return name;
		
	}
	public void setName(String name) {//setter method
		this.name = name;
	}

}

public class Modifiers{ //Main Class
	//public int a = 100;     wont work
	public static int a = 100;
	protected int b = 200;
	int c = 300; //default
	private String name = "Pawan"; // private  *concept of encapsulation
	
	public static void main(String[] args) {
		Modifiers obj = new Modifiers();
		System.out.println("a value is:"+obj.a);
		System.out.println("b value is:"+obj.b);
		System.out.println("c value is:"+obj.c);
		System.out.println("MY name  is:"+obj.name);
		
		
		                             
		Modi m = new Modi();      //user define class object
		System.out.println("a value is:"+m.a);
		System.out.println("b value is:"+m.b);
		System.out.println("c value is:"+m.c);
		
		m.setName("PAWAN");
		System.out.println("MY name  is:"+m.getName());

		
		 

	}
	

}