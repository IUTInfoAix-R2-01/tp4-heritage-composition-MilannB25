package tp3exosYaip4;

public class Animal {
	private String Animal;

	public Animal(String animal) {
		super();
		Animal = animal;
	}

	@Override
	public String toString() {
		return "Animal [Animal=" + Animal + "]";
	}
	
    public static void main(String[] args) {
        System.out.println("Test de la classe Animal");
        Animal animal = new Animal("Lion");
        System.out.println(animal.toString());

        System.out.println("Test de la classe Mammal");
        Mammal mammal = new Mammal("Tigre");
        System.out.println(mammal.toString());

        System.out.println("Test de la classe Cat");
        Cat cat = new Cat("caramel");
        System.out.println(cat.toString());

        System.out.println("Test de la classe Dog");
        Dog dog1 = new Dog("lechien");
        Dog dog2 = new Dog("Max");
        System.out.println(dog1.toString());
        
        System.out.println("doit faire Woof");
        dog1.greets(); 
        
        System.out.println("doit faire Woooof");
        dog1.greets(dog2);

    }
}