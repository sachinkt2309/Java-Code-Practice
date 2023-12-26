//Abstract =  abstract calss cannot have instantiated, but they can have a subclass 
//			  abstract methods are declared without an implementation


public class Abstract_method {
	public static void main(String[] arg)
	{
		
		//Vehicle1 vehicle=new Vehicle1();
		Car1 car=new Car1();
		car.go();
	}

}

abstract class Vehicle1{
		
	abstract void go();
}

class Car1 extends Vehicle1{
	@Override	
	void go() {
		System.out.println("the driver is driving the car");
	}
}
