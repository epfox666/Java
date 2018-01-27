package day15;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 {
	public static void main(String[] args) {
		   new Frame2();
	}

}
class Frame2 extends JFrame{
	JButton[] button=new JButton[5];
	Frame2(){
		for(int i=0;i<button.length;i++) {
	
			button[i]=new JButton(String.valueOf(i+1));	
		}
		this.add(button[0],BorderLayout.EAST);
		this.add(button[1],BorderLayout.WEST);
		this.add(button[2],BorderLayout.SOUTH);
		this.add(button[3],BorderLayout.NORTH);
		this.add(button[4],BorderLayout.CENTER);
		this.setLayout(new BorderLayout());
		this.setSize(300, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		this.setTitle("±ß½ç²¼¾Ö");
	}
}