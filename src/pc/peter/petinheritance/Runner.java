package pc.peter.petinheritance;

public class Runner {

	public static void main(String[] args) {
		
		//Pets
		
		Pet undefined = new Pet();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		
		//Methods
		
		System.out.println("What are you guys supposed to be?");
		
		undefined.doThing();
		cat.doThing();
		dog.doThing();
		
		System.out.println("Each of you make a noise so we can tell.");
		
		undefined.makeNoise();
		cat.makeNoise();
		dog.makeNoise();
		
		System.out.println("Are you telling the truth?");
		
		undefined.truth();
		cat.truth();
		
	}
	

		
	
}
