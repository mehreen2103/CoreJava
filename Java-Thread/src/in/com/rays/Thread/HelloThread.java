package in.com.rays.Thread;

public class HelloThread extends Thread{
	
	private String name;
	
	public HelloThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for (int i = 1; i <=10; i++) {
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i + " = " + name);
		}
		
	}

}
