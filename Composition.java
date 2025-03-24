package Interface;

class Engine{  //Parent1 Class
	void start() {
		System.out.println("Engine is starting..");
	}
}
class Car{  //Parent2 Class
	Engine e = new Engine();
	void stop() {
		System.out.println("Engine is stoping..");
		e.start();
	}
}
class Moving{
	Car c = new Car();
	void move() {
		System.out.println("Engine is moving..");
		c.stop();
	}
}
public class Composition {
	public static void main(String[]args) {
		
		Moving m = new Moving();
		
		m.move();
	}
}
