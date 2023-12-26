// object=  an instance of a class that may contain attributes and methods
// example: (phone,desk,computer,coffee cup)



public class ObjectsOOP_example {
	public static void main(String[] arg)
	{
		
		Cars1 mycar=new Cars1();
		Cars mycar2 =new Cars();
		
		System.out.println(mycar.model +"\n"+mycar.color+"\n");
		System.out.println(mycar2.model +"\n"+mycar2.color);
		//mycar.drive();
		//System.out.print("and suddenly ");
		//mycar.brake();
	}

}
 class Cars1 {

	String make="tesla";
	String model="electric";
	int year=2021;
	String color="white";
	double price=25000.00;

	void drive() {
		System.out.println("you drive the car");
	}
	void brake() {
		System.out.println("you hit the break");
		
	}
}
