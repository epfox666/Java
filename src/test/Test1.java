package test;
public class Test1 {
	  public static void main(String[] args) {
		Car car1 =new Car("宝马",100);
		Car car2 =new Car("宝马",100);
		System.out.println("car1跟car2是否相等"
				+car1.equals(car2));
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
      System.out.println(car1==car2);
      System.out.println(car1.toString());
      System.out.println(car2.toString()); 
	  }	
	}

	class Car{
	  String name;
	  double price;
  Car(String name,double price){
		this.name = name;
		this.price = price;
	  }
	  @Override
	  public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		if(obj instanceof Car){
		  Car car =(Car)obj;
		  if(this.name.equals(car.name)&&
		    this.price == car.price){
			return true;
		  }
		}
		return false;
	  }

	  @Override
	  public int hashCode() {
		int num =(int)(price+100);
		return num;
	  }
	  
	  
	}
