package Interface;

class MyThread extends Thread { // thread class
    public void start() {
        int i = 0; 
        while (i < 5) { 
            System.out.println("Thread is Starting..." + i);
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread is Starting..." + e);
            }
            i++; // increment the counter
        }
    }
}


public class Threads_Whileloop {
	public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start();
        System.out.println("Thread is Completed...");
    }

}
