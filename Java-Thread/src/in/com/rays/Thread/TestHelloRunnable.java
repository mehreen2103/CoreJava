package in.com.rays.Thread;

public class TestHelloRunnable {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new HelloRunnable("Neha"));
		Thread t2 = new Thread(new HelloRunnable("Maha"));
		
		t1.start();
		t2.start();
		
	}

}
