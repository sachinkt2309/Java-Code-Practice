
public class Inheritance_Example {
	public static void main(String[] ars)
	{
		Car car=new Car();
		car.go();
		
		Bicycle cycle=new Bicycle();
		cycle.stop();
		
		car.speed=250.0;
		cycle.speed=35.00;
		
		System.out.println("car can reach "+car.speed+" kmph speed");
		System.out.println("car has "+car.wheels+" wheels");
		System.out.println("this car has "+car.doors+" doors\n");
		
		System.out.println("cycle can reach "+cycle.speed+" kmph speed");
		System.out.println("cycle has "+cycle.wheels+" wheels");;
		System.out.println("and it has "+cycle.pedals+" pedals");
		
		//System.out.println(cycle.doors);
	}

}
