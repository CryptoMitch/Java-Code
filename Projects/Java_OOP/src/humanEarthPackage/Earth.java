package humanEarthPackage;

public class Earth {
	
	public static void main(String[] args) {
	
		Human human1 = new human("Tom", 25, 76, "blue");
		Human human2 = new human("Joe", 28, 68, "green");
		
		human1.speak();
		human2.speak();
	}
	
}
