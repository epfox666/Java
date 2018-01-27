package day16;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo6 {
	public static void main(String[] args) {
		new SanGuo();
	}

}
class SanGuo extends JFrame{
	JButton button1;
    SanGuo(){
    	button1=new JButton("刘备");
    
    this.setLayout(new FlowLayout());
    this.add(button1);
    
    button1.addActionListener(new Worker());
    
	this.setVisible(true);
	this.setDefaultCloseOperation(
			JFrame.EXIT_ON_CLOSE);
	this.setSize(300,200);
    }	
    class Worker implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("主公，我来了");
			
		}
   }
    
    
}
