import java.awt.*;
//import  java.swing.awt.*;
 
class W extends Frame{

  Frame f;
  TextField t1,t2;
  Button b;
  public static void main(String args[]){

  }

 
    W(){
  	setSize(300,400);
  	TextField t1= new TextField("enter");
  	t1.setBounds(40,50,20,10);
  	TextField t2=new   TextField("huc");
  	t2.setBounds(40,50,20,10);
  	Button b=new Button("b");
  	b.setBounds(20,30,50,10);
  	add(t1);
  	add(t2);
  	add(b);
  	setLayout(null);
  	setVisible(true);
  }
}

