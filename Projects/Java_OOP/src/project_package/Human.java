package project_package;

public class Human {

	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	// Constructor Method - used to construct Human objects
	public Human() {
		age = 5;
		eyeColor = "blue";
		heightInInches = 72;
		name = "Tom Thompson";
	}
	
	// Methods
	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am "+ age + " years old.");
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("My eye color is " + eyeColor);
	}
	
	public void eat(){
		System.out.println("eating...");
	}
		
	public void walk(){
		System.out.println("walking...");
	}
	
	public void work(){
		System.out.println("working...");
	}
	
}
