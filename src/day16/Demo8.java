package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo8 {
     public static void main(String[] args) {
		new Sanguo3();
	}
}
class Sanguo3 extends JFrame implements ActionListener{
	JButton button1,button2,button3;
	Sanguo3(){
		button1=new JButton("����");
		button2=new JButton("�����");
		button3=new JButton("����");
		this.setLayout(new FlowLayout());
		this.add(button1);
		this.add(button2);
		this.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name=e.getActionCommand();
		if("����".equals(name)) {
			System.out.println("����������");
		}else if("�����".equals(name)) {
			System.out.println("��ʦ������");
		}else if("����".equals(name)) {
			System.out.println("����������");
		}
		
	}
}