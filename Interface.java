package practice;


//package Sample;
//
//interface Animal{
//	abstract void sound();
//	
//}
//class Horse implements Animal{
//	public void sound() {
//		System.out.println("Wooff Wooff");
//	}
//}
//public class Interface {
//	public static void main(String[]args) {
//		Horse h = new Horse();
//		h.sound();
//	}
//
//}


interface Animal{
	abstract void sound();
	
}
class Tiger implements Animal{
	public void sound() {
		System.out.println("Purrrr Purrr");
	}
}
public class Interface {
	public static void main(String[]args) {
		Tiger t = new Tiger();
		t.sound();
	}

}