package day15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo11 {
	public static void main(String[] args) {
		  new MyFrame7();
	}

}
class MyFrame7 extends JFrame{
	JPanel panel1,panel2,panel3;
	JButton[] button=new JButton[6];
	MyFrame7() {
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		for(int i=0;i<button.length;i++) {
		  button[i]=new JButton(String.valueOf(i+1));
		}
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new FlowLayout());
		panel3.setLayout(new FlowLayout());
		
		panel1.add(button[0]);
		panel1.add(button[1]);
		panel2.add(button[2]);
		panel2.add(button[3]);
		panel3.add(button[4]);
		panel3.add(button[5]);
		this.setLayout(new BorderLayout());
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.add(panel3,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setSize(200, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("综合应用");
	}
}
