
public class Thread2 implements Runnable{

	public Thread2(){
		
	}
	
	@Override
	public void run() {
		
		boolean done=false;
	
		
		
		//while(!done){
			ThreadsMain.t2WantsToEnter=true;
			while(ThreadsMain.favoredThread==1){
				while(ThreadsMain.t1WantsToEnter);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.getMessage();
				}
				ThreadsMain.favoredThread=2;
				
			}
			
			System.out.println("Thread 2 in critical section");
			ThreadsMain.t2WantsToEnter=false;
			System.out.println("Thread 2 out of critical section");
			
		//}
	
	}
	
}
