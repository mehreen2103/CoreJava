package in.com.rays.Thread;

public class TestHelloThread {

	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("Neha");
		HelloThread t2 = new HelloThread("Shivani");
		
		
		
		t1.start();
		t2.start();
	}
}
