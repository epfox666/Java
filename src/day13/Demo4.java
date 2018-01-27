package day13;
import java.util.*;
public class Demo4 {
         public static void main(String[] args) {
			List list=new ArrayList();
			list.add(new User("epfox",18));
			list.add(new User("epfox",18));
			User user1=(User)list.get(0);
			User user2=(User)list.get(1);
			System.out.println(list.toString());
			System.out.println(user1.equals(user2));
			list.remove(user1);
			System.out.println(list.toString());
//			System.out.println(user1.hashCode());
//			System.out.println(user2.hashCode());
//			System.out.println(user1.name);
//			System.out.println(user1.age);
			
		}
}
class User{
	String name;
	int age;
	User(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
          if(obj==null) {
        	  return false;
          }
          if(this==obj) {
        	  return true;
          }
          if(obj instanceof User) {
        	  User user=(User) obj;
        	  if(this.name.equals(user.name)&&
        			  this.age==user.age) {
        		  return true;
        	  }
          }

	//	return super.equals(obj);
          return false;
	}
	@Override
	public int hashCode() {
	
		return name.hashCode();
	}
	
	
	
	
}
