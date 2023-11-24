package MultiThreading;

public class MyFirstThread extends Thread {
	
	public void run() {
		System.out.println("my theread is excuting");
		System.out.println(Thread.currentThread().getName());
		
	}

}
