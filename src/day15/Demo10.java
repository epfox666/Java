package day15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo10 {
public static void main(String[] args) {
	new MyFrame6();
}
}

class MyFrame6 extends JFrame{
	JPanel panel1;
	JPanel panel2;
	JButton[] buttons=new JButton[8];
	MyFrame6() {
		panel1=new JPanel();
		panel2=new JPanel();
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new GridLayout(2,3));
		for(int i=0;i<buttons.length;i++) {
			buttons[i]=new JButton(String.valueOf(i+1));
			
		}
		panel1.add(buttons[0]);
		panel1.add(buttons[1]);
		for(int i=2;i<buttons.length;i++) {
			buttons[i]=new JButton(String.valueOf(i+1));
			panel2.add(buttons[i]);
		}
	
	this.setLayout(new BorderLayout());
	this.add(panel1,BorderLayout.NORTH);
	this.add(panel2,BorderLayout.CENTER);
	
	this.setVisible(true);
	this.setSize(500,300);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("JPanel的使用");
	
	
	
	
	
	
	
	}	
}
