package day11;

public class Demo3 {
public static void main(String[] args) {
	Emp emp=new Emp("epfox","123456");
	emp.setName("fox");
	String name=emp.getName();
	System.out.println(name);
	emp.setPassword("654321");
	String password=emp.getPassword();
	System.out.println(password);
	
}
}
class Emp{
	  private String name;
	  private String password;
	  
	  Emp(String name,String password){
			this.name = name;
			this.password = password;
		  }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}