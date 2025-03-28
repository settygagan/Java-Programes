package Interface;

public class Exception_handling3 {
public static void main(String[] args) {
		
		try {                                     //throws the exception or not
			int a = 10;
			int b = 0;
			int div = a/b;
			System.out.println("Division is:"+div);
		
		}
	    catch(ArithmeticException e){
	    	System.out.println("My Error:"+e);     //solving or debugging
	    }
//		finally {
//			System.out.println("My Error is solving...");        //always executing                              
//		}
		
	}

}