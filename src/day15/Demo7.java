package day15;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo7 {
  public static void main(String[] args) {
	new MyFrame3();
  }
}
//��ʽ���֣�������մ����ң����ϵ��µ�˳��������
class MyFrame3 extends JFrame{
  JButton button1,button2,button3,
  		button4,button5;
  MyFrame3(){
	button1 = new JButton("��ť1");
	button2 = new JButton("��ť2");
	button3 = new JButton("��ť3");
	button4 = new JButton("��ť4");
	button5 = new JButton("��ť5");
//���ò��֣���ʽ����(FlowLayout())
	this.setLayout(new FlowLayout());
//��Ӱ�ť˳�򣺾�����MyFrame3�����ϰ�ť����
//˳��
	this.add(button1);
	this.add(button2);
	this.add(button3);
	this.add(button4);
	this.add(button5);
//չ�ִ���
	this.setVisible(true);
	this.setSize(500, 300);
//	this.setSize(300, 500);
//���������С�͸������Զ����ô����С
//	this.pack();
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("��ʽ����");
	
  }
  
  
  
  
  
  
  
}