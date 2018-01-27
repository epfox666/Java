package day15;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Demo8 {
  public static void main(String[] args) {
	new MyFrame4();
  }
}
//边界布局：中部，南部，北部，西部，东部，
//5个区域构成
class MyFrame4 extends JFrame{
//创建5个按钮组件
  JButton button1,button2,button3
  	,button4,button5;
  MyFrame4(){
	button1 = new JButton("东邪");
	button2 = new JButton("西毒");
	button3 = new JButton("南帝");
	button4 = new JButton("北丐");
	button5 = new JButton("中神通");
// 设置布局：边界布局
	this.setLayout(new BorderLayout());
// 添加组件:add(组件，位置)
	this.add(button1, BorderLayout.EAST);
	this.add(button2,BorderLayout.WEST);
	this.add(button3,BorderLayout.SOUTH);
	this.add(button4,BorderLayout.NORTH);
	this.add(button5,BorderLayout.CENTER);
//  展现窗体，创建MyFrame4对象
	this.setSize(300, 200);
	this.setVisible(true);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("边界布局");
  }
	
	
	
}