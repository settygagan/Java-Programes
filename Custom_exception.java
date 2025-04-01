// 5types in exception, try, catch, finally, throw, throws

package Interface;

class NanuException extends Exception{
	public NanuException(String msg) {  // constructor
		super(msg);
	}
}
public class Custom_exception {
	public static void main(String[] args) {
		try {
//			throw new NanuException("My message");
			checkNumber(10);
		}
		catch(NanuException e) {
			System.out.println("My Custom Error:"+e);
		}
		finally {
			System.out.println("My Custom Error is created");
		}
	}
	
	public static void checkNumber(int number) throws NanuException{
		if(number>5) {
			throw new NanuException("Number is above 5");
		}
	}
}
