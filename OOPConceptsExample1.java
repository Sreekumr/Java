// Parent class (base class)
class Animal {
    // Attribute
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void speak() {
        System.out.println("Animal speaks");
    }
}

// Child class (derived class) inheriting from Animal
class Dog extends Animal {
    // Additional attribute
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        // Calling the constructor of the parent class using super
        super(name);
        this.breed = breed;
    }

    // Overriding the speak method of the parent class
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }

    // Additional method specific to Dog
    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    // Additional attribute
    private boolean isLazy;

    // Constructor
    public Cat(String name, boolean isLazy) {
        // Calling the constructor of the parent class using super
        super(name);
        this.isLazy = isLazy;
    }

    // Overriding the speak method of the parent class
    @Override
    public void speak() {
        System.out.println("Cat meows");
    }

    // Additional method specific to Cat
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

public class OOPConceptsExample1 {
    public static void main(String[] args) {
        // Polymorphism: Animal reference can hold objects of its subclasses
        Animal myPet1 = new Dog("Buddy", "Golden Retriever");
        Animal myPet2 = new Cat("Whiskers", true);

        // Method calls - polymorphism in action
        myPet1.speak(); // Calls Dog's overridden speak method
        myPet2.speak(); // Calls Cat's overridden speak method

        // Downcasting to access specific methods
        if (myPet1 instanceof Dog) {
            Dog myDog = (Dog) myPet1;
            myDog.fetch();
        }

        if (myPet2 instanceof Cat) {
            Cat myCat = (Cat) myPet2;
            myCat.sleep();
        }
    }
}