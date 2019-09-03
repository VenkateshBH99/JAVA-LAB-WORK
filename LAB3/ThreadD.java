import java.util.Scanner;

class Multi extends Thread{
	
	public void run(){
		for (int i=0;i<10;i++) {
          
			System.out.println(Thread.currentThread().getName()+":"+i);
        try{
        	Thread.sleep(1000);

        }catch(InterruptedException e){
        	System.out.println(e);
        }
		}
	}
}
class ThreadD{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Multi m1=new Multi();
		Multi m2=new Multi();
		m1.setName("Thread1");
		m2.setName("Thread2");
		m1.start();
		m2.start();

	}
}