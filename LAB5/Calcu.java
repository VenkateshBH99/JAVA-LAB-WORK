import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calcu extends Applet implements ActionListener{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
	TextField t;
	static double a=0,b=0,result=0;
	static int op=0;
	public void init(){
		t=new TextField();
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b0=new Button("0");
		bdiv=new Button("/");
		bmul=new Button("*");
		bsub=new Button("-");
		badd=new Button("+");
		bdec=new Button(".");
		beq=new Button("=");
		bdel=new Button("Delete");
		bclr=new Button("clear");
		
        t.setBounds(30,40,280,30);
b7.setBounds(40,100,50,40);
b8.setBounds(110,100,50,40);
b9.setBounds(180,100,50,40);
bdiv.setBounds(250,100,50,40);
b4.setBounds(40,170,50,40);
b5.setBounds(110,170,50,40);
b6.setBounds(180,170,50,40);
bmul.setBounds(250,170,50,40);
b1.setBounds(40,240,50,40);
b2.setBounds(110,240,50,40);
b3.setBounds(180,240,50,40);
bsub.setBounds(250,240,50,40);
bdec.setBounds(40,310,50,40);
b0.setBounds(110,310,50,40);
beq.setBounds(180,310,50,40);
badd.setBounds(250,310,50,40);
bdel.setBounds(60,380,100,40);
bclr.setBounds(180,380,100,40);

add(t);add(b7);add(b8);add(b9);add(bdiv);add(b4);add(b5);add(b6);add(bmul);add(b1);add(b2);add(b3);add(bsub);add(bdec);add(b0);add(beq);
add(badd);add(bdel);add(bclr);
setLayout(null);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bdiv.addActionListener(this);
bmul.addActionListener(this);
bsub.addActionListener(this);
badd.addActionListener(this);
bdec.addActionListener(this);
beq.addActionListener(this);
bdel.addActionListener(this);
bclr.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		t.setText(t.getText().concat("1"));
	}
	if(e.getSource()==b2){
		t.setText(t.getText().concat("2"));
	}
	if(e.getSource()==b3){
		t.setText(t.getText().concat("3"));
	}
	if(e.getSource()==b4){
		t.setText(t.getText().concat("4"));
	}
	if(e.getSource()==b5){
		t.setText(t.getText().concat("5"));
	}
	if(e.getSource()==b6){
		t.setText(t.getText().concat("6"));
	}
	if(e.getSource()==b7){
		t.setText(t.getText().concat("7"));
	}
	if(e.getSource()==b8){
		t.setText(t.getText().concat("8"));
	}
	if(e.getSource()==b9){
		t.setText(t.getText().concat("9"));
	}
	if(e.getSource()==b0){
		t.setText(t.getText().concat("0"));
	}
	if(e.getSource()==badd){
		a=Double.parseDouble(t.getText());
		op=1;
		t.setText("");
	}
	if(e.getSource()==bsub){
		a=Double.parseDouble(t.getText());
		op=2;
		t.setText("");
	}
	if(e.getSource()==bmul){
		a=Double.parseDouble(t.getText());
		op=3;
		t.setText("");
	}
	if(e.getSource()==bdiv){
		a=Double.parseDouble(t.getText());
		op=4;
		t.setText("");
	}
	if(e.getSource()==beq){
		b=Double.parseDouble(t.getText());
		switch(op){

case 1: result=a+b;

break;

case 2: result=a-b;

break;

case 3: result=a*b;

break;

case 4: result=a/b;
      break;

default: result=0;
}
t.setText(""+result);

}
if(e.getSource()==bclr)
t.setText("");
if(e.getSource()==bdel)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
}

	}


}
/*
<applet code="Calcu.class" width="350" height="500">
</applet>
*/