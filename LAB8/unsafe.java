
// Java program to create Thread Safe 
// Singleton class 
class GFG  
{ 
  // private instance, so that it can be 
  // accessed by only by getInstance() method 
  private static GFG instance; 
  
  private GFG()  
  { 
    // private constructor 
  } 
  
 //synchronized method to control simultaneous access 
  public static GFG getInstance()  
  { 
    if (instance == null)  
    { 
      // if instance is null, initialize 
      instance = new GFG();
    } 
    return instance; 
  } 

  public void getSomeThing()
  {
        // do something here
        System.out.println("I am here....");
  }
} 


class main extends Thread implements Runnable
{


  public void run()
  {  
    GFG a=GFG.getInstance();  
    System.out.println("hashcode : " + a.hashCode() );

  }

  public static void main(String args[])
  {
    main t1= new main();
    main t2= new main();
    t1.start();
    t2.start();
  }
    
}