package day14;

public class Demo2 {
public static void main(String[] args) {
	StringBuffer buf=new StringBuffer("����");
	buf.append("�о�ѧ�Ķ���û���������,");
	buf.append("���ܿ�ʼѧϰ���ݿ����ݡ�");
	System.out.println(buf.toString());
	
	StringBuilder bud=new StringBuilder("����");
	bud.append("����ͦ��,�����ɵġ�");
	bud.append(true);
	bud.append(12);
	bud.append(12.1f);
	System.out.println(bud.toString());
	bud.insert(0, "��˵���");
	System.out.println(bud.toString());
	bud.delete(4, 6);
	System.out.println(bud.toString());
}
}
