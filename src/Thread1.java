
public class Thread1 implements Runnable {

	public Thread1(){
		
	}
	
	@Override
	public void run() {
		
		boolean done=false;
		
		
		
		//while(!done){
			ThreadsMain.t1WantsToEnter=true;
			while(ThreadsMain.favoredThread==2){
				while(ThreadsMain.t2WantsToEnter);
				ThreadsMain.favoredThread=1;
				
			}
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			System.out.println("Thread 1 in critical section");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
			ThreadsMain.t1WantsToEnter=false;
			System.out.println("Thread 1 out of critical section");
			
		//}
	
	}

}
