package in.com.rays.Thread;

public class TestAcccountThread {

	public static void main(String[] args) {
		
		AccountThread t1 = new AccountThread("Neha");
		AccountThread t2 = new AccountThread("naba");
		
		t1.start();
		t2.start();
	}
}
