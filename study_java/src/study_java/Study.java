package study_java;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Hellow  from main thread ");
	
	Thread anotherthread= new AnotherThred();
	
	anotherthread.start();
	}

}
