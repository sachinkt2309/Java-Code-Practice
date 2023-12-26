
public class Constructer_Example {
	public static void main(String[] arg)
	{
		// Constructor= special method tha is called when an object is instantiated(created)
		
		Human human1 = new Human("sachin",65,70);
		Human human2=new Human("kiran",30,60);
		System.out .println(human1.name+" "+human2.age);
		
		human1.eat();
		human2.drink();
	}

}
