package day15;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test1 {
public static void main(String[] args) {
	new Frame1();
}
}
class Frame1 extends JFrame{
	JButton[] button=new JButton[3];
	Frame1(){
		for(int i=0;i<button.length;i++) {
		button[i]=new JButton(String.valueOf(i+1));
		this.add(button[i]);


		}
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("流式布局");
		this.pack();
	}
}
