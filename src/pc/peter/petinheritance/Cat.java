package pc.peter.petinheritance;

public class Cat extends Pet {

	public void truth() {
		setExisting(true);
		System.out.println("\tThis is " + this.isExisting() + "."); 
	}

	@Override
	public void doThing() {
		System.out.println("\tI am a cat. I can talk.");
	}

	public void makeNoise() {
		System.out.println("\tMeow! Meow!");
	}

}
