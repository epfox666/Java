package day16;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Demo10  {
	public static void main(String[] args){
		new Computer();
	}
}
class Computer extends JFrame implements ActionListener {
	JTextField jtf;
	JButton[] buttons =new JButton[20];
	JPanel jp1;
	Computer() {
		jp1=new JPanel();
		jp1.setLayout(new GridLayout(5,4));
		String[] strs ={
				"Back","CE","C","+",
				"7","8","9","-",
				"4","5","6","*",
				"1","2","3","/",
				"0","+/-",".","="};
		for(int i=0;i<buttons.length;i++) {
			buttons[i]=new JButton(strs[i]);
			jp1.add(buttons[i]);
			buttons[i].addActionListener(this);
		}
		jtf=new JTextField(20);
		this.setLayout(new BorderLayout());
		this.add(jtf,BorderLayout.NORTH);
		this.add(jp1, BorderLayout.CENTER);
		
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	String opt;  //运算符
	String s1;  
	String s2;
	String s3;

	double d3;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name=e.getActionCommand();
		String temp=jtf.getText();
		if("0123456789".indexOf(name)!=-1) {
			if(temp==null) {
				jtf.setText(name);
			}else {
				jtf.setText(temp+name);
			}
		}else if(".".equals(name)) {
			jtf.setText(temp+".");
		}else if("+-*/".indexOf(name)!=-1) {
			s1=jtf.getText();
			opt=name;
			jtf.setText(null);
		}else if("=".equals(name)) {
			s2=jtf.getText();
			double d1=Double.parseDouble(s1);
			double d2=Double.parseDouble(s2);
			if("+".equals(opt)) {
				d3=d1+d2;
			}else if("-".equals(opt)){
				d3=d1-d2;
			}else if("*".equals(opt)) {
				d3=d1*d2;
			}else if("/".equals(opt)) {
				d3=d1/d2;
			}
			s3=d3+"";
			jtf.setText(s3);
		}
	}
}
