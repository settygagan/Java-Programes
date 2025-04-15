package Interface;

class MyThread extends Thread{      // thread class
	public void start() {
//		System.out.println("Thread is Starting...");
		for(int i = 0;i<5;i++) {
			System.out.println("Thread is Starting..."+i);
			
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				System.out.println("Thread is Not Starting..."+e);
			}
		}
	}
}

public class Threads {              // main class
	public static void main(String[]args) {
		MyThread m1 = new MyThread();
		m1.start();
		System.out.println("Thread is Completed...");
	}
}