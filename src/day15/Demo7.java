package day15;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo7 {
  public static void main(String[] args) {
	new MyFrame3();
  }
}
//流式布局：组件按照从左到右，从上到下的顺序来排列
class MyFrame3 extends JFrame{
  JButton button1,button2,button3,
  		button4,button5;
  MyFrame3(){
	button1 = new JButton("按钮1");
	button2 = new JButton("按钮2");
	button3 = new JButton("按钮3");
	button4 = new JButton("按钮4");
	button5 = new JButton("按钮5");
//设置布局：流式布局(FlowLayout())
	this.setLayout(new FlowLayout());
//添加按钮顺序：就是在MyFrame3窗体上按钮排列
//顺序
	this.add(button1);
	this.add(button2);
	this.add(button3);
	this.add(button4);
	this.add(button5);
//展现窗体
	this.setVisible(true);
	this.setSize(500, 300);
//	this.setSize(300, 500);
//根据组件大小和个数，自动设置窗体大小
//	this.pack();
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("流式布局");
	
  }
  
  
  
  
  
  
  
}
