package day15;
import javax.swing.*;
public class Demo5 {
	public static void main(String[] args) {
		new MyFrame1();
	}
}
class MyFrame1 extends JFrame{
	 MyFrame1(){
		 this.setVisible(true);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setSize(300, 200);
		 this.setTitle("MyFrame1");
	 }
}
