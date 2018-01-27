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
		button1=new JButton("刘备");
		button2=new JButton("诸葛亮");
		button3=new JButton("赵云");
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
		if("刘备".equals(name)) {
			System.out.println("主公我来了");
		}else if("诸葛亮".equals(name)) {
			System.out.println("军师我来了");
		}else if("赵云".equals(name)) {
			System.out.println("将军我来了");
		}
		
	}
}
