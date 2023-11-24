package MultiThreading;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main is executing");
		System.out.println(Thread.currentThread().getName());
		MyFirstThread t1=new MyFirstThread();
		MyFirstThread t2=new MyFirstThread();
		t1.setName("balaji");
		t2.setName("ashwin");
		t1.start();
		t2.start();

	}

}
