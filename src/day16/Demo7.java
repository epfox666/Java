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
		  button1=new JButton("����");
		  button2=new JButton("�����");
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
			if("����".equals(name)) {
				System.out.println("������������");
			}else if("�����".equals(name)) {
				System.out.println("��ʦ��������");
			}
			
		}
		  
	  }
}