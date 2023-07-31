package project_package;

public class Earth {
	public static void main(String[] args) {
		
		// Create variable of type Human
		Human tom;
		
		// Assign variable a new human object - this is used to create objects
		tom = new Human();
		
		// Assign fields for tom
		tom.age = 5;
		tom.eyeColor = "blue";
		tom.heightInInches = 72;
		tom.name = "Tom Thompson";
		
		//Invoke the speak method on the object
		tom.speak();
		
		
		Human joe = new Human();
		
		joe.age = 17;
		joe.eyeColor = "Green";
		joe.heightInInches = 183;
		joe.name = "Joe";
		
		joe.speak();
		
	}
	
}
