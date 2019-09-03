
import java.applet.*;
import java.awt.*;

public class Car extends Applet implements Runnable{
	static int x=50,y=50,x1=60,x2=140;
	public void init() {
		setBackground(Color.PINK);
	}
	public void start() {
		Thread th=new Thread(this);
		th.start();
	}
	public void stop() {
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.YELLOW);
		//g.drawRect(x, y, 100, 50);
		g.draw3DRect(x, y, 100, 50, true);
		g.drawArc(x1,100,20, 20, 0, 360);
		g.drawArc(x2, 100,20, 20, 0, 360);
		g.drawLine(0,120,1000, 120);
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			x=(x+10)%1000;
			x1=(x1+10)%1000;
			x2=(x2+10)%1000;
			repaint();
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
		
	}
	

}
/* <applet code="Car.class" width="1000" height="800">
</applet> */ 
