package day15;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo9 {
  public static void main(String[] args) {
	new MyFrame5();
  }
}
//���񲼾֣�����ָ����������Ǽ��м��У����е�˳��
//�����ң����ϵ��£���������
class MyFrame5 extends JFrame{
//3�У�3���������
//����JButton�����飬9����ťԪ��	
  JButton[] buttons = new JButton[9];
  MyFrame5(){
//	���ò���
	this.setLayout(new GridLayout(3,3));
//	ʹ��for������buttons����Ԫ�أ�����JButton
//	����,����JButton������ӵ�MyFrame4���� 
	for(int i=0;i<buttons.length;i++){
//	������ť
//	String.valueof��int��:
//				  ������ת����Ӧ���ַ���	
	  buttons[i] = new JButton(String.valueOf(i+1));
//	  �Ѱ�ť��ӵ�MyFrame5����
	  this.add(buttons[i]);
	}//չ�ִ��壬����MyFrame5����
	this.setVisible(true);
	this.setSize(300, 200);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("���񲼾�");
  }	
	
	
	
}
