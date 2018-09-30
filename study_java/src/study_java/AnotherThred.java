package study_java;

public class AnotherThred extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Run hello from another thred");
	}

}
