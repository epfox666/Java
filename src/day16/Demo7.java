package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo7 {
	public static void main(String[] args) {
		 new SanGuo2();
	}
  
}
class SanGuo2 extends JFrame{
	JButton button1;
	JButton button2;
	  SanGuo2(){
		  button1=new JButton("刘备");
		  button2=new JButton("诸葛亮");
		  this.setLayout(new FlowLayout());
		  this.add(button1);
		  this.add(button2);
		  button1.addActionListener(new Worker());
		  button2.addActionListener(new Worker());
		  this.setVisible(true);
			this.setSize(300,100);
			this.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
	  }
	  class Worker implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String name=e.getActionCommand();
			if("刘备".equals(name)) {
				System.out.println("主公，我来了");
			}else if("诸葛亮".equals(name)) {
				System.out.println("军师，我来了");
			}
			
		}
		  
	  }
}
