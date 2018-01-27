package day15;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 {
  public static void main(String[] args) {
	new Frame3();
}
}
class Frame3 extends JFrame {
	JButton[] button=new JButton[9];
	Frame3() {
		for(int i=0;i<button.length;i++) {
			button[i]=new JButton(String.valueOf(i+1));
			this.add(button[i]);
		}
		this.setLayout(new GridLayout(3,3));
		this.setVisible(true);
		this.setSize(300, 200);
		this.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		this.setTitle("网格布局");
	}
}
