
public class Cars {

	String make="tesla";
	String model="electric";
	int year=2021;
	String color="white";
	double price=25000.00;

	/*void drive() {
		System.out.println("you drive the car");
	}
	void brake() {
		System.out.println("you hit the break");
		
	}*/
	public String toString() {
		String myString = make+"\n"+model+"\n"+year+"\n"+color+"\n"+price;
		return myString;
	}
}
