package day13;

public class Demo3 {
	public static void main(String[] args) {
		Car car1=new Car("epfox",18);
		Car car2=new Car("epfox",18);
		System.out.println(car1.equals(car2));
	}
}

class Car{
	String name;
	double price;
	Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	@Override
	public int hashCode() {
		int num=(int)price;
		return num;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
			if(this==obj) {
				return true;				
			}
			if(obj instanceof Car) {
				Car car=(Car) obj;
				if(this.name.equals(car.name)&&
						this.price==car.price) {
					return true;
				}
			}
	
		
		return false;
	}
	
}
