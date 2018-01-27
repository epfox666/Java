package day14;

public class Demo2 {
public static void main(String[] args) {
	StringBuffer buf=new StringBuffer("今天");
	buf.append("感觉学的东西没有昨天的难,");
	buf.append("下周开始学习数据库内容。");
	System.out.println(buf.toString());
	
	StringBuilder bud=new StringBuilder("昨天");
	bud.append("天气挺好,雾蒙蒙的。");
	bud.append(true);
	bud.append(12);
	bud.append(12.1f);
	System.out.println(bud.toString());
	bud.insert(0, "我说真的");
	System.out.println(bud.toString());
	bud.delete(4, 6);
	System.out.println(bud.toString());
}
}
