public class Animal {
    String name;

    public Animal() {
        System.out.println("I'm an animal");
    }
    // method in the superclass
    public void speak() {
        System.out.println("Hey! I can speak");
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super();
        super.name = name;
        System.out.println("My name is " + name);
    }

    // method in the subclass
    @Override
    public void speak() {
        System.out.println("Hey! I can bark");
    }

    public void eat() {
        System.out.println("I eat dog food");
    }
}