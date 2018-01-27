package day15;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo9 {
  public static void main(String[] args) {
	new MyFrame5();
  }
}
//网格布局：由来指定组件排列是几行几列，排列的顺序
//从左到右，从上到下，依次排列
class MyFrame5 extends JFrame{
//3行，3列组件布局
//创建JButton的数组，9个按钮元素	
  JButton[] buttons = new JButton[9];
  MyFrame5(){
//	设置布局
	this.setLayout(new GridLayout(3,3));
//	使用for来操作buttons数组元素，创建JButton
//	对象,及把JButton对象添加到MyFrame4上面 
	for(int i=0;i<buttons.length;i++){
//	创建按钮
//	String.valueof（int）:
//				  把数字转化对应的字符串	
	  buttons[i] = new JButton(String.valueOf(i+1));
//	  把按钮添加到MyFrame5上面
	  this.add(buttons[i]);
	}//展现窗体，创建MyFrame5对象
	this.setVisible(true);
	this.setSize(300, 200);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("网格布局");
  }	
	
	
	
}
