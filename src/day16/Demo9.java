package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Demo9 {
     public static void main(String[] args) {
		new MyText();
	}
}
class MyText extends JFrame implements ActionListener{
	JButton button1,button2;
	JTextField jtf;
	MyText(){
		button1=new JButton("��������");
		button2=new JButton("������ؤ");
		jtf=new JTextField(20);
		this.setLayout(new FlowLayout());
		this.add(button1);
		this.add(button2);
		this.add(jtf);
		button1.addActionListener(this);
		button2.addActionListener(this);
		this.setVisible(true);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name=e.getActionCommand();
		String temp=jtf.getText();
		if("��������".equals(name)) {
			if(temp==null) {
				jtf.setText(name);
			}else {
				jtf.setText(temp+name);
			}
		}
		if("������ؤ".equals(name)) {
			if(temp==null) {
				jtf.setText(name);
			}else {
				jtf.setText(temp+name);
			}
		}
	}
	
	
	
	
	
	
	
	
	
}