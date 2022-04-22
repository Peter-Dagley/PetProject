package pc.peter.petinheritance;

public class Dog extends Pet {

	public void truth() {
		setExisting(true);
		System.out.println("\tThis is " + this.isExisting() + "."); 
	}
	
	@Override
	public void doThing() {
		System.out.println("\tI am a dog. I can talk.");
	}

	public void makeNoise() {
		System.out.println("\tWoof! Woof!");
	}

}
