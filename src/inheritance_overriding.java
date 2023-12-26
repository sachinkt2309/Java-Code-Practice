
public class inheritance_overriding {

	public static void main(String[] args)
	{
		Animal animal=new Animal();
		Dog dog =new Dog();
		animal.speak();
		dog.speak();
	}
}

class Animal {
	void speak()
	{
		System.out.println("the animals can speak");
	}
}
class Dog extends Animal{
	@Override
	void speak()
	{
		System.out.println("dogs can bark");
	}
}