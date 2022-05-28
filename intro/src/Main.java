public class Main {

    public static void main(String[] args) {
        // Inheritance
        // Method Overriding
        Dog dog = new Dog("Spike");
        dog.speak();
        dog.eat();

        // Upcasting
        Creature creature = new Fish();
        creature.say();

        // Method Overloading
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.display(2022);
        methodOverloading.display(2022, 2023);
    }
}
