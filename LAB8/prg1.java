import java.applet.Applet;
import java.awt.*;
public class prg1 extends Applet implements Runnable {
	int x=10;
	public void init(){
	setBackground(new Color(127,22,223));
}
public void start(){
	Thread th=new Thread (this);
	th.start();

}
public void stop(){


}
public void paint(Graphics page){
	page.setColor(Color.orange);  
	page.fillRect(x,10,100,50);
	page.setColor(Color.red);
	page.fillRect(x+95,20,40,40);
	page.setColor(Color.black);
	page.fillArc(x+10,60,20,20,0,360); 
	page.setColor(Color.black);
	page.fillArc(x+60,60,20,20,0,360);
	page.setColor(Color.black);
	page.fillArc(x+110,60,20,20,0,360);


	}
public void run(){
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		while(true){
			x=(x+10)%1000;
		
			repaint();
			try{
				Thread.sleep(100);
			}catch(Exception e){

			}
		}
	}
}
/* <applet code="prg1.class" width="1000" height="800">  
    </applet>  */

