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
//�߽粼�֣��в����ϲ���������������������
//5�����򹹳�
class MyFrame4 extends JFrame{
//����5����ť���
  JButton button1,button2,button3
  	,button4,button5;
  MyFrame4(){
	button1 = new JButton("��а");
	button2 = new JButton("����");
	button3 = new JButton("�ϵ�");
	button4 = new JButton("��ؤ");
	button5 = new JButton("����ͨ");
// ���ò��֣��߽粼��
	this.setLayout(new BorderLayout());
// ������:add(�����λ��)
	this.add(button1, BorderLayout.EAST);
	this.add(button2,BorderLayout.WEST);
	this.add(button3,BorderLayout.SOUTH);
	this.add(button4,BorderLayout.NORTH);
	this.add(button5,BorderLayout.CENTER);
//  չ�ִ��壬����MyFrame4����
	this.setSize(300, 200);
	this.setVisible(true);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setTitle("�߽粼��");
  }
	
	
	
}