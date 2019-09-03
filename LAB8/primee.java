
public class primee {
	public static void primeIn(int a,int b){
		 int p;
        		for(int i=a;i<b;i++){
        			p=1;
        			for(int j=2;j<=i/2;j++){
        				if(i%j==0){
        					p=0;
        					break;
        				}
        				
        				}
                        if(p==1){
                            System.out.print(i+" ");
        			}

        		}
            System.out.println();
	}
  
	public static void main(String[] args) {
        
        Thread t1=new Thread(){
        	public void run(){
                System.out.println("Current Thread:"+Thread.currentThread().getName());
       
               primeIn(1000,2000);
        	}

        };
       

        Thread t2=new Thread(){
        	public void run(){
                 System.out.println("Current Thread:"+Thread.currentThread().getName());
      
        		primeIn(2000,3000);
        	}
        };

        Thread t3=new Thread(){
        	public void run(){
                 System.out.println("Current Thread:"+Thread.currentThread().getName());
      
        		primeIn(3000,4000);
        	}
        };
        Thread t4=new Thread(){
        	public void run(){
                 System.out.println("Current Thread:"+Thread.currentThread().getName());
      
        		primeIn(4000,5000);
        	}
        };
        System.out.println("Increasing order:");
         t1.start();
       
       try{
         t1.join();
        
       }catch(Exception e){

       }

       t2.start();
       try{
         
        t2.join();

       }catch(Exception e){

       }
       t3.start();
       try{
         
        t3.join();
       }catch(Exception e){

       }
       t4.start();
       try{
         
        t4.join();
       }catch(Exception e){

       }
       System.out.println("\nDecreasing Order:");


	}
}