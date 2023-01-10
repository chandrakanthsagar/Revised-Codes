
import java.awt.*;
import java.awt.event.*;
import java.security.GuardedObject;

import javax.lang.model.util.ElementScanner14;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Result extends JFrame implements ActionListener{


    JFrame f=new JFrame();
    
f.getContentPane().setBackground(Color.CYAN);
Color color=new Color(255, 239 ,213);
f.getContentPane().setBackground(color);
 
  Label l1=new Label("Hallticket");
  Label l2=new Label("Name");
  Label l3=new Label("Grand Total");
  Label l4=new Label("");
  Label l13=new Label("Status");
  Label l5=new Label("Subject");
  Label l6=new Label("Marks");
  Label l7=new Label("Sanskrit");
  Label l8=new Label("English") ;
  Label l9=new Label("Maths-1");
  Label l10=new Label("Maths-2");
  Label l11=new Label("Physics");
  Label l12=new Label("Chemistry");
  TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();
TextField t7=new TextField();
TextField t8=new TextField();
TextField t9=new TextField();
TextField t10=new TextField();
TextField t11=new TextField();
TextField t12=new TextField();
TextField t13=new TextField();
Button b1=new Button("RESULT");
Button b2=new Button("CANCEL");
  

Result(){
    l1.setBounds(50,100,100,20);
l2.setBounds(50,120,100,20);
l3.setBounds(50,140,100,20);
l4.setBounds(50, 160, 100, 20);
l13.setBounds(50,180,100,20);
l5.setBounds(20, 200, 100, 20);
l6.setBounds(130, 200, 100, 20);
l7.setBounds(20, 230, 100, 20);
l8.setBounds(20, 260, 100, 20);
l9.setBounds(20, 290, 100, 20);
l10.setBounds(20, 310, 100, 20);
l11.setBounds(20, 340, 100, 20);
l12.setBounds(20, 370, 100, 20);
t1.setBounds(150,100,100,20);
t2.setBounds(150,120,100,20);
t3.setBounds(150,140,100,20);
t4.setBounds(150, 160, 100, 20);
t13.setBounds(150, 180, 100, 20);
t7.setBounds(130, 230, 100, 20);
t8.setBounds(130, 260, 100, 20);
t9.setBounds(130, 290, 100, 20);
t10.setBounds(130, 310, 100, 20);
t11.setBounds(130, 340, 100, 20);
t12.setBounds(130, 370, 100, 20);
b1.setBounds(250, 250, 100, 30);
b2.setBounds(350, 250, 100, 30);
add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);

add(t1);
add(t2);
add(t3);
add(t4);
add(t7);
add(t8);
add(t9);
add(t10);
add(t11);
add(t12);
add(t13);

add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
setLayout(null);
setVisible(true);
setSize(500,500);
}


public void actionPerformed(ActionEvent e)
{
String x=(t2.getText());
int n1=Integer.parseInt(t7.getText());
int n2=Integer.parseInt(t8.getText());
int n3=Integer.parseInt(t9.getText());
int n4=Integer.parseInt(t10.getText());
int n5=Integer.parseInt(t11.getText());
int n6=Integer.parseInt(t12.getText());


double total;
String w;
char grade;

total=(n1+n2+n3+n4+n5+n6);
if(n1>=35 && n2>=35 && n3>=28 && n4>=28 && n5>= 24 && n6>=23){
    

    w="PASS";
  
    total=(n1+n2+n3+n4+n5+n6);
    if(total>455)
      grade='A';
    else if(total>400 && total<=455)
        grade='B';
    else if(total>350 && total<=400)
       grade='C';
    else if(total>280 && total<=350)
        grade='D';
    else{
    grade='F';
}
}
else
  {
    
    
      w="FAIL";
      grade='-';
  }



if(e.getSource()==b1)
{
       
t3.setText(String.valueOf(total));
      
t4.setText(String.valueOf(grade));

t13.setText(String.valueOf(w));
}

if(e.getSource()==b2)
{
System.exit(0);
}
}
public static void main(String...s)
{
new Result();}
}
