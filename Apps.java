//implementation of abstraction
package practice;
import java.util.Scanner;

abstract class Softwares{ //Abstract class
	String user_name;
	String password;
	
	void user_input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username: ");
		user_name = s.nextLine();
		System.out.println("Enter Password: ");
		password = s.nextLine();
	}
	
	void user_login(){
		System.out.println("WELCOME TO INSTAGRAM");
		System.out.println("--------------------");
		System.out.println("Please login here...!!");
	}
	
	abstract void app_open(); //Abstract method
}
class Instagram extends Softwares{ //child class
	@Override
	void app_open() {
		if(user_name.equals("Pawan") && password.equals("1234")) {
			System.out.println("Successfully Login Completed");
		}else {
			System.out.println("Invalid username and password");
		}
	}
	
}

public class Apps {
	public static void main(String[] args) {
		Instagram i = new Instagram();
		i.user_login();
		i.user_input();
		i.app_open();
	}
		
}