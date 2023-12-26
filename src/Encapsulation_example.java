//  Encapsulation = attributes of a class will behidden or private,
//					can be accessed only through methods(getters & setter)
//					you should make attributes private if ou don't have a reason to make them


public class Encapsulation_example {

	public static void main(String[] arg)
	{
		Car2 car =new Car2("audi","suv",2017);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		car.setYear(2018);
		System.out.println(car.getYear());
	}
	
}

//-------------------------------------------------------------------------------------
class Car2{
	private String make;
	private String model;
	private int year;

	Car2(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
}
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMake(String make) {
		this.make=make;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setYear(int year) {
		this.year=year;
	}
}