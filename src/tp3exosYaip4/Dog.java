package tp3exosYaip4;

public class Dog extends Mammal {
	public Dog(String animal) {
		super(animal);
	}

	@Override
	public String toString() {
		return "Dog[" + super.toString() + "]";
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
}
