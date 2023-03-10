package oops.inhtopic;

public class Dog extends Animal
{
	public void bark() 
	{
		System.out.println("Dog---bark()");
	}
	public static void main(String[] args) 
	{
//		Dog dog = new Dog();
//		dog.eat();
//		dog.bark();
		
		Animal animal = new Animal();
		
		animal.eat();
//		animal.bark();//C.E
	}
}
