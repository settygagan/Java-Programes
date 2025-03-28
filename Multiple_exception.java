package Interface;

public class Multiple_exception {
	public static void main(String[]args) {
		try {
			//ArithmeticException --1
			int div = 10/0;
			
			//ArrayIndexoutofBoundsException --2
			int[]numbers = {1,2,3,4,5};
			System.out.println("My numbers:"+numbers[10]);
			
			//String Index out of Bounds Exception --3
//			String name = "Gangadhar";
//			System.out.println("My name:"+name.charAt(15));
			
			//Null Pointer Exception
			String a = null;
			System.out.println("My String:"+a.length());

			
		}catch(ArithmeticException e) {
			System.out.println("My first:"+e);

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("My second:"+e);
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("My third:"+e);
			
		}catch(NullPointerException e) {
			System.out.println("My fourth:"+e);	
		}
		finally{
			System.out.println("My four errors solving......");	
		}
	}
}
