package day15;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Demo6 {
  public static void main(String[] args) {
	new MyFrame2();
  }
}
//JButton:按钮组件
class MyFrame2 extends JFrame{
//把组件作为MyFrame的属性，然后在构造方法，创建
//组件的对象，然后通过add(组件)，把组件添加到
//MyFrame上面
 // JButton button1;
//  JButton button2;
  MyFrame2(){
//	 创建JButton组件对象
	  JButton button1 = new JButton("确认");
	  JButton button2 = new JButton("取消");
//	添加到窗体上（MyFrame2）
	this.add(button1);
	this.add(button2);
	this.setLayout(new FlowLayout());
//	展现窗体，创建MyFrame2的对象
	this.setVisible(true);
	this.setSize(500, 200);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("带按钮的窗体");
  }
}