package day15;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Demo6 {
  public static void main(String[] args) {
	new MyFrame2();
  }
}
//JButton:��ť���
class MyFrame2 extends JFrame{
//�������ΪMyFrame�����ԣ�Ȼ���ڹ��췽��������
//����Ķ���Ȼ��ͨ��add(���)���������ӵ�
//MyFrame����
 // JButton button1;
//  JButton button2;
  MyFrame2(){
//	 ����JButton�������
	  JButton button1 = new JButton("ȷ��");
	  JButton button2 = new JButton("ȡ��");
//	��ӵ������ϣ�MyFrame2��
	this.add(button1);
	this.add(button2);
	this.setLayout(new FlowLayout());
//	չ�ִ��壬����MyFrame2�Ķ���
	this.setVisible(true);
	this.setSize(500, 200);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("����ť�Ĵ���");
  }
}