
import java.applet.*;
import java.lang.*;
import java.awt.*;

public class Car extends Applet implements Runnable{
	static int x=50,x1=60,x2=130,x3=150;
	static int s1=50,s2=150,s3=190,s4=50;

	
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
		g.fill3DRect(x, 50, 100, 60, true);
		g.setColor(Color.RED);
		g.fill3DRect(x3, 80, 30, 30, true);
		g.setColor(Color.BLACK);
		g.fillArc(x1,110,20, 20, 0, 360);
		g.setColor(Color.BLACK);
	
		g.fillArc(x2, 110,20, 20, 0, 360);
		g.drawLine(0,130,1000, 130);
		
		int s[]= {s1,s2,s3,s4};
		int s11[]= {180,180,230,230};
		g.setColor(Color.GREEN);
		g.fillPolygon(s, s11, 4);
		g.setColor(Color.BLACK);
		g.fillArc(x1,230,20, 20, 0, 360);
		g.setColor(Color.BLACK);
	
		g.fillArc(x2, 230,20, 20, 0, 360);
		g.drawLine(0,250,1000, 250);
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			/*x=(x+10)%1000;
			x1=(x1+10)%1000;
			x2=(x2+10)%1000;
			x3=(x3+10)%1000;*/
			x=mod(x);
			x1=mod(x1);
			x2=mod(x2);
			x3=mod(x3);
			s1=mod(s1);
			s2=mod(s2);
			s3=mod(s3);
			s4=mod(s4);
			
		
			repaint();
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
		
	}
	public static int mod(int a) {
		a=(a+10)%1000;
		return a;
		
	}
	
	

}
/* <applet code="Car.class" width="1000" height="800">
</applet> */ 
