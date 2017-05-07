
public class ThreadsMain {
	
	public static void main(String[]args){
		
		Thread one=new Thread(new Thread1());
		Thread two=new Thread(new Thread2());
		two.start();
		one.start();
		
		
	}
	
	public static boolean t1WantsToEnter=false;
	public static boolean t2WantsToEnter=false;
	public static int favoredThread=1;
	
	

}
