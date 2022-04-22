package pc.peter.petinheritance;

public class Pet {

	private boolean isExisting = false;
	
	public boolean isExisting() {
		return isExisting;
	}

	public void setExisting(boolean isExisting) {
		this.isExisting = isExisting;
	}

	public void doThing() {
		System.out.println("\tWhat? Do I even exist?");
	}
		
	public void makeNoise() {
		System.out.println("\tSilence...");
	}
	
	public void truth() {
		System.out.println("\tThis is " + this.isExisting() + "."); 
	}
	
}
