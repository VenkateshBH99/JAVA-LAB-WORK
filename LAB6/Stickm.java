import java.applet.Applet;
import java.awt.*;
public class Stickm extends Applet implements Runnable {
static int  xhead=80;
static int xeye1=100;
static int xeye2=150;
static int x1=130,x2=125,x3=135;
static int xmouth=95;
static int xbody=130;
static int xlhand1=130,xrhand1=130,xlhand2=50,xrhand2=220;
static int c=1;

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
			page.drawArc(xhead,30,100,100,0,360);
		
		page.fillArc(xeye1,60,10,10,0,360);
		page.fillArc(xeye2,60,10,10,0,360);
		int y[]={70,90,90};
		int x[]={x1,x2,x3};
		page.drawPolygon(x,y,3);
		page.drawArc(xmouth,50,70,60,225,90);
		page.drawLine(xbody,130,xbody,300);
		page.drawLine(xlhand1,180,xlhand2,90);
		page.drawLine(xrhand1,180,xrhand2,90);
		page.drawLine(xlhand1,300,xlhand2,350);
		page.drawLine(xrhand1,300,xrhand2,350);
		
	}
	
	public void run(){
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(true){
			xhead=(xhead+1)%1000;
			xeye1=(xeye1+1)%1000;
			xeye2=(xeye2+1)%1000;
			x1=(x1+1)%1000;x2=(x2+1)%1000;x3=(x3+1)%1000;
			xmouth=(xmouth+1)%1000;
			xbody=(xbody+1)%1000;
			xlhand1=(xlhand1+1)%1000;
			xlhand2=(xlhand2+1)%1000;
			xrhand1=(xrhand1+1)%1000;
			xrhand2=(xrhand2+1)%1000;
			repaint();
			try{
				Thread.sleep(100);
			}catch(Exception e){

			}

			
		}

	}
}
/* <applet code="Stickm.class" width="1000" height="800">  
    </applet>  */
