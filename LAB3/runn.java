class Multith implements Runnable{
	

	public void run(){
		for (int i=0;i<10 ;i++ ) {
					System.out.println(Thread.currentThread().getName()+":"+i);
        try{
        	Thread.sleep(1000);

        }catch(InterruptedException e){
        	System.out.println(e);
        
		}
	}
}
}

public class runn{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Multith m1=new Multith();
		Multith m2=new Multith();
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();

	}
}